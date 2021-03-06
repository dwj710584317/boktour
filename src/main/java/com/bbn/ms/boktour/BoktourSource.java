package com.bbn.ms.boktour;

import org.springframework.beans.factory.annotation.Value;


public class BoktourSource {
	public static final String USERNAME_KEY = "UserName";
	public static final String PASSWORD_KEY = "PassWord";

	@Value("${boktourSource.proxyEnabled}")
	private boolean proxyEnabled;
	@Value("${boktourSource.proxyBaseUri}")
	private String proxyBaseUri;
	@Value("${boktourSource.username}")
	private String username;
	@Value("${boktourSource.password}")
	private String password;
	@Value("${boktourSource.baseUri}")
	private String baseUri;

	public BoktourSource() {
		this("", "", "");
	}

	public BoktourSource(String username, String password, String baseUri) {
		this(username, password, baseUri, false, null);
	}
	
	public BoktourSource(String username, String password, String baseUri, boolean proxyEnabled, String proxyBaseUri) {
		this.username = username;
		this.password = password;
		this.baseUri = baseUri;
		this.proxyEnabled = proxyEnabled;
		this.proxyBaseUri = proxyBaseUri;
	}
	
	public boolean isProxyEnabled() {
		return proxyEnabled;
	}

	public void setProxyEnabled(boolean proxyEnabled) {
		this.proxyEnabled = proxyEnabled;
	}

	public String getProxyBaseUri() {
		return proxyBaseUri;
	}

	public void setProxyBaseUri(String proxyBaseUri) {
		this.proxyBaseUri = proxyBaseUri;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBaseUri() {
		return baseUri;
	}

	public void setBaseUri(String baseUri) {
		this.baseUri = baseUri;
	}

	public String getFinalBaseUri() {
		String base = this.proxyEnabled ? this.proxyBaseUri : this.baseUri;
		if (base.endsWith("/")) {
			base = base.substring(0, base.length() - 2);
		}
		return base;
	}


}
