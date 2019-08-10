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
@Service
public interface QueueService {
	
	

	public void createQueue(Queue queue);
    public List<Queue> getQueue();
    public Queue findById(long id);
		
    public Queue update(Queue queue, long l);
    public void deleteUserById(long id);
    public Queue updatePartially(Queue queue, long id);
	
}
