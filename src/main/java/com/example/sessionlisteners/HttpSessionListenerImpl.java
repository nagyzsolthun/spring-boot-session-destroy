package com.example.sessionlisteners;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HttpSessionListenerImpl implements HttpSessionListener {
	
	private static final Logger LOG = LoggerFactory.getLogger(HttpSessionListenerImpl.class);

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		LOG.info("session created");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		LOG.info("session destroyed");
	}
	
}
