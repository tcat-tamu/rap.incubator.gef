/*******************************************************************************
 * Copyright (c) 2000, 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.draw2d;

import org.eclipse.draw2d.rap.swt.graphics.ColorUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

/**
 * A collection of color-related constants.
 */
public interface ColorConstants {

	class SystemColorFactory {
		private static Color getColor(final int which) {
			Display display = Display.getCurrent();
			if (display != null)
				return display.getSystemColor(which);
			display = Display.getDefault();
			final Color result[] = new Color[1];
			display.syncExec(new Runnable() {
				public void run() {
					synchronized (result) {
						result[0] = Display.getCurrent().getSystemColor(which);
					}
				}
			});
			synchronized (result) {
				return result[0];
			}
		}
	}

	/**
	 * @see SWT#COLOR_WIDGET_HIGHLIGHT_SHADOW
	 */
	Color buttonLightest = SystemColorFactory
			.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW);
	/**
	 * @see SWT#COLOR_WIDGET_BACKGROUND
	 */
	Color button = SystemColorFactory.getColor(SWT.COLOR_WIDGET_BACKGROUND);
	/**
	 * @see SWT#COLOR_WIDGET_NORMAL_SHADOW
	 */
	Color buttonDarker = SystemColorFactory
			.getColor(SWT.COLOR_WIDGET_NORMAL_SHADOW);
	/**
	 * @see SWT#COLOR_WIDGET_DARK_SHADOW
	 */
	Color buttonDarkest = SystemColorFactory
			.getColor(SWT.COLOR_WIDGET_DARK_SHADOW);

	/**
	 * @see SWT#COLOR_LIST_BACKGROUND
	 */
	Color listBackground = SystemColorFactory
			.getColor(SWT.COLOR_LIST_BACKGROUND);
	/**
	 * @see SWT#COLOR_LIST_FOREGROUND
	 */
	Color listForeground = SystemColorFactory
			.getColor(SWT.COLOR_LIST_FOREGROUND);

	/**
	 * @see SWT#COLOR_WIDGET_BACKGROUND
	 */
	Color menuBackground = SystemColorFactory
			.getColor(SWT.COLOR_WIDGET_BACKGROUND);
	/**
	 * @see SWT#COLOR_WIDGET_FOREGROUND
	 */
	Color menuForeground = SystemColorFactory
			.getColor(SWT.COLOR_WIDGET_FOREGROUND);
	/**
	 * @see SWT#COLOR_LIST_SELECTION
	 */
	Color menuBackgroundSelected = SystemColorFactory
			.getColor(SWT.COLOR_LIST_SELECTION);
	/**
	 * @see SWT#COLOR_LIST_SELECTION_TEXT
	 */
	Color menuForegroundSelected = SystemColorFactory
			.getColor(SWT.COLOR_LIST_SELECTION_TEXT);

	/**
	 * @see SWT#COLOR_TITLE_BACKGROUND
	 */
	Color titleBackground = SystemColorFactory
			.getColor(SWT.COLOR_TITLE_BACKGROUND);
	/**
	 * @see SWT#COLOR_TITLE_BACKGROUND_GRADIENT
	 */
	Color titleGradient = SystemColorFactory
			.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT);
	/**
	 * @see SWT#COLOR_TITLE_FOREGROUND
	 */
	Color titleForeground = SystemColorFactory
			.getColor(SWT.COLOR_TITLE_FOREGROUND);
	/**
	 * @see SWT#COLOR_TITLE_INACTIVE_FOREGROUND
	 */
	Color titleInactiveForeground = SystemColorFactory
			.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND);
	/**
	 * @see SWT#COLOR_TITLE_INACTIVE_BACKGROUND
	 */
	Color titleInactiveBackground = SystemColorFactory
			.getColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND);
	/**
	 * @see SWT#COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT
	 */
	Color titleInactiveGradient = SystemColorFactory
			.getColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT);

	/**
	 * @see SWT#COLOR_INFO_FOREGROUND
	 */
	Color tooltipForeground = SystemColorFactory
			.getColor(SWT.COLOR_INFO_FOREGROUND);
	/**
	 * @see SWT#COLOR_INFO_BACKGROUND
	 */
	Color tooltipBackground = SystemColorFactory
			.getColor(SWT.COLOR_INFO_BACKGROUND);

	/*
	 * Misc. colors
	 */
	//[RAP AM] remove statics
	/** One of the pre-defined colors */
	Color white = ColorUtil.getColor(255);//new Color(null, 255, 255, 255);
	/** One of the pre-defined colors */
	Color lightGray = ColorUtil.getColor(192);//new Color(null, 192, 192, 192);
	/** One of the pre-defined colors */
	Color gray = ColorUtil.getColor(128);//new Color(null, 128, 128, 128);
	/** One of the pre-defined colors */
	Color darkGray = ColorUtil.getColor(64);//new Color(null, 64, 64, 64);
	/** One of the pre-defined colors */
	Color black = ColorUtil.getColor(0);//new Color(null, 0, 0, 0);
	/** One of the pre-defined colors */
	Color red = ColorUtil.getColor(255,0,0);//new Color(null, 255, 0, 0);
	/** One of the pre-defined colors */
	Color orange = ColorUtil.getColor(255,196,0);//new Color(null, 255, 196, 0);
	/** One of the pre-defined colors */
	Color yellow = ColorUtil.getColor(255,255,0);//new Color(null, 255, 255, 0);
	/** One of the pre-defined colors */
	Color green = ColorUtil.getColor(0,255,0);//new Color(null, 0, 255, 0);
	/** One of the pre-defined colors */
	Color lightGreen = ColorUtil.getColor(96,255,96);//new Color(null, 96, 255, 96);
	/** One of the pre-defined colors */
	Color darkGreen = ColorUtil.getColor(0,127,0);//new Color(null, 0, 127, 0);
	/** One of the pre-defined colors */
	Color cyan = ColorUtil.getColor(0,255,255);//new Color(null, 0, 255, 255);
	/** One of the pre-defined colors */
	Color lightBlue = ColorUtil.getColor(127,127,255);//new Color(null, 127, 127, 255);
	/** One of the pre-defined colors */
	Color blue = ColorUtil.getColor(0,0,255);//new Color(null, 0, 0, 255);
	/** One of the pre-defined colors */
	Color darkBlue = ColorUtil.getColor(0,0,127);//new Color(null, 0, 0, 127);

}
