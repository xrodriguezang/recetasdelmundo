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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;RDM_Instruccion&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Instruccion
 * @generated
 */
public class InstruccionTable extends BaseTable<InstruccionTable> {

	public static final InstruccionTable INSTANCE = new InstruccionTable();

	public final Column<InstruccionTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<InstruccionTable, Long> instruccionId = createColumn(
		"instruccionId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<InstruccionTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<InstruccionTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<InstruccionTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<InstruccionTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<InstruccionTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<InstruccionTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<InstruccionTable, String> descripcion = createColumn(
		"descripcion", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<InstruccionTable, Long> recetaId = createColumn(
		"recetaId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private InstruccionTable() {
		super("RDM_Instruccion", InstruccionTable::new);
	}

}