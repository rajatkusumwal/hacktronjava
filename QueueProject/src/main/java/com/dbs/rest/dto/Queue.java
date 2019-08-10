/**
 * 
 */
package com.dbs.rest.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Srikanth
 *
 */
@Entity
@Table(name = "Queue")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Queue {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "maxlimit")
	private String maxlimit;

	@Column(name = "creation_date")
	private String creation_date;

	@Column(name = "update_date")
	private String update_date;

	//@OneToMany(targetEntity=QueueMessage.class, mappedBy="QueueMessage")
//	private List<QueueMessage> queueMessage;

	public String getMaxlimit() {
		return maxlimit;
	}

	public void setMaxlimit(String maxlimit) {
		this.maxlimit = maxlimit;
	}

	public String getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(String creation_date) {
		this.creation_date = creation_date;
	}

	public String getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the queueMessage
	 */
//	public List<QueueMessage> getQueueMessage() {
//		return queueMessage;
//	}
//
//	/**
//	 * @param queueMessage the queueMessage to set
//	 */
//	public void setQueueMessage(List<QueueMessage> queueMessage) {
//		this.queueMessage = queueMessage;
//	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
