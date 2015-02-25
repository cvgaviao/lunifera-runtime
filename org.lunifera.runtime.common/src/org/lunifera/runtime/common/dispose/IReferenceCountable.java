/**
 * Copyright (c) 2012 Committers of lunifera.org.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.lunifera.runtime.common.dispose;

/**
 * Implementations need to hold an internal counter about references to the
 * instance. If usage reaches zero, the instance must be disposed.
 */
public interface IReferenceCountable {

	/**
	 * Returns the usage count.
	 * 
	 * @return
	 */
	int getUsageCount();

	/**
	 * Increases the usage count.
	 */
	void increaseUsageCount();

	/**
	 * Decreases the usage count.
	 */
	void decreaseUsageCount();

}
