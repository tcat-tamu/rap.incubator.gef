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
package org.eclipse.gef.ui.actions;

import org.eclipse.ui.actions.LabelRetargetAction;

import org.eclipse.draw2d.PositionConstants;

import org.eclipse.gef.internal.GEFMessages;
import org.eclipse.gef.internal.InternalImages;

/**
 * @author Eric Bordeau
 */
public class AlignmentRetargetAction extends LabelRetargetAction {

	/**
	 * Constructs a new AlignmentRetargetAction with the default ID, label and
	 * image based on the given alignment constant. Possible values are
	 * {@link PositionConstants#BOTTOM}, {@link PositionConstants#CENTER},
	 * {@link PositionConstants#LEFT}, {@link PositionConstants#MIDDLE},
	 * {@link PositionConstants#RIGHT}, and {@link PositionConstants#TOP}.
	 * 
	 * @param align
	 *            the alignment.
	 */
	public AlignmentRetargetAction(int align) {
		super(null, null);
		switch (align) {
		case PositionConstants.BOTTOM:
			setId(GEFActionConstants.ALIGN_BOTTOM);
			setText(GEFMessages.get().AlignBottomAction_Label);
			setToolTipText(GEFMessages.get().AlignBottomAction_Tooltip);
			setImageDescriptor(InternalImages.DESC_VERT_ALIGN_BOTTOM);
			setDisabledImageDescriptor(InternalImages.DESC_VERT_ALIGN_BOTTOM_DIS);
			break;
		case PositionConstants.CENTER:
			setId(GEFActionConstants.ALIGN_CENTER);
			setText(GEFMessages.get().AlignCenterAction_Label);
			setToolTipText(GEFMessages.get().AlignCenterAction_Tooltip);
			setImageDescriptor(InternalImages.DESC_HORZ_ALIGN_CENTER);
			setDisabledImageDescriptor(InternalImages.DESC_HORZ_ALIGN_CENTER_DIS);
			break;
		case PositionConstants.LEFT:
			setId(GEFActionConstants.ALIGN_LEFT);
			setText(GEFMessages.get().AlignLeftAction_Label);
			setToolTipText(GEFMessages.get().AlignLeftAction_Tooltip);
			setImageDescriptor(InternalImages.DESC_HORZ_ALIGN_LEFT);
			setDisabledImageDescriptor(InternalImages.DESC_HORZ_ALIGN_LEFT_DIS);
			break;
		case PositionConstants.MIDDLE:
			setId(GEFActionConstants.ALIGN_MIDDLE);
			setText(GEFMessages.get().AlignMiddleAction_Label);
			setToolTipText(GEFMessages.get().AlignMiddleAction_Tooltip);
			setImageDescriptor(InternalImages.DESC_VERT_ALIGN_MIDDLE);
			setDisabledImageDescriptor(InternalImages.DESC_VERT_ALIGN_MIDDLE_DIS);
			break;
		case PositionConstants.RIGHT:
			setId(GEFActionConstants.ALIGN_RIGHT);
			setText(GEFMessages.get().AlignRightAction_Label);
			setToolTipText(GEFMessages.get().AlignRightAction_Tooltip);
			setImageDescriptor(InternalImages.DESC_HORZ_ALIGN_RIGHT);
			setDisabledImageDescriptor(InternalImages.DESC_HORZ_ALIGN_RIGHT_DIS);
			break;
		case PositionConstants.TOP:
			setId(GEFActionConstants.ALIGN_TOP);
			setText(GEFMessages.get().AlignTopAction_Label);
			setToolTipText(GEFMessages.get().AlignTopAction_Tooltip);
			setImageDescriptor(InternalImages.DESC_VERT_ALIGN_TOP);
			setDisabledImageDescriptor(InternalImages.DESC_VERT_ALIGN_TOP_DIS);
			break;
		}
	}

}
