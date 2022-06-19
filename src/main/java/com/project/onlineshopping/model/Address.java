package com.project.onlineshopping.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.io.Serializable;

@Entity
@Table(name = "address")
@Getter
@Setter
@ToString
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@ManyToOne
	private User user;

	@Column(name = "address_line_one")
	@NotBlank(message = "Please Enter Address Line One!")
	private String addressLineOne;

	@Column(name = "address_line_two")
	@NotBlank(message = "Please Enter Address Line Two!")
	private String addressLineTwo;

	@Column(name = "city")
	@NotBlank(message = "Please Enter City!")
	private String city;

	@Column(name = "state")
	@NotBlank(message = "Please Enter City!")
	private String state;

	@Column(name = "country")
	@NotBlank(message = "Please Enter Country!")
	private String country;

	@Column(name = "postal_code")
	@NotBlank(message = "Please Enter Postal Code!")
	private String postalCode;

	@Column(name = "shipping")
	private boolean shipping;

	@Column(name = "billing")
	private boolean billing;

}
