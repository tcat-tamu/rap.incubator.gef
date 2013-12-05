/*******************************************************************************
 * Copyright (c) 2004, 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.draw2d.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;

/**
 * @author Pratik Shah
 */
public abstract class BaseTestCase extends AbstractFixtureTestCase {

	protected Font TAHOMA = null;

	public BaseTestCase() {
		super();
	}

	public BaseTestCase(String text) {
		super(text);
	}

	protected void setUp() throws Exception {
		super.setUp();
		TAHOMA = new Font(display, "Tahoma", 8, 0);
	}

	protected boolean callBooleanMethod(Object receiver, String method) {
		try {
			Method m = receiver.getClass().getMethod(method, null);
			Boolean result = (Boolean) m.invoke(receiver, null);
			return result.booleanValue();
		} catch (NoSuchMethodException exc) {
			fail(exc.getMessage());
		} catch (IllegalAccessException exc) {
			fail(exc.getMessage());
		} catch (InvocationTargetException exc) {
			fail(exc.getMessage());
		}
		return false;
	}

	public void assertEquals(Image expected, Image actual) {
		assertTrue(
				"The given images did not match",
				Arrays.equals(expected.getImageData().data,
						actual.getImageData().data));
	}
}
