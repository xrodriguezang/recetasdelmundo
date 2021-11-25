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

package com.cursoliferay.recetasdelmundo.sb.service.impl;

import com.cursoliferay.recetasdelmundo.sb.model.Receta;
import com.cursoliferay.recetasdelmundo.sb.service.base.RecetaServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import org.osgi.service.component.annotations.Component;

import java.util.Locale;
import java.util.Map;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=rdm",
		"json.web.service.context.path=Receta"
	},
	service = AopService.class
)
public class RecetaServiceImpl extends RecetaServiceBaseImpl {

	public Receta addReceta(Receta receta) {

		//TODO - Comprobar premisos

		return recetaLocalService.addReceta(null);
	}

	// @Override
	public Receta addReceta() {
		return null;
	}

	public Receta addReceta(Map<Locale, String> nombre, String descripcion) {

		//TODO - Comprobar premisos

		Receta receta = recetaLocalService.createReceta(counterLocalService.increment(Receta.class.getName()));
		receta.setNombreMap(nombre);
		receta.setDescripcion(descripcion);

		return recetaLocalService.addReceta(receta);
	}

	public Receta getReceta(long recetaId) throws PortalException {

		//TODO - Comprobar premisos

		recetaLocalService.getRecetas(0,10);

		return recetaLocalService.getReceta(recetaId);
	}

	public Receta createReceta() throws PortalException {

		return recetaLocalService.createReceta(counterLocalService.increment(Receta.class.getName()));
	}
}