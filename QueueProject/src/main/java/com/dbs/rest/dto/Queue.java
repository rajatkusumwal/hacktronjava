/**
 * 
 */
package com.dbs.rest.dto;

import java.util.List;

/**
 * @author Srikanth 
 *
 */

public class Queue {
	
	private long id;
	
	private String username;
	
	private String address;
	
	private String email;
	
	
	public int getMaxLimit() {
		return maxLimit;
	}

	public void setMaxLimit(int maxLimit) {
		this.maxLimit = maxLimit;
	}
	private int maxLimit;
	
	public Queue(){
		id=0;
	}
	
	public Queue(long id, String username, String address, String email){
		this.id = id;
		this.username = username;
		this.address = address;
		this.email = email;
	}	
	private String name;
	private List<QueueMessage> queueMessage;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<QueueMessage> getQueueMessage() {
		return queueMessage;
	}

	public void setQueueMessage(List<QueueMessage> queueMessage) {
		this.queueMessage = queueMessage;
	}

	@Override
	public String toString() {
		return "Queue [id=" + id + ", username=" + username + ", address=" + address + ", email=" + email + ", name="
				+ name + ", queueMessage=" + queueMessage + "]";
	}
	
	

	

}
