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

package com.cursoliferay.recetasdelmundo.sb.service.persistence;

import com.cursoliferay.recetasdelmundo.sb.exception.NoSuchInstruccionException;
import com.cursoliferay.recetasdelmundo.sb.model.Instruccion;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the instruccion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see InstruccionUtil
 * @generated
 */
@ProviderType
public interface InstruccionPersistence extends BasePersistence<Instruccion> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link InstruccionUtil} to access the instruccion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the instruccions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching instruccions
	 */
	public java.util.List<Instruccion> findByUuid(String uuid);

	/**
	 * Returns a range of all the instruccions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstruccionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of instruccions
	 * @param end the upper bound of the range of instruccions (not inclusive)
	 * @return the range of matching instruccions
	 */
	public java.util.List<Instruccion> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the instruccions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstruccionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of instruccions
	 * @param end the upper bound of the range of instruccions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching instruccions
	 */
	public java.util.List<Instruccion> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Instruccion>
			orderByComparator);

	/**
	 * Returns an ordered range of all the instruccions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstruccionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of instruccions
	 * @param end the upper bound of the range of instruccions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching instruccions
	 */
	public java.util.List<Instruccion> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Instruccion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first instruccion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instruccion
	 * @throws NoSuchInstruccionException if a matching instruccion could not be found
	 */
	public Instruccion findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Instruccion>
				orderByComparator)
		throws NoSuchInstruccionException;

	/**
	 * Returns the first instruccion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instruccion, or <code>null</code> if a matching instruccion could not be found
	 */
	public Instruccion fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Instruccion>
			orderByComparator);

	/**
	 * Returns the last instruccion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instruccion
	 * @throws NoSuchInstruccionException if a matching instruccion could not be found
	 */
	public Instruccion findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Instruccion>
				orderByComparator)
		throws NoSuchInstruccionException;

	/**
	 * Returns the last instruccion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instruccion, or <code>null</code> if a matching instruccion could not be found
	 */
	public Instruccion fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Instruccion>
			orderByComparator);

	/**
	 * Returns the instruccions before and after the current instruccion in the ordered set where uuid = &#63;.
	 *
	 * @param instruccionId the primary key of the current instruccion
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next instruccion
	 * @throws NoSuchInstruccionException if a instruccion with the primary key could not be found
	 */
	public Instruccion[] findByUuid_PrevAndNext(
			long instruccionId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Instruccion>
				orderByComparator)
		throws NoSuchInstruccionException;

	/**
	 * Removes all the instruccions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of instruccions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching instruccions
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the instruccion where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchInstruccionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching instruccion
	 * @throws NoSuchInstruccionException if a matching instruccion could not be found
	 */
	public Instruccion findByUUID_G(String uuid, long groupId)
		throws NoSuchInstruccionException;

	/**
	 * Returns the instruccion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching instruccion, or <code>null</code> if a matching instruccion could not be found
	 */
	public Instruccion fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the instruccion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching instruccion, or <code>null</code> if a matching instruccion could not be found
	 */
	public Instruccion fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the instruccion where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the instruccion that was removed
	 */
	public Instruccion removeByUUID_G(String uuid, long groupId)
		throws NoSuchInstruccionException;

	/**
	 * Returns the number of instruccions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching instruccions
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the instruccions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching instruccions
	 */
	public java.util.List<Instruccion> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the instruccions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstruccionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of instruccions
	 * @param end the upper bound of the range of instruccions (not inclusive)
	 * @return the range of matching instruccions
	 */
	public java.util.List<Instruccion> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the instruccions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstruccionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of instruccions
	 * @param end the upper bound of the range of instruccions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching instruccions
	 */
	public java.util.List<Instruccion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Instruccion>
			orderByComparator);

	/**
	 * Returns an ordered range of all the instruccions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstruccionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of instruccions
	 * @param end the upper bound of the range of instruccions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching instruccions
	 */
	public java.util.List<Instruccion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Instruccion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first instruccion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instruccion
	 * @throws NoSuchInstruccionException if a matching instruccion could not be found
	 */
	public Instruccion findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Instruccion>
				orderByComparator)
		throws NoSuchInstruccionException;

	/**
	 * Returns the first instruccion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instruccion, or <code>null</code> if a matching instruccion could not be found
	 */
	public Instruccion fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Instruccion>
			orderByComparator);

	/**
	 * Returns the last instruccion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instruccion
	 * @throws NoSuchInstruccionException if a matching instruccion could not be found
	 */
	public Instruccion findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Instruccion>
				orderByComparator)
		throws NoSuchInstruccionException;

	/**
	 * Returns the last instruccion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instruccion, or <code>null</code> if a matching instruccion could not be found
	 */
	public Instruccion fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Instruccion>
			orderByComparator);

	/**
	 * Returns the instruccions before and after the current instruccion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param instruccionId the primary key of the current instruccion
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next instruccion
	 * @throws NoSuchInstruccionException if a instruccion with the primary key could not be found
	 */
	public Instruccion[] findByUuid_C_PrevAndNext(
			long instruccionId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Instruccion>
				orderByComparator)
		throws NoSuchInstruccionException;

	/**
	 * Removes all the instruccions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of instruccions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching instruccions
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the instruccions where recetaId = &#63;.
	 *
	 * @param recetaId the receta ID
	 * @return the matching instruccions
	 */
	public java.util.List<Instruccion> findByrecetaId(long recetaId);

	/**
	 * Returns a range of all the instruccions where recetaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstruccionModelImpl</code>.
	 * </p>
	 *
	 * @param recetaId the receta ID
	 * @param start the lower bound of the range of instruccions
	 * @param end the upper bound of the range of instruccions (not inclusive)
	 * @return the range of matching instruccions
	 */
	public java.util.List<Instruccion> findByrecetaId(
		long recetaId, int start, int end);

	/**
	 * Returns an ordered range of all the instruccions where recetaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstruccionModelImpl</code>.
	 * </p>
	 *
	 * @param recetaId the receta ID
	 * @param start the lower bound of the range of instruccions
	 * @param end the upper bound of the range of instruccions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching instruccions
	 */
	public java.util.List<Instruccion> findByrecetaId(
		long recetaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Instruccion>
			orderByComparator);

	/**
	 * Returns an ordered range of all the instruccions where recetaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstruccionModelImpl</code>.
	 * </p>
	 *
	 * @param recetaId the receta ID
	 * @param start the lower bound of the range of instruccions
	 * @param end the upper bound of the range of instruccions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching instruccions
	 */
	public java.util.List<Instruccion> findByrecetaId(
		long recetaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Instruccion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first instruccion in the ordered set where recetaId = &#63;.
	 *
	 * @param recetaId the receta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instruccion
	 * @throws NoSuchInstruccionException if a matching instruccion could not be found
	 */
	public Instruccion findByrecetaId_First(
			long recetaId,
			com.liferay.portal.kernel.util.OrderByComparator<Instruccion>
				orderByComparator)
		throws NoSuchInstruccionException;

	/**
	 * Returns the first instruccion in the ordered set where recetaId = &#63;.
	 *
	 * @param recetaId the receta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instruccion, or <code>null</code> if a matching instruccion could not be found
	 */
	public Instruccion fetchByrecetaId_First(
		long recetaId,
		com.liferay.portal.kernel.util.OrderByComparator<Instruccion>
			orderByComparator);

	/**
	 * Returns the last instruccion in the ordered set where recetaId = &#63;.
	 *
	 * @param recetaId the receta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instruccion
	 * @throws NoSuchInstruccionException if a matching instruccion could not be found
	 */
	public Instruccion findByrecetaId_Last(
			long recetaId,
			com.liferay.portal.kernel.util.OrderByComparator<Instruccion>
				orderByComparator)
		throws NoSuchInstruccionException;

	/**
	 * Returns the last instruccion in the ordered set where recetaId = &#63;.
	 *
	 * @param recetaId the receta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instruccion, or <code>null</code> if a matching instruccion could not be found
	 */
	public Instruccion fetchByrecetaId_Last(
		long recetaId,
		com.liferay.portal.kernel.util.OrderByComparator<Instruccion>
			orderByComparator);

	/**
	 * Returns the instruccions before and after the current instruccion in the ordered set where recetaId = &#63;.
	 *
	 * @param instruccionId the primary key of the current instruccion
	 * @param recetaId the receta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next instruccion
	 * @throws NoSuchInstruccionException if a instruccion with the primary key could not be found
	 */
	public Instruccion[] findByrecetaId_PrevAndNext(
			long instruccionId, long recetaId,
			com.liferay.portal.kernel.util.OrderByComparator<Instruccion>
				orderByComparator)
		throws NoSuchInstruccionException;

	/**
	 * Removes all the instruccions where recetaId = &#63; from the database.
	 *
	 * @param recetaId the receta ID
	 */
	public void removeByrecetaId(long recetaId);

	/**
	 * Returns the number of instruccions where recetaId = &#63;.
	 *
	 * @param recetaId the receta ID
	 * @return the number of matching instruccions
	 */
	public int countByrecetaId(long recetaId);

	/**
	 * Caches the instruccion in the entity cache if it is enabled.
	 *
	 * @param instruccion the instruccion
	 */
	public void cacheResult(Instruccion instruccion);

	/**
	 * Caches the instruccions in the entity cache if it is enabled.
	 *
	 * @param instruccions the instruccions
	 */
	public void cacheResult(java.util.List<Instruccion> instruccions);

	/**
	 * Creates a new instruccion with the primary key. Does not add the instruccion to the database.
	 *
	 * @param instruccionId the primary key for the new instruccion
	 * @return the new instruccion
	 */
	public Instruccion create(long instruccionId);

	/**
	 * Removes the instruccion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param instruccionId the primary key of the instruccion
	 * @return the instruccion that was removed
	 * @throws NoSuchInstruccionException if a instruccion with the primary key could not be found
	 */
	public Instruccion remove(long instruccionId)
		throws NoSuchInstruccionException;

	public Instruccion updateImpl(Instruccion instruccion);

	/**
	 * Returns the instruccion with the primary key or throws a <code>NoSuchInstruccionException</code> if it could not be found.
	 *
	 * @param instruccionId the primary key of the instruccion
	 * @return the instruccion
	 * @throws NoSuchInstruccionException if a instruccion with the primary key could not be found
	 */
	public Instruccion findByPrimaryKey(long instruccionId)
		throws NoSuchInstruccionException;

	/**
	 * Returns the instruccion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param instruccionId the primary key of the instruccion
	 * @return the instruccion, or <code>null</code> if a instruccion with the primary key could not be found
	 */
	public Instruccion fetchByPrimaryKey(long instruccionId);

	/**
	 * Returns all the instruccions.
	 *
	 * @return the instruccions
	 */
	public java.util.List<Instruccion> findAll();

	/**
	 * Returns a range of all the instruccions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstruccionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of instruccions
	 * @param end the upper bound of the range of instruccions (not inclusive)
	 * @return the range of instruccions
	 */
	public java.util.List<Instruccion> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the instruccions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstruccionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of instruccions
	 * @param end the upper bound of the range of instruccions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of instruccions
	 */
	public java.util.List<Instruccion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Instruccion>
			orderByComparator);

	/**
	 * Returns an ordered range of all the instruccions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstruccionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of instruccions
	 * @param end the upper bound of the range of instruccions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of instruccions
	 */
	public java.util.List<Instruccion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Instruccion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the instruccions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of instruccions.
	 *
	 * @return the number of instruccions
	 */
	public int countAll();

}