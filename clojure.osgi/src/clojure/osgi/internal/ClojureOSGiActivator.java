package clojure.osgi.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class ClojureOSGiActivator implements BundleActivator {

	private static BundleContext s_Context;

	public static BundleContext getContext() {
		return s_Context;
	}

	public void start(BundleContext context) throws Exception {
		s_Context = context;
	}

	public void stop(BundleContext context) throws Exception {
		s_Context = null;
	}
}
