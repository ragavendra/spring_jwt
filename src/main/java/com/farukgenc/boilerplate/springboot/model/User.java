package com.farukgenc.boilerplate.springboot.model;

import lombok.*;

import javax.persistence.*;

/**
 * Created on Ağustos, 2020
 *
 * @author Faruk
 */
@Getter
@Setter
@Entity
@Builder
// @NoArgsConstructor
@AllArgsConstructor
@Table(name = "USERS")
public class User {

	User() {
	}

	public User(String name, String username, String password, String email, UserRole userRole) {
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.userRole = userRole;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@Column(unique = true)
	private String username;

	private String password;

	private String email;

	@Enumerated(EnumType.STRING)
	private UserRole userRole;

}
