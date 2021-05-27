package com.app.insurance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "policies")
public class Policy {

	@Id
	@SequenceGenerator(name="pol_seq",sequenceName="pol_seq",allocationSize = 1)        
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="pol_seq") 
	//@GeneratedValue
	@Column(name = "policy_id")
	private int policyId;
	@Column(name = "policy_name")
	private String policyName;
	@Column(name = "duration")
	private int duration;
	@Column(name = "amount")
	private float premiumAmount;
	@Column(name = "policy_type")
	private String policyType;
	@Column(name = "policy_desc")
	private String description;
	
	public Policy() {
		// TODO Auto-generated constructor stub
	}

	public Policy(int policyId, String policyName, int duration, float premiumAmount, String policyType,
			String description) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.duration = duration;
		this.premiumAmount = premiumAmount;
		this.policyType = policyType;
		this.description = description;
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public float getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(float premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
