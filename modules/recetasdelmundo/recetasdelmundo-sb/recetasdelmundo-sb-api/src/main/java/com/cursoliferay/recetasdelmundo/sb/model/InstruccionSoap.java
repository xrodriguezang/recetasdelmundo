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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class InstruccionSoap implements Serializable {

	public static InstruccionSoap toSoapModel(Instruccion model) {
		InstruccionSoap soapModel = new InstruccionSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setInstruccionId(model.getInstruccionId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setRecetaId(model.getRecetaId());

		return soapModel;
	}

	public static InstruccionSoap[] toSoapModels(Instruccion[] models) {
		InstruccionSoap[] soapModels = new InstruccionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static InstruccionSoap[][] toSoapModels(Instruccion[][] models) {
		InstruccionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new InstruccionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new InstruccionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static InstruccionSoap[] toSoapModels(List<Instruccion> models) {
		List<InstruccionSoap> soapModels = new ArrayList<InstruccionSoap>(
			models.size());

		for (Instruccion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new InstruccionSoap[soapModels.size()]);
	}

	public InstruccionSoap() {
	}

	public long getPrimaryKey() {
		return _instruccionId;
	}

	public void setPrimaryKey(long pk) {
		setInstruccionId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getInstruccionId() {
		return _instruccionId;
	}

	public void setInstruccionId(long instruccionId) {
		_instruccionId = instruccionId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
	}

	public long getRecetaId() {
		return _recetaId;
	}

	public void setRecetaId(long recetaId) {
		_recetaId = recetaId;
	}

	private String _uuid;
	private long _instruccionId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _descripcion;
	private long _recetaId;

}