package com.cem;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	// @Override
	// protected void configure(HttpSecurity http) throws Exception {
	// http.csrf().disable().authorizeRequests().antMatchers("/").permitAll()
	// .antMatchers("/db").hasAnyRole("ADMIN").anyRequest().authenticated()
	// .and().httpBasic();
	// }
	//
	// @Override
	// public void configure(AuthenticationManagerBuilder auth) throws Exception {
	// auth.inMemoryAuthentication().withUser("adminUser").password("adminUserPassword").roles("ADMIN")
	// .and().withUser("standartUser").password("standartUserPassword").roles("USER");
	// }
	
	@Value("${home-automation.security.username}")
	private String username;
	
	@Value("${home-automation.security.password}")
	private String password;

	@Bean
	public UserDetailsService userDetailsService() {
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
		manager.createUser(User.withDefaultPasswordEncoder().username(username).password(password).roles("USER").build());
		return manager;
	}
}