package net.mwa.vo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "APARTMENT_REG")
@DiscriminatorValue("APARTMENT")
public class ApartmentReg extends MemberReg {

	private String aprtmentName;
	
	private String presedentFirstName;
	
	private String presedentLastName;
	
	private String presedentMobileNo;
	
	private String secreteryFirstName;
	
	private String secreteryLastName;
	
	private String secreteryMobileNo;
	
}