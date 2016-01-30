package org.sagebionetworks.file.proxy.module;

import org.sagebionetworks.file.proxy.filter.PreSignedUrlFilter;

import com.google.inject.servlet.ServletModule;

public class ApplicationServletModule extends ServletModule {

	public ApplicationServletModule() {
		// All calls must go through the pre-signed URL Filter.
		filter("/*").through(PreSignedUrlFilter.class);
	}

}