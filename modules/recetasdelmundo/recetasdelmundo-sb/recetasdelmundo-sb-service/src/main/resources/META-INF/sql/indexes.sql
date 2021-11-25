create index IX_2C887F72 on RDM_Instruccion (recetaId);
create index IX_AEFFB8F5 on RDM_Instruccion (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_5F9BF8B7 on RDM_Instruccion (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_EEC68B88 on RDM_Receta (companyId, groupId, userId);
create unique index IX_2C97F55 on RDM_Receta (createDate, modifiedDate);
create index IX_2947C8C0 on RDM_Receta (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_9FAB7F42 on RDM_Receta (uuid_[$COLUMN_LENGTH:75$], groupId);