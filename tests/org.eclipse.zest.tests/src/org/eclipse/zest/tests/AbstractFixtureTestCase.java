package org.eclipse.zest.tests;

import junit.framework.TestCase;

import org.eclipse.rap.rwt.testfixture.Fixture;
import org.eclipse.swt.widgets.Display;

public abstract class AbstractFixtureTestCase extends TestCase {

	protected Display display;

	public AbstractFixtureTestCase() {
		super();
	}

	public AbstractFixtureTestCase(String name) {
		super(name);
	}

	/**
	 * @see TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		Fixture.setUp();
		display = new Display();
	}

	/**
	 * @see TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		Fixture.tearDown();
	}

}
