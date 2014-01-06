package com.vv;

import org.vertx.java.platform.Verticle;

public class XVert extends Verticle {
	
	SomeObject someObject = new SomeObject();
	
	@Override
	public void start() {
		container.logger().info("XVert number: "+someObject.number);
	}

}
