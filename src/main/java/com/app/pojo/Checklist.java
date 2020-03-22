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
@Table (name="checklist")
public class Checklist {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int checkId;
	@Column (name="check_title", nullable=false)
	String checkTitle;
	@Column (name="check_decription", nullable=true)
	String checkDescription;
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user")
	User user;
}
