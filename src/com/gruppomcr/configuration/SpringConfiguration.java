package com.gruppomcr.configuration;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfiguration {

	@Bean(name="corsFilter")
	@Scope(BeanDefinition.SCOPE_SINGLETON)
	public CORSFilter corsFilter(){
		CORSFilter corsFilter = new CORSFilter();
		return corsFilter;
	}
}
