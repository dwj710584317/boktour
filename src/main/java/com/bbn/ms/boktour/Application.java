/*
 * Copyright 2012-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bbn.ms.boktour;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.bbn.ms.boktour.web.BoktourTask;

@EnableAutoConfiguration
@ComponentScan
@Controller
@EnableScheduling
public class Application extends WebMvcConfigurerAdapter {

	public static void main(String[] args) throws Exception {
		// Set user password to "password" for demo purposes only
		new SpringApplicationBuilder(Application.class).properties(
				"security.user.password=password").run(args);
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/login").setViewName("login");
	}

//	@Bean
//	public ApplicationSecurity applicationSecurity() {
//		return new ApplicationSecurity();
//	}
//
//	@Order(Ordered.LOWEST_PRECEDENCE - 8)
//	protected static class ApplicationSecurity extends WebSecurityConfigurerAdapter {
//		@Override
//		protected void configure(HttpSecurity http) throws Exception {
//			http.authorizeRequests().anyRequest().fullyAuthenticated().and().formLogin()
//					.loginPage("/login").failureUrl("/login?error").permitAll();
//		}
//	}
	
	@Bean
	public BoktourTask task() {
		return new BoktourTask();
	}
	
	@Bean
	public BoktourSource boktourSource() {
		return new BoktourSource();
	}
	

}
