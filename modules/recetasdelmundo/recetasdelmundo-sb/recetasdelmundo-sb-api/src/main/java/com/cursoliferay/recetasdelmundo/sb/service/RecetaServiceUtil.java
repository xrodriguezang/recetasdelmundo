/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.cursoliferay.recetasdelmundo.sb.service;

import com.cursoliferay.recetasdelmundo.sb.model.Receta;

import com.liferay.portal.kernel.exception.PortalException;

import java.util.Map;

/**
 * Provides the remote service utility for Receta. This utility wraps
 * <code>com.cursoliferay.recetasdelmundo.sb.service.impl.RecetaServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see RecetaService
 * @generated
 */
public class RecetaServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.cursoliferay.recetasdelmundo.sb.service.impl.RecetaServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Receta addReceta() {
		return getService().addReceta();
	}

	public static Receta addReceta(
		Map<java.util.Locale, String> nombre, String descripcion) {

		return getService().addReceta(nombre, descripcion);
	}

	public static Receta addReceta(Receta receta) {
		return getService().addReceta(receta);
	}

	public static Receta createReceta() throws PortalException {
		return getService().createReceta();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static Receta getReceta(long recetaId) throws PortalException {
		return getService().getReceta(recetaId);
	}

	public static RecetaService getService() {
		return _service;
	}

	private static volatile RecetaService _service;

}