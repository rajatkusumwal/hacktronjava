/**
 * 
 */
package com.dbs.rest.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Srikanth 
 *
 */
@Entity
@Table(name = "queue")
public class Queue {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	@OneToMany(cascade = CascadeType.ALL)
	private List<QueueMessage> queueMessage;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the queueMessage
	 */
	public List<QueueMessage> getQueueMessage() {
		return queueMessage;
	}
	/**
	 * @param queueMessage the queueMessage to set
	 */
	public void setQueueMessage(List<QueueMessage> queueMessage) {
		this.queueMessage = queueMessage;
	}
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
