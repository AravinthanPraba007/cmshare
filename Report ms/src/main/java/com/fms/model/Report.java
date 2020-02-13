package com.fms.model;

import java.util.Date;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.validation.annotation.Validated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Report
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-28T10:54:49.918+05:30[Asia/Calcutta]")
@Table("example")
public class Report   {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  @JsonProperty("EventId")
  private String eventId = null;

  @JsonProperty("Month")
  private String month = null;

  @JsonProperty("BaseLocation")
  private String baseLocation = null;

  @JsonProperty("CouncilName")
  private String councilName = null;

  @JsonProperty("BeneficiaryName")
  private String beneficiaryName = null;

  @JsonProperty("EventName")
  private String eventName = null;

  @JsonProperty("EventDate")
  private Date eventDate = null;

  @JsonProperty("BusinessUnit")
  private String businessUnit = null;

  @JsonProperty("Status")
  private String status = null;

  @JsonProperty("VenueAddress")
  private String venueAddress = null;

  @JsonProperty("TotalVolunteers")
  private Integer totalVolunteers = null;

  @JsonProperty("TotalVolunteerHours")
  private Integer totalVolunteerHours = null;

  @JsonProperty("TotalTravelHours")
  private Integer totalTravelHours = null;

  public Report eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Get eventId
   * @return eventId
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public Report month(String month) {
    this.month = month;
    return this;
  }

  /**
   * Get month
   * @return month
  **/
  @ApiModelProperty(example = "January", required = true, value = "")
      @NotNull

    public String getMonth() {
    return month;
  }

  public void setMonth(String month) {
    this.month = month;
  }

  public Report baseLocation(String baseLocation) {
    this.baseLocation = baseLocation;
    return this;
  }

  /**
   * Get baseLocation
   * @return baseLocation
  **/
  @ApiModelProperty(example = "United Kingdom", required = true, value = "")
      @NotNull

    public String getBaseLocation() {
    return baseLocation;
  }

  public void setBaseLocation(String baseLocation) {
    this.baseLocation = baseLocation;
  }

  public Report councilName(String councilName) {
    this.councilName = councilName;
    return this;
  }

  /**
   * Get councilName
   * @return councilName
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getCouncilName() {
    return councilName;
  }

  public void setCouncilName(String councilName) {
    this.councilName = councilName;
  }

  public Report beneficiaryName(String beneficiaryName) {
    this.beneficiaryName = beneficiaryName;
    return this;
  }

  /**
   * Get beneficiaryName
   * @return beneficiaryName
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getBeneficiaryName() {
    return beneficiaryName;
  }

  public void setBeneficiaryName(String beneficiaryName) {
    this.beneficiaryName = beneficiaryName;
  }

  public Report eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

  /**
   * Get eventName
   * @return eventName
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public Report eventDate(Date eventDate) {
    this.eventDate = eventDate;
    return this;
  }

  /**
   * Get eventDate
   * @return eventDate
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Date getEventDate() {
    return eventDate;
  }

  public void setEventDate(Date eventDate) {
    this.eventDate = eventDate;
  }

  public Report businessUnit(String businessUnit) {
    this.businessUnit = businessUnit;
    return this;
  }

  /**
   * Get businessUnit
   * @return businessUnit
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getBusinessUnit() {
    return businessUnit;
  }

  public void setBusinessUnit(String businessUnit) {
    this.businessUnit = businessUnit;
  }

  public Report status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Report venueAddress(String venueAddress) {
    this.venueAddress = venueAddress;
    return this;
  }

  /**
   * Get venueAddress
   * @return venueAddress
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getVenueAddress() {
    return venueAddress;
  }

  public void setVenueAddress(String venueAddress) {
    this.venueAddress = venueAddress;
  }

  public Report totalVolunteers(Integer totalVolunteers) {
    this.totalVolunteers = totalVolunteers;
    return this;
  }

  /**
   * Get totalVolunteers
   * @return totalVolunteers
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Integer getTotalVolunteers() {
    return totalVolunteers;
  }

  public void setTotalVolunteers(Integer totalVolunteers) {
    this.totalVolunteers = totalVolunteers;
  }

  public Report totalVolunteerHours(Integer totalVolunteerHours) {
    this.totalVolunteerHours = totalVolunteerHours;
    return this;
  }

  /**
   * Get totalVolunteerHours
   * @return totalVolunteerHours
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Integer getTotalVolunteerHours() {
    return totalVolunteerHours;
  }

  public void setTotalVolunteerHours(Integer totalVolunteerHours) {
    this.totalVolunteerHours = totalVolunteerHours;
  }

  public Report totalTravelHours(Integer totalTravelHours) {
    this.totalTravelHours = totalTravelHours;
    return this;
  }

  /**
   * Get totalTravelHours
   * @return totalTravelHours
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Integer getTotalTravelHours() {
    return totalTravelHours;
  }

  public void setTotalTravelHours(Integer totalTravelHours) {
    this.totalTravelHours = totalTravelHours;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Report report = (Report) o;
    return Objects.equals(this.eventId, report.eventId) &&
        Objects.equals(this.month, report.month) &&
        Objects.equals(this.baseLocation, report.baseLocation) &&
        Objects.equals(this.councilName, report.councilName) &&
        Objects.equals(this.beneficiaryName, report.beneficiaryName) &&
        Objects.equals(this.eventName, report.eventName) &&
        Objects.equals(this.eventDate, report.eventDate) &&
        Objects.equals(this.businessUnit, report.businessUnit) &&
        Objects.equals(this.status, report.status) &&
        Objects.equals(this.venueAddress, report.venueAddress) &&
        Objects.equals(this.totalVolunteers, report.totalVolunteers) &&
        Objects.equals(this.totalVolunteerHours, report.totalVolunteerHours) &&
        Objects.equals(this.totalTravelHours, report.totalTravelHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, month, baseLocation, councilName, beneficiaryName, eventName, eventDate, businessUnit, status, venueAddress, totalVolunteers, totalVolunteerHours, totalTravelHours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Report {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    baseLocation: ").append(toIndentedString(baseLocation)).append("\n");
    sb.append("    councilName: ").append(toIndentedString(councilName)).append("\n");
    sb.append("    beneficiaryName: ").append(toIndentedString(beneficiaryName)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    businessUnit: ").append(toIndentedString(businessUnit)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    venueAddress: ").append(toIndentedString(venueAddress)).append("\n");
    sb.append("    totalVolunteers: ").append(toIndentedString(totalVolunteers)).append("\n");
    sb.append("    totalVolunteerHours: ").append(toIndentedString(totalVolunteerHours)).append("\n");
    sb.append("    totalTravelHours: ").append(toIndentedString(totalTravelHours)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
