package com.app.pojo;



import java.util.Date;

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
@Table (name="task")
public class Task {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int taskId;
	@Column (name="task_decription")
	String taskDecription;
	@Column (name="task_number" , nullable=false)
	int taskNumber;
	@Column (name="status", nullable=false)
	int status;
	@Column (name="begin_date", nullable=false)
	Date beginDate;
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "check_id")
	Checklist checkId;
}
