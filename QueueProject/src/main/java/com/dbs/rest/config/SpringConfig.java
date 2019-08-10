/**
 * 
 */
package com.dbs.rest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author Srikanth PC
 *
 */
@Configuration
public class SpringConfig {

	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate();
	}
	
	

}
