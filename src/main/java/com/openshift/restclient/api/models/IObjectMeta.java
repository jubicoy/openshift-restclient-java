/******************************************************************************* 
 * Copyright (c) 2016 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/
package com.openshift.restclient.api.models;

/**
 * ObjectMeta info as defined by the server
 * @author jeff.cantrill
 *
 */
public interface IObjectMeta extends ILabelable, IAnnotatable {

	/**
	 * Returns the identifier for this resource
	 * @return
	 */
	String getName();
	
	/**
	 * Returns the timestamp of when this resource
	 * was created
	 * @return
	 */
	String getCreationTimeStamp();

	/**
	 * Returns the scope of this resource
	 * @return
	 */
	String getNamespace();

	/**
	 * A value that represents the version of this resource
	 * @return
	 */
	String getResourceVersion();
}
