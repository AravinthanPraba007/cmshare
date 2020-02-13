package com.fms.repo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import com.fms.model.Report;

import reactor.core.publisher.Flux;

@Repository
public interface ReportRepo extends ReactiveCrudRepository<Report,Integer>{

	
	Flux<Report> findAll();
	
}
