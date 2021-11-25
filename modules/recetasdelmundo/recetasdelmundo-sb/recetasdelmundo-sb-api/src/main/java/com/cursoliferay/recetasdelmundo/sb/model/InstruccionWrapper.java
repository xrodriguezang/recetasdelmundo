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

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Instruccion}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Instruccion
 * @generated
 */
public class InstruccionWrapper
	extends BaseModelWrapper<Instruccion>
	implements Instruccion, ModelWrapper<Instruccion> {

	public InstruccionWrapper(Instruccion instruccion) {
		super(instruccion);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("instruccionId", getInstruccionId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("descripcion", getDescripcion());
		attributes.put("recetaId", getRecetaId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long instruccionId = (Long)attributes.get("instruccionId");

		if (instruccionId != null) {
			setInstruccionId(instruccionId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		Long recetaId = (Long)attributes.get("recetaId");

		if (recetaId != null) {
			setRecetaId(recetaId);
		}
	}

	@Override
	public Instruccion cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this instruccion.
	 *
	 * @return the company ID of this instruccion
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this instruccion.
	 *
	 * @return the create date of this instruccion
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the descripcion of this instruccion.
	 *
	 * @return the descripcion of this instruccion
	 */
	@Override
	public String getDescripcion() {
		return model.getDescripcion();
	}

	/**
	 * Returns the group ID of this instruccion.
	 *
	 * @return the group ID of this instruccion
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the instruccion ID of this instruccion.
	 *
	 * @return the instruccion ID of this instruccion
	 */
	@Override
	public long getInstruccionId() {
		return model.getInstruccionId();
	}

	/**
	 * Returns the modified date of this instruccion.
	 *
	 * @return the modified date of this instruccion
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this instruccion.
	 *
	 * @return the primary key of this instruccion
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the receta ID of this instruccion.
	 *
	 * @return the receta ID of this instruccion
	 */
	@Override
	public long getRecetaId() {
		return model.getRecetaId();
	}

	/**
	 * Returns the user ID of this instruccion.
	 *
	 * @return the user ID of this instruccion
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this instruccion.
	 *
	 * @return the user name of this instruccion
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this instruccion.
	 *
	 * @return the user uuid of this instruccion
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this instruccion.
	 *
	 * @return the uuid of this instruccion
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this instruccion.
	 *
	 * @param companyId the company ID of this instruccion
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this instruccion.
	 *
	 * @param createDate the create date of this instruccion
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the descripcion of this instruccion.
	 *
	 * @param descripcion the descripcion of this instruccion
	 */
	@Override
	public void setDescripcion(String descripcion) {
		model.setDescripcion(descripcion);
	}

	/**
	 * Sets the group ID of this instruccion.
	 *
	 * @param groupId the group ID of this instruccion
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the instruccion ID of this instruccion.
	 *
	 * @param instruccionId the instruccion ID of this instruccion
	 */
	@Override
	public void setInstruccionId(long instruccionId) {
		model.setInstruccionId(instruccionId);
	}

	/**
	 * Sets the modified date of this instruccion.
	 *
	 * @param modifiedDate the modified date of this instruccion
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this instruccion.
	 *
	 * @param primaryKey the primary key of this instruccion
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the receta ID of this instruccion.
	 *
	 * @param recetaId the receta ID of this instruccion
	 */
	@Override
	public void setRecetaId(long recetaId) {
		model.setRecetaId(recetaId);
	}

	/**
	 * Sets the user ID of this instruccion.
	 *
	 * @param userId the user ID of this instruccion
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this instruccion.
	 *
	 * @param userName the user name of this instruccion
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this instruccion.
	 *
	 * @param userUuid the user uuid of this instruccion
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this instruccion.
	 *
	 * @param uuid the uuid of this instruccion
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected InstruccionWrapper wrap(Instruccion instruccion) {
		return new InstruccionWrapper(instruccion);
	}

}