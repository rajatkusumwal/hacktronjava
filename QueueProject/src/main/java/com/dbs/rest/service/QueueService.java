/**
 * 
 */
package com.dbs.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dbs.rest.dto.Queue;

/**
 * @author Srikanth PC
 *
 */
public interface QueueService {


	public List<Queue> findAllQueues();
	
	public List<Queue> findAllQueuesOne();
	
}
