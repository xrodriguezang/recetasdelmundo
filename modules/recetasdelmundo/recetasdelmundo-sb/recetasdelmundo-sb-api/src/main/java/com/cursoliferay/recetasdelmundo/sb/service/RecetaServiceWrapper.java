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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RecetaService}.
 *
 * @author Brian Wing Shun Chan
 * @see RecetaService
 * @generated
 */
public class RecetaServiceWrapper
	implements RecetaService, ServiceWrapper<RecetaService> {

	public RecetaServiceWrapper(RecetaService recetaService) {
		_recetaService = recetaService;
	}

	@Override
	public com.cursoliferay.recetasdelmundo.sb.model.Receta addReceta() {
		return _recetaService.addReceta();
	}

	@Override
	public com.cursoliferay.recetasdelmundo.sb.model.Receta addReceta(
		java.util.Map<java.util.Locale, String> nombre, String descripcion) {

		return _recetaService.addReceta(nombre, descripcion);
	}

	@Override
	public com.cursoliferay.recetasdelmundo.sb.model.Receta addReceta(
		com.cursoliferay.recetasdelmundo.sb.model.Receta receta) {

		return _recetaService.addReceta(receta);
	}

	@Override
	public com.cursoliferay.recetasdelmundo.sb.model.Receta createReceta()
		throws com.liferay.portal.kernel.exception.PortalException {

		return _recetaService.createReceta();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _recetaService.getOSGiServiceIdentifier();
	}

	@Override
	public com.cursoliferay.recetasdelmundo.sb.model.Receta getReceta(
			long recetaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _recetaService.getReceta(recetaId);
	}

	@Override
	public RecetaService getWrappedService() {
		return _recetaService;
	}

	@Override
	public void setWrappedService(RecetaService recetaService) {
		_recetaService = recetaService;
	}

	private RecetaService _recetaService;

}