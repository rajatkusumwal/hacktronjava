/**
 * 
 */
package com.dbs.rest.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

/**
 * @author Srikanth PC
 *
 */
@Entity
@Table(name = "consume_msg")
public class QueueConsumer {
	
	@Id
	@GeneratedValue
	private int consumeId;
	private int messageId;
	@CreatedDate
	private Date creationDate;
	/**
	 * @return the consumeId
	 */
	public int getConsumeId() {
		return consumeId;
	}
	/**
	 * @param consumeId the consumeId to set
	 */
	public void setConsumeId(int consumeId) {
		this.consumeId = consumeId;
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
	/**
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}
	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	} 

}
