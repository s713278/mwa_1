package net.mwa.vo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Entity
@Table(name = "MEMBER_DETAILS")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name="TYPE", discriminatorType=DiscriminatorType.STRING, length=20)
@DiscriminatorValue("INDEPENDENT")
@Data
@JsonIgnoreProperties(value = {"createdDate", "lastUpdate"}, allowGetters = true)
@EntityListeners(AuditingEntityListener.class)
public class MemberDetailsVO {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Long id;
	
	@ApiModelProperty(name="ownerFirstName",example="Chetan")
	@Column(name="OWNER_FIRST_NAME")
	@NotBlank
	private String ownerFirstName;
	
	@ApiModelProperty(name="ownerLastName",example="K")
	@Column(name="OWNER_LAST_NAME")
	@NotBlank
	private String ownerLastName;
	
	@ApiModelProperty(name="plotNo",example="MIG-973/L")
	@Column(name="HOUSE_NO")
	@NotBlank
	private String plotNo;
	
	@ApiModelProperty(name="emailID",example="mwa.abcde@gmail.com")
	@Column(name="EMAIL_ID")
	private String emailID;
	
	@ApiModelProperty(name="mobileNo",example="9848336109")
	@Column(name="MOBILE_NO")
	@NotBlank
	private String mobileNo;
	
	@ApiModelProperty(name="noOfFamilies",example="2")
	@Column(name="NO_OF_FAMILIES")
	private int noOfFamilies = 1;
	
	@Column(name="IS_ACTIVE")
	private boolean active;
	
	
	@Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdDate;
	
	@Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date lastUpdate;
}
