package com.cem;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@SpringBootApplication
public class HomeAutomationApplication {
	
	
//	@Value("${spring.datasource.url}")
//	  private String dbUrl;


	public static void main(String[] args) {
		SpringApplication.run(HomeAutomationApplication.class, args);
	}
	
//	@Bean
//	  public DataSource dataSource() throws SQLException {
//	    if (dbUrl == null || dbUrl.isEmpty()) {
//	      return new HikariDataSource();
//	    } else {
//	      HikariConfig config = new HikariConfig();
//	      config.setJdbcUrl(dbUrl);
//	      return new HikariDataSource(config);
//	    }
//	  }
}
