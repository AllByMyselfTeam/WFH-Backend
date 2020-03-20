package com.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Entity
@Table (name="user")
public class User {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column (name="user_id")
	int userId;
	@Column (name="username", nullable=false)
	String username;
	@Column (name="password", nullable=false)
	String password;
	@Column (name="fname", nullable=false)
	String fname;
	@Column (name="lname", nullable=false)
	String lname;
	@Column (name="email", nullable=false)
	String email;
	@Column (name="phone", nullable=false)
	String phone;
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
	Team team;

}
