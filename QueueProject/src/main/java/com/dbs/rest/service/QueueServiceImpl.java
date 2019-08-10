/**
 * 
 */
package com.dbs.rest.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.rest.dto.Queue;

/**
 * @author Srikanth PC
 *
 */
@Service
@Transactional
public class QueueServiceImpl implements QueueService {

	@Autowired
	QueueRepository queueRepository;

	public void createQueue(Queue Queue) {
		// TODO Auto-generated method stub
		queueRepository.save(Queue);
	}

	public List<Queue> getQueue() {
		// TODO Auto-generated method stub
		return (List<Queue>) queueRepository.findAll();
	}

	public Queue update(Queue Queue, long l) {
		// TODO Auto-generated method stub
		return queueRepository.save(Queue);
	}


	@Override
	public Queue findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUserById(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Queue updatePartially(Queue queue, long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
