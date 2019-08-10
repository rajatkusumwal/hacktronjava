/**
 * 
 */
package com.dbs.rest.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Srikanth
 *
 */
@Entity
@Table(name = "queue_msg")
//@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class QueueMessage {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int msg_id;

	@Column(name = "message")
	private int message;

	@Column(name = "queue_id")
	private String queue_id;

	@Column(name = "creation_date")
	private String creationDate;

//	@Column(name = "queue_id")
//	private String queueId;

	public int getMsg_id() {
		return msg_id;
	}

	public void setMsg_id(int msg_id) {
		this.msg_id = msg_id;
	}

	public int getMessage() {
		return message;
	}

	public void setMessage(int message) {
		this.message = message;
	}

	public String getQueue_id() {
		return queue_id;
	}

	public void setQueue_id(String queue_id) {
		this.queue_id = queue_id;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

//	public String getQueueId() {
//		return queueId;
//	}
//
//	public void setQueueId(String queueId) {
//		this.queueId = queueId;
//	}

}
