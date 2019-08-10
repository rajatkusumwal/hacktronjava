/**
 * 
 */
package com.dbs.rest.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Srikanth
 *
 */
@Entity
@Table(name = "queue_msg")
public class QueueMessage {
	
	@Id
	@GeneratedValue
	private int queueId;
	private String message;
	@GeneratedValue
	private int messageId;
	/**
	 * @return the queueId
	 */
	public int getQueueId() {
		return queueId;
	}
	/**
	 * @param queueId the queueId to set
	 */
	public void setQueueId(int queueId) {
		this.queueId = queueId;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the messageId
	 */
	public int getMessageId() {
		return messageId;
	}
	/**
	 * @param messageId the messageId to set
	 */
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

}
