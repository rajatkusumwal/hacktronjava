/**
 * 
 */
package com.dbs.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.rest.dto.Queue;
import com.dbs.rest.service.QueueService;

/**
 * @author Srikanth 
 *
 */
@RestController
@RequestMapping(value = "/queue")
public class QueueController {
	
	@Autowired
	QueueService queueService;
	
	@RequestMapping("/test")
	public String message() {
		
		return "rajasekhar";
	}
	
	@RequestMapping(value = "/queue/", method = RequestMethod.GET)
    public List<Queue> listAllUsers() {
		
		List<Queue> queues = queueService.findAllQueues();
		
        //List<User> users = userService.findAllUsers();
        /*if(users.isEmpty()){
            return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);*/
		
		return queues;
    }
	
	
	@RequestMapping(value = "/queueone/", method = RequestMethod.GET)
    public List<Queue> listAllQueue() {
		
		List<Queue> queues = queueService.findAllQueuesOne();
		
        //List<User> users = userService.findAllUsers();
        /*if(users.isEmpty()){
            return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);*/
		
		return queues;
    }
	
	
	
	
	
	
	/*
	 @RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<User> getUser(@PathVariable("id") long id) {
	        System.out.println("Fetching User with id " + id);
	        User user = userService.findById(id);
	        if (user == null) {
	            System.out.println("User with id " + id + " not found");
	            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
	        }
	        return new ResponseEntity<User>(user, HttpStatus.OK);
	    }
	 
	 
	 @RequestMapping(value = "/user/", method = RequestMethod.POST)
	    public ResponseEntity<Void> createUser(@RequestBody User user,    UriComponentsBuilder ucBuilder) {
	        System.out.println("Creating User " + user.getUsername());
	 
	        if (userService.isUserExist(user)) {
	            System.out.println("A User with name " + user.getUsername() + " already exist");
	            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
	        }
	 
	        userService.saveUser(user);
	 
	        HttpHeaders headers = new HttpHeaders();
	        headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getId()).toUri());
	        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	    }
*/	 
	
	
	
	
	
	
	
	
}
