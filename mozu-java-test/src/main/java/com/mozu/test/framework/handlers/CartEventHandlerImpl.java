package com.mozu.test.framework.handlers;

import com.mozu.api.ApiContext;
import com.mozu.api.contracts.event.Event;
import com.mozu.api.events.handlers.CartEventHandler;
import com.mozu.api.events.model.EventHandlerStatus;

public class CartEventHandlerImpl implements CartEventHandler {

	@Override
	public EventHandlerStatus created(ApiContext apiContext, Event event) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EventHandlerStatus deleted(ApiContext apiContext, Event event) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EventHandlerStatus updated(ApiContext apiContext, Event event) {
		// TODO Auto-generated method stub
		return null;
	}

}