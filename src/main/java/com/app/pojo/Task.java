package com.app.pojo;



import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class Task implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int taskId;
	@Column (name="task_Description")
	String taskDescription;
	@Column (name="task_number")
	int taskNumber;
	@Column (name="status", nullable=false)
	int status;
	@Column (name="begin_date")
	Date beginDate;
	@Column (name="cid" , nullable=false)
	int cid;
}
