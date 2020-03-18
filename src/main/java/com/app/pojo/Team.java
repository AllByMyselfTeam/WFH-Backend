package com.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table (name="team")
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int teamId;
	@Column (name="teamname", nullable=false)
	String teamName;
	@Column (name="username", nullable=false)
	int managerId;
}
