package com.mini.domain;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

import com.couchbase.client.java.repository.annotation.Field;

public class BusDetail {
	
	public BusDetail() {

	}
	
    @NotNull
    @Field
    @Id
	private String busNo;
	
    @NotNull
    @Field
	private String route;
	
    @NotNull
    @Field
	private String busDescription;
	
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public String getBusDescription() {
		return busDescription;
	}
	public void setBusDescription(String busDescription) {
		this.busDescription = busDescription;
	}

}
