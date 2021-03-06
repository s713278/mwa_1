package net.mwa.vo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "commercial_details")
@DiscriminatorValue("COMMERCIAL")
public class CommercialVO extends UserDetailsVO {

	@Column(name="BUSINESS_NAME")
	private String businessName;
	
	@Column(name="TYPE_OF_BUSINESS")
	private String typeOfBusiness;
	
	@Column(name="BUSINESS_LOGO_PATH")
	private String businessLogoPath;
	
	@Column(name="WEBSITE")
	private String webSite;
	
	@Column(name="WHATS_APP_NO")
	private String whatsAppNo;
}
