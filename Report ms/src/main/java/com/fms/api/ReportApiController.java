package com.fms.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fms.model.Report;
import com.fms.repo.ReportRepo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import java.util.Optional;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-28T10:54:49.918+05:30[Asia/Calcutta]")
@Controller
public class ReportApiController implements ReportApi {

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    @org.springframework.beans.factory.annotation.Autowired
    public ReportApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    @Override
    public Optional<ObjectMapper> getObjectMapper() {
        return Optional.ofNullable(objectMapper);
    }

    @Override
    public Optional<HttpServletRequest> getRequest() {
        return Optional.ofNullable(request);
    }
    
    @Autowired
    ReportRepo repo;
    
    @GetMapping(value="/rep")
    public Flux<Report> findReports(){
    	return repo.findAll();
    }
    
    @PostMapping(value="/add")
    public Mono<Report> addreport(@RequestBody Report addreport){
    	return repo.save(addreport);
    }
}
