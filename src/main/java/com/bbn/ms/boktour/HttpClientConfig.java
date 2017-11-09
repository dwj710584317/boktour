package com.bbn.ms.boktour;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.IdleConnectionEvictor;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HttpClientConfig {
	@Value("${httpClient.defaultMaxPerRoute}")
	public int defaultMaxPerRoute;
	@Value("${httpClient.maxTotal}")
	public int maxTotal;
	@Value("${httpClient.connectTimeout}")
	public int connectTimeout;
	@Value("${httpClient.connectionRequestTimeout}")
	public int connectionRequestTimeout;
	@Value("${httpClient.socketTimeout}")
	public int socketTimeout;
	@Value("${httpClient.staleConnectionCheckEnabled}")
	public boolean staleConnectionCheckEnabled;

	@Bean(destroyMethod="close")
	public HttpClientConnectionManager httpClientConnectionManager(){
		PoolingHttpClientConnectionManager connManager = new PoolingHttpClientConnectionManager();
		connManager.setMaxTotal(maxTotal);
		connManager.setDefaultMaxPerRoute(defaultMaxPerRoute);
		return connManager;
	}
	
	@Bean
	public HttpClientBuilder httpClientBuilder(){
		HttpClientBuilder builder = HttpClientBuilder.create();
		builder.setConnectionManager(httpClientConnectionManager());
		return builder;
	}
 
	@Bean
	public CloseableHttpClient httpClient() {
		return httpClientBuilder().build();
	}
 
	@Bean(destroyMethod="shutdown")
	public IdleConnectionEvictor idleConnectionEvictor() {
		return new IdleConnectionEvictor(httpClientConnectionManager(), 0, null);
	}
	
	@Bean
	public RequestConfig.Builder requestConfigBuilder() {
		RequestConfig.Builder builder = RequestConfig.custom();
		builder.setConnectTimeout(connectTimeout);
		builder.setConnectionRequestTimeout(connectionRequestTimeout);
		builder.setSocketTimeout(socketTimeout);
		builder.setStaleConnectionCheckEnabled(staleConnectionCheckEnabled);
		return builder;
	}
	
	@Bean
	public RequestConfig requestConfig(){
		return requestConfigBuilder().build();
	}
}