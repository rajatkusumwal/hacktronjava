/**
 * 
 */
package com.dbs.rest.dto;

import java.util.List;

import javax.persistence.Entity;

/**
 * @author Srikanth 
 *
 */
@Entity
public class Queue {
	
	private int id;
	private String name;
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
