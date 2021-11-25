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

package com.cursoliferay.recetasdelmundo.sb.model.impl;

import com.cursoliferay.recetasdelmundo.sb.model.Instruccion;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Instruccion in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class InstruccionCacheModel
	implements CacheModel<Instruccion>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof InstruccionCacheModel)) {
			return false;
		}

		InstruccionCacheModel instruccionCacheModel =
			(InstruccionCacheModel)object;

		if (instruccionId == instruccionCacheModel.instruccionId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, instruccionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", instruccionId=");
		sb.append(instruccionId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", descripcion=");
		sb.append(descripcion);
		sb.append(", recetaId=");
		sb.append(recetaId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Instruccion toEntityModel() {
		InstruccionImpl instruccionImpl = new InstruccionImpl();

		if (uuid == null) {
			instruccionImpl.setUuid("");
		}
		else {
			instruccionImpl.setUuid(uuid);
		}

		instruccionImpl.setInstruccionId(instruccionId);
		instruccionImpl.setCompanyId(companyId);
		instruccionImpl.setGroupId(groupId);
		instruccionImpl.setUserId(userId);

		if (userName == null) {
			instruccionImpl.setUserName("");
		}
		else {
			instruccionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			instruccionImpl.setCreateDate(null);
		}
		else {
			instruccionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			instruccionImpl.setModifiedDate(null);
		}
		else {
			instruccionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (descripcion == null) {
			instruccionImpl.setDescripcion("");
		}
		else {
			instruccionImpl.setDescripcion(descripcion);
		}

		instruccionImpl.setRecetaId(recetaId);

		instruccionImpl.resetOriginalValues();

		return instruccionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		instruccionId = objectInput.readLong();

		companyId = objectInput.readLong();

		groupId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		descripcion = objectInput.readUTF();

		recetaId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(instruccionId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (descripcion == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(descripcion);
		}

		objectOutput.writeLong(recetaId);
	}

	public String uuid;
	public long instruccionId;
	public long companyId;
	public long groupId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String descripcion;
	public long recetaId;

}