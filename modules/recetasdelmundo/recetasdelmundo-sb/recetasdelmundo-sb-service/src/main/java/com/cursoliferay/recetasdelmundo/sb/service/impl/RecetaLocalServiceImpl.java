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

import com.cursoliferay.recetasdelmundo.sb.exception.NoSuchRecetaException;
import com.cursoliferay.recetasdelmundo.sb.model.Instruccion;
import com.cursoliferay.recetasdelmundo.sb.model.Receta;
import com.cursoliferay.recetasdelmundo.sb.service.InstruccionLocalService;
import com.cursoliferay.recetasdelmundo.sb.service.InstruccionLocalServiceUtil;
import com.cursoliferay.recetasdelmundo.sb.service.base.RecetaLocalServiceBaseImpl;

import com.cursoliferay.recetasdelmundo.sb.service.persistence.RecetaUtil;
import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserService;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.OrderByComparator;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.ws.rs.NotSupportedException;
import java.util.Date;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.cursoliferay.recetasdelmundo.sb.model.Receta",
	service = AopService.class
)
public class RecetaLocalServiceImpl extends RecetaLocalServiceBaseImpl {

	//@Override
	@Transactional
	public Receta addReceta(Receta recetaParam, ServiceContext serviceContext) throws PortalException {

		recetaParam.setGroupId(serviceContext.getScopeGroupId());
		recetaParam.setUserId(serviceContext.getUserId());

		// bona pràctiva: Al service, No als locals. Aquests controlen els permisos
		User user = userService.getUserById(serviceContext.getUserId());

		recetaParam.setUserName(user.getScreenName());

		Receta receta1 = super.addReceta(recetaParam);

		List<Instruccion> instruccionList = recetaParam.getInstruccionList();

		for (Instruccion instruccion: instruccionList) {
			instruccion.setRecetaId(recetaParam.getRecetaId());

			instruccionLocalService.addInstruccion(instruccion);
		}

		// Ara el volem afegir a l'Asset de Liferay.
		// Dins asset: classPk -> Clau primario del recetaId.

		// Nota = receta1.getRecetaId() = receta.getPrimaryKey

		// Es decomenta al service.xml la part Assset
		assetEntryLocalService.updateEntry(receta1.getUserId(), receta1.getGroupId(), receta1.getCreateDate(), receta1.getModifiedDate(),
				Receta.class.getName(), receta1.getRecetaId(), receta1.getUuid(), 0,
				serviceContext.getAssetCategoryIds(), serviceContext.getAssetTagNames(), true,
				true, null, null, null,
				null, ContentTypes.TEXT_HTML, receta1.getNombre(),
				receta1.getDescripcion(), receta1.getDescripcion(), null, null,
				0, 0, null);

		// NOTA: QUan es borri una recepta, s'ha de borrar aquí l'asset tambe.

		return receta1;
	}

	@Override
	public Receta addReceta(Receta receta) {

		throw new UnsupportedOperationException();
		// return super.addReceta(receta);
	}

	public Receta getReceta(long recetaId) throws PortalException {

		Receta receta = super.getReceta(recetaId);

		receta.setInstruccionList(instruccionLocalService.findByrecetaId(recetaId));

		return receta;

	}

	@Override
	public Receta deleteReceta (long recetaId) throws PortalException {

		AssetEntry assetEntry = assetEntryLocalService.getEntry(Receta.class.getName(), recetaId);

		assetEntryLocalService.deleteAssetEntry(assetEntry);

		List<Instruccion> byrecetaId = instruccionLocalService.findByrecetaId(recetaId);

		// Soc jo el que li dic que esborri. Per defecte no és relacional. A l'igual que esborrar.
		for (Instruccion instruccion : byrecetaId) {
			// Aquest mètode es transaccional: Perquè li he dit delete. Si li hagués dir, borrarReceta, llavors es borren les instruccions
			// i si després hi ha un problema amb la BBDD amb la recepta, si comença per borrar, no es transaccional. Això es troba explicat al DTD del servic.xml
			// Aquí es propaga la transaccionalitat
			instruccionLocalService.deleteInstruccion(instruccion);

			// ServiceUtil -> Saltar les alarmes!!!!!
			// Aquí NO es propaga la transaccionalitat
			// InstruccionLocalServiceUtil.deleteInstruccion(instruccion); -> Aquí ja trenques la transacccionalitat.
		}

		// En cas que no comenci per delete, es pot posar @Transaccional!!!!!

		return super.deleteReceta(recetaId);
	}

	public List<Receta> findBycompanyId (long companyId, int start, int end, OrderByComparator<Receta> orderByComparator) {
		return RecetaUtil.findBycompanyId(companyId, start, end, orderByComparator);
	}

	public Receta findByC_M (Date d1, Date d2) throws NoSuchRecetaException {
		return RecetaUtil.findByC_M(d1, d2);
	}

	// Per treure l'excepció. L'important dels finders, és que està tot cachejat.
	public Receta fetchByC_M (Date d1, Date d2) {
		return RecetaUtil.fetchByC_M(d1, d2);
	}


	@Reference
	private InstruccionLocalService instruccionLocalService;

	@Reference
	private UserService userService;

}