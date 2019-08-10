
package com.dbs.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.dbs.rest.dto.Queue;
import com.dbs.rest.service.QueueService;

/**
 * @author Srikanth
 *
 */
@RestController
@RequestMapping(value = { "/Queue" })
public class QueueController {

	@Autowired
	QueueService queueService;

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Queue> getQueueById(@PathVariable("id") long id) {
		System.out.println("Fetching Queue with id " + id);
		Queue Queue = queueService.findById(id);
		if (Queue == null) {
			return new ResponseEntity<Queue>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Queue>(Queue, HttpStatus.OK);
	}

	@PostMapping(value = "/create", headers = "Accept=application/json")
	public ResponseEntity<Void> createQueue(@RequestBody Queue Queue, UriComponentsBuilder ucBuilder) {
		System.out.println("Creating Queue " + Queue.getName());
		queueService.createQueue(Queue);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/Queue/{id}").buildAndExpand(Queue.getId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@GetMapping(value = "/get", headers = "Accept=application/json")
	public List<Queue> getAllQueue() {
		List<Queue> tasks = queueService.getQueue();
		return tasks;

	}

	@PutMapping(value = "/update", headers = "Accept=application/json")
	public ResponseEntity<String> updateQueue(@RequestBody Queue currentQueue) {
		System.out.println("sd");
		Queue Queue = queueService.findById(currentQueue.getId());
		if (Queue == null) {
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
		queueService.update(currentQueue, currentQueue.getId());
		return new ResponseEntity<String>(HttpStatus.OK);
	}

	@DeleteMapping(value = "/{id}", headers = "Accept=application/json")
	public ResponseEntity<Queue> deleteQueue(@PathVariable("id") long id) {
		Queue Queue = queueService.findById(id);
		if (Queue == null) {
			return new ResponseEntity<Queue>(HttpStatus.NOT_FOUND);
		}
		// QueueService.deleteUserById(id);
		return new ResponseEntity<Queue>(HttpStatus.NO_CONTENT);
	}

	@PatchMapping(value = "/{id}", headers = "Accept=application/json")
	public ResponseEntity<Queue> updateQueuePartially(@PathVariable("id") long id, @RequestBody Queue currentQueue) {
		Queue Queue = queueService.findById(id);
		if (Queue == null) {
			return new ResponseEntity<Queue>(HttpStatus.NOT_FOUND);
		}
		Queue usr = queueService.updatePartially(currentQueue, id);
		return new ResponseEntity<Queue>(usr, HttpStatus.OK);
	}

}