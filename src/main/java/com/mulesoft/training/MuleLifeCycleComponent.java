package com.mulesoft.training;

import org.mule.api.MuleEventContext;
import org.mule.api.MuleException;
import org.mule.api.lifecycle.Callable;
import org.mule.api.lifecycle.Startable;

public class MuleLifeCycleComponent implements Startable, Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		System.out.println("LifeCycle java component triggered..........");
		return eventContext.getMessage();
	}

	@Override
	public void start() throws MuleException {
	System.out.println("LifeCycle java component started.............");

	}

}
