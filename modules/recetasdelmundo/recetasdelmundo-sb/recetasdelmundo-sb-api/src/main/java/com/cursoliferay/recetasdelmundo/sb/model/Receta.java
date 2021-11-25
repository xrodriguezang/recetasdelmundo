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

package com.cursoliferay.recetasdelmundo.sb.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the Receta service. Represents a row in the &quot;RDM_Receta&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see RecetaModel
 * @generated
 */
@ImplementationClassName(
	"com.cursoliferay.recetasdelmundo.sb.model.impl.RecetaImpl"
)
@ProviderType
public interface Receta extends PersistedModel, RecetaModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.cursoliferay.recetasdelmundo.sb.model.impl.RecetaImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Receta, Long> RECETA_ID_ACCESSOR =
		new Accessor<Receta, Long>() {

			@Override
			public Long get(Receta receta) {
				return receta.getRecetaId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Receta> getTypeClass() {
				return Receta.class;
			}

		};

	public java.util.List<Instruccion> getInstruccionList();

	public void setInstruccionList(java.util.List<Instruccion> instruccionList);

}