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
@Table (name="meeting")
public class Meeting {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int meetId;
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
	Team team;
	@Column (name="meet_description", nullable=false)
	String meetDecription;
	@Column (name="meet_link", nullable=false)
	String meetLink;
}
