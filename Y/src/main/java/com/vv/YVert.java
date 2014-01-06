package com.vv;

import org.vertx.java.platform.Verticle;

public class YVert extends Verticle {

	SomeObject someObject = new SomeObject();
	
	@Override
	public void start() {
		container.logger().info("YVert number: "+someObject.number);
		
		container.deployModule("com.vv~Y~1.0-SNAPSHOT");
	}
	
}
