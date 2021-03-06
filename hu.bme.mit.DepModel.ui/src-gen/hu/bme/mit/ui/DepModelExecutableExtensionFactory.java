/*
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.ui;

import com.google.inject.Injector;
import hu.bme.mit.DepModel.ui.internal.DepModelActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DepModelExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return DepModelActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return DepModelActivator.getInstance().getInjector(DepModelActivator.HU_BME_MIT_DEPMODEL);
	}
	
}
