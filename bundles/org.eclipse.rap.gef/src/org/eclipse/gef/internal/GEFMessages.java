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
package org.eclipse.gef.internal;

import org.eclipse.rap.rwt.RWT;

/**
 * Internal Messages
 * 
 * @author hudsonr
 * @since 2.0
 */
public class GEFMessages /* extends NLS */{

	public String AlignBottomAction_Label;
	public String AlignBottomAction_Tooltip;
	public String AlignCenterAction_Label;
	public String AlignCenterAction_Tooltip;
	public String AlignLeftAction_Label;
	public String AlignLeftAction_Tooltip;
	public String AlignMiddleAction_Label;
	public String AlignMiddleAction_Tooltip;
	public String AlignRightAction_Label;
	public String AlignRightAction_Tooltip;
	public String AlignTopAction_Label;
	public String AlignTopAction_Tooltip;

	public String CopyAction_ActionDeleteCommandName;
	public String CopyAction_Label;
	public String CopyAction_Tooltip;

	public String DeleteAction_ActionDeleteCommandName;
	public String DeleteAction_Label;
	public String DeleteAction_Tooltip;

	public String PasteAction_Label;
	public String PasteAction_Tooltip;

	public String PrintAction_ActionDeleteCommandName;
	public String PrintAction_Label;
	public String PrintAction_Tooltip;

	public String RedoAction_Label;
	public String RedoAction_Tooltip;
	public String RenameAction_Label;
	public String RenameAction_Tooltip;
	public String SaveAction_Label;
	public String SaveAction_Tooltip;
	public String SetPropertyValueCommand_Label;

	public String SelectAllAction_Label;
	public String SelectAllAction_Tooltip;

	public String MatchSizeAction_Label;
	public String MatchSizeAction_Tooltip;

	public String MatchWidthAction_Label;
	public String MatchWidthAction_Tooltip;

	public String MatchHeightAction_Label;
	public String MatchHeightAction_Tooltip;

	public String SelectionTool_Label;
	public String MarqueeTool_Label;
	public String MarqueeTool_Connections_Touched_Desc;
	public String MarqueeTool_Connections_Contained_Desc;
	public String MarqueeTool_Nodes_Touched_Desc;
	public String MarqueeTool_Nodes_Contained_Desc;
	public String MarqueeTool_Nodes_Touched_And_Related_Connections_Desc;
	public String MarqueeTool_Nodes_Contained_And_Related_Connections_Desc;
	public String UndoAction_Label;
	public String UndoAction_Tooltip;

	// Zoom strings
	public String ZoomIn_Label;
	public String ZoomIn_Tooltip;
	public String ZoomOut_Label;
	public String ZoomOut_Tooltip;
	public String FitAllAction_Label;
	public String FitWidthAction_Label;
	public String FitHeightAction_Label;

	// View menu actions
	public String ToggleRulerVisibility_Label;
	public String ToggleRulerVisibility_Tooltip;
	public String ToggleSnapToGeometry_Label;
	public String ToggleSnapToGeometry_Tooltip;
	public String ToggleGrid_Label;
	public String ToggleGrid_Tooltip;

	// Palette view Strings
	public String Palette_Label;
	public String Palette_Not_Available;

	// Rulers and guides
	public String Ruler_Horizontal_Label;
	public String Ruler_Vertical_Label;
	public String Ruler_Desc;
	public String Guide_Label;
	public String Guide_Desc;
	public String Create_Guide_Label;
	public String Create_Guide_Tooltip;

	// static {
	// NLS.initializeMessages(
	//				"org.eclipse.gef.internal.messages", GEFMessages.class); //$NON-NLS-1$
	// }
	public static GEFMessages get() {
		Object result = RWT.NLS.getISO8859_1Encoded(
				"org.eclipse.gef.internal.messages", GEFMessages.class);
		return (GEFMessages) result;
	}
}