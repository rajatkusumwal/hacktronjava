/**
 * 
 */
package com.dbs.rest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dbs.rest.dao.SpringDao;
import com.dbs.rest.dto.Queue;


@Service("QueueService")
public class QueueServiceImpl implements QueueService{
	
private static final AtomicLong counter = new AtomicLong();
	
	@Autowired
	SpringDao dao;
	
	private static List<Queue> queues;
	
	static{
		queues= populateDummyUsers();
	}

	
	public List<Queue> findAllQueues(){
		
		
		return queues;
	}
	
	public List<Queue> findAllQueuesOne(){
		
		List<Queue> queues = dao.isData(); 
		
		return queues;
	}
	

	private static List<Queue> populateDummyUsers(){
		List<Queue> users = new ArrayList<Queue>();
		users.add(new Queue(counter.incrementAndGet(),"Sam", "NY", "sam@abc.com"));
		users.add(new Queue(counter.incrementAndGet(),"Tomy", "ALBAMA", "tomy@abc.com"));
		users.add(new Queue(counter.incrementAndGet(),"Kelly", "NEBRASKA", "kelly@abc.com"));
		return users;
	}
	
	
}
