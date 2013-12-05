/*******************************************************************************
 * Copyright (c) 2003, 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.gef;

import org.eclipse.gef.internal.GEFMessages;

/**
 * This class contains UI strings (translated, if available) that clients can
 * use.
 * 
 * @author Eric Bordeau
 */
public class SharedMessages {

	/**
	 * The string "Page".
	 */
	public static String getFitAllAction_Label() {
		return GEFMessages.get().FitAllAction_Label;
	}

	/**
	 * The string "Width".
	 */
	public static String getFitWidthAction_Label() {
		return GEFMessages.get().FitWidthAction_Label;
	}

	/**
	 * The string "Height".
	 */
	public static String getFitHeightAction_Label() {
		return GEFMessages.get().FitHeightAction_Label;
	}
}
