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

	public User(int userId, String username, String password, String fname, String lname, String email, String phone,
			Team team) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
		this.team = team;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
}
