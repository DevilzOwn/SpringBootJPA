package nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Table(name="ADDRESS")
public class Address {
	@Id
	@GeneratedValue
	@Column(name = "address_id")
	private long addressId;

	@Column(name = "house_no")
	private int houseNumber;

	@Column(name = "apartment")
	private String apartment;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "pincode")
	private long pincode;
}
