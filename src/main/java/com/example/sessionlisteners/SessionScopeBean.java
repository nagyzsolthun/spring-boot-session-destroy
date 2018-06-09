package com.example.sessionlisteners;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SessionScopeBean implements Serializable {
	
	private static final Logger LOG = LoggerFactory.getLogger(SessionScopeBean.class);
	
	private static final long serialVersionUID = 201806091147L;

	@PostConstruct
	public void init() {
		LOG.info("init");
	}
	
	@PreDestroy
	public void destroy() {
		LOG.info("destroy");
	}
	
	public void interaction() {
		LOG.info("interaction");
	}
	
}
