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

package com.cursoliferay.recetasdelmundo.sb.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link InstruccionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see InstruccionLocalService
 * @generated
 */
public class InstruccionLocalServiceWrapper
	implements InstruccionLocalService,
			   ServiceWrapper<InstruccionLocalService> {

	public InstruccionLocalServiceWrapper(
		InstruccionLocalService instruccionLocalService) {

		_instruccionLocalService = instruccionLocalService;
	}

	/**
	 * Adds the instruccion to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InstruccionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param instruccion the instruccion
	 * @return the instruccion that was added
	 */
	@Override
	public com.cursoliferay.recetasdelmundo.sb.model.Instruccion addInstruccion(
		com.cursoliferay.recetasdelmundo.sb.model.Instruccion instruccion) {

		return _instruccionLocalService.addInstruccion(instruccion);
	}

	/**
	 * Creates a new instruccion with the primary key. Does not add the instruccion to the database.
	 *
	 * @param instruccionId the primary key for the new instruccion
	 * @return the new instruccion
	 */
	@Override
	public com.cursoliferay.recetasdelmundo.sb.model.Instruccion
		createInstruccion(long instruccionId) {

		return _instruccionLocalService.createInstruccion(instruccionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _instruccionLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the instruccion from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InstruccionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param instruccion the instruccion
	 * @return the instruccion that was removed
	 */
	@Override
	public com.cursoliferay.recetasdelmundo.sb.model.Instruccion
		deleteInstruccion(
			com.cursoliferay.recetasdelmundo.sb.model.Instruccion instruccion) {

		return _instruccionLocalService.deleteInstruccion(instruccion);
	}

	/**
	 * Deletes the instruccion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InstruccionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param instruccionId the primary key of the instruccion
	 * @return the instruccion that was removed
	 * @throws PortalException if a instruccion with the primary key could not be found
	 */
	@Override
	public com.cursoliferay.recetasdelmundo.sb.model.Instruccion
			deleteInstruccion(long instruccionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _instruccionLocalService.deleteInstruccion(instruccionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _instruccionLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _instruccionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _instruccionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _instruccionLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _instruccionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.cursoliferay.recetasdelmundo.sb.model.impl.InstruccionModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _instruccionLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.cursoliferay.recetasdelmundo.sb.model.impl.InstruccionModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _instruccionLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _instruccionLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _instruccionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.cursoliferay.recetasdelmundo.sb.model.Instruccion
		fetchInstruccion(long instruccionId) {

		return _instruccionLocalService.fetchInstruccion(instruccionId);
	}

	/**
	 * Returns the instruccion matching the UUID and group.
	 *
	 * @param uuid the instruccion's UUID
	 * @param groupId the primary key of the group
	 * @return the matching instruccion, or <code>null</code> if a matching instruccion could not be found
	 */
	@Override
	public com.cursoliferay.recetasdelmundo.sb.model.Instruccion
		fetchInstruccionByUuidAndGroupId(String uuid, long groupId) {

		return _instruccionLocalService.fetchInstruccionByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public java.util.List<com.cursoliferay.recetasdelmundo.sb.model.Instruccion>
		findByrecetaId(long recetaId) {

		return _instruccionLocalService.findByrecetaId(recetaId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _instruccionLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _instruccionLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _instruccionLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the instruccion with the primary key.
	 *
	 * @param instruccionId the primary key of the instruccion
	 * @return the instruccion
	 * @throws PortalException if a instruccion with the primary key could not be found
	 */
	@Override
	public com.cursoliferay.recetasdelmundo.sb.model.Instruccion getInstruccion(
			long instruccionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _instruccionLocalService.getInstruccion(instruccionId);
	}

	/**
	 * Returns the instruccion matching the UUID and group.
	 *
	 * @param uuid the instruccion's UUID
	 * @param groupId the primary key of the group
	 * @return the matching instruccion
	 * @throws PortalException if a matching instruccion could not be found
	 */
	@Override
	public com.cursoliferay.recetasdelmundo.sb.model.Instruccion
			getInstruccionByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _instruccionLocalService.getInstruccionByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the instruccions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.cursoliferay.recetasdelmundo.sb.model.impl.InstruccionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of instruccions
	 * @param end the upper bound of the range of instruccions (not inclusive)
	 * @return the range of instruccions
	 */
	@Override
	public java.util.List<com.cursoliferay.recetasdelmundo.sb.model.Instruccion>
		getInstruccions(int start, int end) {

		return _instruccionLocalService.getInstruccions(start, end);
	}

	/**
	 * Returns all the instruccions matching the UUID and company.
	 *
	 * @param uuid the UUID of the instruccions
	 * @param companyId the primary key of the company
	 * @return the matching instruccions, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.cursoliferay.recetasdelmundo.sb.model.Instruccion>
		getInstruccionsByUuidAndCompanyId(String uuid, long companyId) {

		return _instruccionLocalService.getInstruccionsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of instruccions matching the UUID and company.
	 *
	 * @param uuid the UUID of the instruccions
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of instruccions
	 * @param end the upper bound of the range of instruccions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching instruccions, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.cursoliferay.recetasdelmundo.sb.model.Instruccion>
		getInstruccionsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.cursoliferay.recetasdelmundo.sb.model.Instruccion>
					orderByComparator) {

		return _instruccionLocalService.getInstruccionsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of instruccions.
	 *
	 * @return the number of instruccions
	 */
	@Override
	public int getInstruccionsCount() {
		return _instruccionLocalService.getInstruccionsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _instruccionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _instruccionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the instruccion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InstruccionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param instruccion the instruccion
	 * @return the instruccion that was updated
	 */
	@Override
	public com.cursoliferay.recetasdelmundo.sb.model.Instruccion
		updateInstruccion(
			com.cursoliferay.recetasdelmundo.sb.model.Instruccion instruccion) {

		return _instruccionLocalService.updateInstruccion(instruccion);
	}

	@Override
	public InstruccionLocalService getWrappedService() {
		return _instruccionLocalService;
	}

	@Override
	public void setWrappedService(
		InstruccionLocalService instruccionLocalService) {

		_instruccionLocalService = instruccionLocalService;
	}

	private InstruccionLocalService _instruccionLocalService;

}