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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Instruccion service. Represents a row in the &quot;RDM_Instruccion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.cursoliferay.recetasdelmundo.sb.model.impl.InstruccionModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.cursoliferay.recetasdelmundo.sb.model.impl.InstruccionImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Instruccion
 * @generated
 */
@ProviderType
public interface InstruccionModel
	extends BaseModel<Instruccion>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a instruccion model instance should use the {@link Instruccion} interface instead.
	 */

	/**
	 * Returns the primary key of this instruccion.
	 *
	 * @return the primary key of this instruccion
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this instruccion.
	 *
	 * @param primaryKey the primary key of this instruccion
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this instruccion.
	 *
	 * @return the uuid of this instruccion
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this instruccion.
	 *
	 * @param uuid the uuid of this instruccion
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the instruccion ID of this instruccion.
	 *
	 * @return the instruccion ID of this instruccion
	 */
	public long getInstruccionId();

	/**
	 * Sets the instruccion ID of this instruccion.
	 *
	 * @param instruccionId the instruccion ID of this instruccion
	 */
	public void setInstruccionId(long instruccionId);

	/**
	 * Returns the company ID of this instruccion.
	 *
	 * @return the company ID of this instruccion
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this instruccion.
	 *
	 * @param companyId the company ID of this instruccion
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this instruccion.
	 *
	 * @return the group ID of this instruccion
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this instruccion.
	 *
	 * @param groupId the group ID of this instruccion
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this instruccion.
	 *
	 * @return the user ID of this instruccion
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this instruccion.
	 *
	 * @param userId the user ID of this instruccion
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this instruccion.
	 *
	 * @return the user uuid of this instruccion
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this instruccion.
	 *
	 * @param userUuid the user uuid of this instruccion
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this instruccion.
	 *
	 * @return the user name of this instruccion
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this instruccion.
	 *
	 * @param userName the user name of this instruccion
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this instruccion.
	 *
	 * @return the create date of this instruccion
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this instruccion.
	 *
	 * @param createDate the create date of this instruccion
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this instruccion.
	 *
	 * @return the modified date of this instruccion
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this instruccion.
	 *
	 * @param modifiedDate the modified date of this instruccion
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the descripcion of this instruccion.
	 *
	 * @return the descripcion of this instruccion
	 */
	@AutoEscape
	public String getDescripcion();

	/**
	 * Sets the descripcion of this instruccion.
	 *
	 * @param descripcion the descripcion of this instruccion
	 */
	public void setDescripcion(String descripcion);

	/**
	 * Returns the receta ID of this instruccion.
	 *
	 * @return the receta ID of this instruccion
	 */
	public long getRecetaId();

	/**
	 * Sets the receta ID of this instruccion.
	 *
	 * @param recetaId the receta ID of this instruccion
	 */
	public void setRecetaId(long recetaId);

	@Override
	public Instruccion cloneWithOriginalValues();

}