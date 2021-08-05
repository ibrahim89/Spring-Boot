package com.myhome.couchbasedemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

@Configuration
public class Config extends AbstractCouchbaseConfiguration {

	@Override
	public String getConnectionString() {

		return "couchbase://127.0.0.1";
	}

	@Override
	public String getUserName() {

		return "Administrator";
	}

	@Override
	public String getPassword() {

		return "1a2b4d21u12l";
	}

	@Override
	public String getBucketName() {

		return "schooldb";
	}

}
