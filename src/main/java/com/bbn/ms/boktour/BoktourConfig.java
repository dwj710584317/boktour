package com.bbn.ms.boktour;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
public class BoktourConfig {
	@Value("${boktour.api.proxyEnabled}")
	private boolean proxyEnabled;
	@Value("${boktour.api.proxyBaseUri}")
	private String proxyBaseUri;
	@Value("${boktour.api.UserName}")
	private String username;
	@Value("${boktour.api.PassWord}")
	private String password;
	@Value("${boktour.api.baseUri}")
	private String baseUri;

	@Bean
	public BoktourSource boktourSource() {
		return new BoktourSource(username, password, baseUri, proxyEnabled,
				proxyBaseUri);
	}

	@Bean
	public PropertySourcesPlaceholderConfigurer placehodlerConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

}