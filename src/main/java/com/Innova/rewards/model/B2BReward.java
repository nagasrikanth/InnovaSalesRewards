package com.Innova.rewards.model;

import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonInclude;

public abstract class B2BReward {

	@JsonInclude  
	@Transient    
	protected Long points;

	public abstract Long getPoints();

}
