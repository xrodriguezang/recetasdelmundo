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
 * The table class for the &quot;RDM_Receta&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Receta
 * @generated
 */
public class RecetaTable extends BaseTable<RecetaTable> {

	public static final RecetaTable INSTANCE = new RecetaTable();

	public final Column<RecetaTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RecetaTable, Long> recetaId = createColumn(
		"recetaId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<RecetaTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RecetaTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RecetaTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RecetaTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RecetaTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<RecetaTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<RecetaTable, String> nombre = createColumn(
		"nombre", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RecetaTable, String> descripcion = createColumn(
		"descripcion", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RecetaTable, Integer> numeroComensales = createColumn(
		"numeroComensales", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<RecetaTable, Boolean> aptaCeliacos = createColumn(
		"aptaCeliacos", Boolean.class, Types.BOOLEAN, Column.FLAG_DEFAULT);

	private RecetaTable() {
		super("RDM_Receta", RecetaTable::new);
	}

}