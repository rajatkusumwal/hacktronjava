package com.dbs.rest.service;

import org.springframework.data.repository.CrudRepository;

import com.dbs.rest.dto.Queue;

public interface QueueRepository extends CrudRepository<Queue, Long> {

}