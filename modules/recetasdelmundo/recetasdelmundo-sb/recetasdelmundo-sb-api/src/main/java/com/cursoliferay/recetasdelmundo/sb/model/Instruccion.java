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
 * The extended model interface for the Instruccion service. Represents a row in the &quot;RDM_Instruccion&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see InstruccionModel
 * @generated
 */
@ImplementationClassName(
	"com.cursoliferay.recetasdelmundo.sb.model.impl.InstruccionImpl"
)
@ProviderType
public interface Instruccion extends InstruccionModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.cursoliferay.recetasdelmundo.sb.model.impl.InstruccionImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Instruccion, Long> INSTRUCCION_ID_ACCESSOR =
		new Accessor<Instruccion, Long>() {

			@Override
			public Long get(Instruccion instruccion) {
				return instruccion.getInstruccionId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Instruccion> getTypeClass() {
				return Instruccion.class;
			}

		};

}