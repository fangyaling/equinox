/*******************************************************************************
 * Copyright (c) 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.osgi.container.tests.dummys;

import java.util.EnumSet;
import org.eclipse.osgi.container.*;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleException;

public class DummyModule extends Module {

	private final DummyModuleDatabase database;

	public DummyModule(Long id, String location, ModuleContainer container, DummyModuleDatabase database, EnumSet<Settings> settings, int startlevel) {
		super(id, location, container, settings, startlevel);
		this.database = database;
	}

	@Override
	public Bundle getBundle() {
		return null;
	}

	@Override
	protected void updateWorker(ModuleRevisionBuilder builder) throws BundleException {
		// Do nothing
	}

	@Override
	protected void cleanup(ModuleRevision revision) {
		// Do nothing
	}

}
