create table RDM_Instruccion (
	uuid_ VARCHAR(75) null,
	instruccionId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	descripcion VARCHAR(75) null,
	recetaId LONG
);

create table RDM_Receta (
	uuid_ VARCHAR(75) null,
	recetaId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nombre STRING null,
	descripcion VARCHAR(75) null,
	numeroComensales INTEGER,
	aptaCeliacos BOOLEAN
);