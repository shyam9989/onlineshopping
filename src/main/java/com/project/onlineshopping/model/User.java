package com.project.onlineshopping.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.io.Serializable;

@Entity
@Table(name = "user_detail")
@ToString
@Getter
@Setter
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "first_name")
	@NotBlank(message = "Please Enter First Name!")
	private String firstName;

	@Column(name = "last_name")
	@NotBlank(message = "Please Enter Last Name!")
	private String lastName;

	@Column(name = "email", unique = true)
	private String email;

	@Column(name = "contact_number")
	@NotBlank(message = "Please Enter Contact number!")
	private String contactNumber;

	@Column(name = "role")
	private String role;

	@Column(name = "password")
	@NotBlank(message = "Please Enter Password for Login!")
	private String password;

	@Transient
	private String confirmPassword;

	@Column(name = "enabled")
	private boolean enabled = true;

	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	private Cart cart;

}
