///**
// * 
// */
//package com.dbs.rest.dto;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
///**
// * @author Srikanth PC
// *
// */
//@Entity
//public class QueueConsumer {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int id;
//	
//	 `consume_id` INT NOT NULL auto_increment ,
//
//	  `msg_id` INT NULL,
//
//	  `creation_date` DATETIME NULL,
//
//	  PRIMARY KEY (`consume_id`),
//
//	FOREIGN KEY msg_id_fk (`msg_id`)
//
//	REFERENCES queue_msg(`msg_id`)
//
//}
