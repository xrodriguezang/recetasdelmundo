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

package com.cursoliferay.recetasdelmundo.sb.service.persistence.impl;

import com.cursoliferay.recetasdelmundo.sb.exception.NoSuchInstruccionException;
import com.cursoliferay.recetasdelmundo.sb.model.Instruccion;
import com.cursoliferay.recetasdelmundo.sb.model.InstruccionTable;
import com.cursoliferay.recetasdelmundo.sb.model.impl.InstruccionImpl;
import com.cursoliferay.recetasdelmundo.sb.model.impl.InstruccionModelImpl;
import com.cursoliferay.recetasdelmundo.sb.service.persistence.InstruccionPersistence;
import com.cursoliferay.recetasdelmundo.sb.service.persistence.InstruccionUtil;
import com.cursoliferay.recetasdelmundo.sb.service.persistence.impl.constants.RDMPersistenceConstants;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the instruccion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {InstruccionPersistence.class, BasePersistence.class})
public class InstruccionPersistenceImpl
	extends BasePersistenceImpl<Instruccion> implements InstruccionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>InstruccionUtil</code> to access the instruccion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		InstruccionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the instruccions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching instruccions
	 */
	@Override
	public List<Instruccion> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Instruccion> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

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
	@Override
	public List<Instruccion> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Instruccion> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

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
	@Override
	public List<Instruccion> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Instruccion> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<Instruccion> list = null;

		if (useFinderCache) {
			list = (List<Instruccion>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (Instruccion instruccion : list) {
					if (!uuid.equals(instruccion.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_INSTRUCCION_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(InstruccionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<Instruccion>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first instruccion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instruccion
	 * @throws NoSuchInstruccionException if a matching instruccion could not be found
	 */
	@Override
	public Instruccion findByUuid_First(
			String uuid, OrderByComparator<Instruccion> orderByComparator)
		throws NoSuchInstruccionException {

		Instruccion instruccion = fetchByUuid_First(uuid, orderByComparator);

		if (instruccion != null) {
			return instruccion;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchInstruccionException(sb.toString());
	}

	/**
	 * Returns the first instruccion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instruccion, or <code>null</code> if a matching instruccion could not be found
	 */
	@Override
	public Instruccion fetchByUuid_First(
		String uuid, OrderByComparator<Instruccion> orderByComparator) {

		List<Instruccion> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last instruccion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instruccion
	 * @throws NoSuchInstruccionException if a matching instruccion could not be found
	 */
	@Override
	public Instruccion findByUuid_Last(
			String uuid, OrderByComparator<Instruccion> orderByComparator)
		throws NoSuchInstruccionException {

		Instruccion instruccion = fetchByUuid_Last(uuid, orderByComparator);

		if (instruccion != null) {
			return instruccion;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchInstruccionException(sb.toString());
	}

	/**
	 * Returns the last instruccion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instruccion, or <code>null</code> if a matching instruccion could not be found
	 */
	@Override
	public Instruccion fetchByUuid_Last(
		String uuid, OrderByComparator<Instruccion> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Instruccion> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the instruccions before and after the current instruccion in the ordered set where uuid = &#63;.
	 *
	 * @param instruccionId the primary key of the current instruccion
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next instruccion
	 * @throws NoSuchInstruccionException if a instruccion with the primary key could not be found
	 */
	@Override
	public Instruccion[] findByUuid_PrevAndNext(
			long instruccionId, String uuid,
			OrderByComparator<Instruccion> orderByComparator)
		throws NoSuchInstruccionException {

		uuid = Objects.toString(uuid, "");

		Instruccion instruccion = findByPrimaryKey(instruccionId);

		Session session = null;

		try {
			session = openSession();

			Instruccion[] array = new InstruccionImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, instruccion, uuid, orderByComparator, true);

			array[1] = instruccion;

			array[2] = getByUuid_PrevAndNext(
				session, instruccion, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Instruccion getByUuid_PrevAndNext(
		Session session, Instruccion instruccion, String uuid,
		OrderByComparator<Instruccion> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_INSTRUCCION_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(InstruccionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(instruccion)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Instruccion> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the instruccions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Instruccion instruccion :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(instruccion);
		}
	}

	/**
	 * Returns the number of instruccions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching instruccions
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_INSTRUCCION_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"instruccion.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(instruccion.uuid IS NULL OR instruccion.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the instruccion where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchInstruccionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching instruccion
	 * @throws NoSuchInstruccionException if a matching instruccion could not be found
	 */
	@Override
	public Instruccion findByUUID_G(String uuid, long groupId)
		throws NoSuchInstruccionException {

		Instruccion instruccion = fetchByUUID_G(uuid, groupId);

		if (instruccion == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("uuid=");
			sb.append(uuid);

			sb.append(", groupId=");
			sb.append(groupId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchInstruccionException(sb.toString());
		}

		return instruccion;
	}

	/**
	 * Returns the instruccion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching instruccion, or <code>null</code> if a matching instruccion could not be found
	 */
	@Override
	public Instruccion fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the instruccion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching instruccion, or <code>null</code> if a matching instruccion could not be found
	 */
	@Override
	public Instruccion fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {uuid, groupId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUUID_G, finderArgs);
		}

		if (result instanceof Instruccion) {
			Instruccion instruccion = (Instruccion)result;

			if (!Objects.equals(uuid, instruccion.getUuid()) ||
				(groupId != instruccion.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_INSTRUCCION_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				List<Instruccion> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					Instruccion instruccion = list.get(0);

					result = instruccion;

					cacheResult(instruccion);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Instruccion)result;
		}
	}

	/**
	 * Removes the instruccion where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the instruccion that was removed
	 */
	@Override
	public Instruccion removeByUUID_G(String uuid, long groupId)
		throws NoSuchInstruccionException {

		Instruccion instruccion = findByUUID_G(uuid, groupId);

		return remove(instruccion);
	}

	/**
	 * Returns the number of instruccions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching instruccions
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_INSTRUCCION_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_2 =
		"instruccion.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(instruccion.uuid IS NULL OR instruccion.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"instruccion.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the instruccions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching instruccions
	 */
	@Override
	public List<Instruccion> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Instruccion> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

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
	@Override
	public List<Instruccion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Instruccion> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<Instruccion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Instruccion> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid_C;
				finderArgs = new Object[] {uuid, companyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid_C;
			finderArgs = new Object[] {
				uuid, companyId, start, end, orderByComparator
			};
		}

		List<Instruccion> list = null;

		if (useFinderCache) {
			list = (List<Instruccion>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (Instruccion instruccion : list) {
					if (!uuid.equals(instruccion.getUuid()) ||
						(companyId != instruccion.getCompanyId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_INSTRUCCION_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(InstruccionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				list = (List<Instruccion>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first instruccion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instruccion
	 * @throws NoSuchInstruccionException if a matching instruccion could not be found
	 */
	@Override
	public Instruccion findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Instruccion> orderByComparator)
		throws NoSuchInstruccionException {

		Instruccion instruccion = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (instruccion != null) {
			return instruccion;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchInstruccionException(sb.toString());
	}

	/**
	 * Returns the first instruccion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instruccion, or <code>null</code> if a matching instruccion could not be found
	 */
	@Override
	public Instruccion fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Instruccion> orderByComparator) {

		List<Instruccion> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last instruccion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instruccion
	 * @throws NoSuchInstruccionException if a matching instruccion could not be found
	 */
	@Override
	public Instruccion findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Instruccion> orderByComparator)
		throws NoSuchInstruccionException {

		Instruccion instruccion = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (instruccion != null) {
			return instruccion;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchInstruccionException(sb.toString());
	}

	/**
	 * Returns the last instruccion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instruccion, or <code>null</code> if a matching instruccion could not be found
	 */
	@Override
	public Instruccion fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Instruccion> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<Instruccion> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public Instruccion[] findByUuid_C_PrevAndNext(
			long instruccionId, String uuid, long companyId,
			OrderByComparator<Instruccion> orderByComparator)
		throws NoSuchInstruccionException {

		uuid = Objects.toString(uuid, "");

		Instruccion instruccion = findByPrimaryKey(instruccionId);

		Session session = null;

		try {
			session = openSession();

			Instruccion[] array = new InstruccionImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, instruccion, uuid, companyId, orderByComparator, true);

			array[1] = instruccion;

			array[2] = getByUuid_C_PrevAndNext(
				session, instruccion, uuid, companyId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Instruccion getByUuid_C_PrevAndNext(
		Session session, Instruccion instruccion, String uuid, long companyId,
		OrderByComparator<Instruccion> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_INSTRUCCION_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(InstruccionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		queryPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(instruccion)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Instruccion> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the instruccions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (Instruccion instruccion :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(instruccion);
		}
	}

	/**
	 * Returns the number of instruccions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching instruccions
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_INSTRUCCION_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_2 =
		"instruccion.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(instruccion.uuid IS NULL OR instruccion.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"instruccion.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByrecetaId;
	private FinderPath _finderPathWithoutPaginationFindByrecetaId;
	private FinderPath _finderPathCountByrecetaId;

	/**
	 * Returns all the instruccions where recetaId = &#63;.
	 *
	 * @param recetaId the receta ID
	 * @return the matching instruccions
	 */
	@Override
	public List<Instruccion> findByrecetaId(long recetaId) {
		return findByrecetaId(
			recetaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Instruccion> findByrecetaId(long recetaId, int start, int end) {
		return findByrecetaId(recetaId, start, end, null);
	}

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
	@Override
	public List<Instruccion> findByrecetaId(
		long recetaId, int start, int end,
		OrderByComparator<Instruccion> orderByComparator) {

		return findByrecetaId(recetaId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<Instruccion> findByrecetaId(
		long recetaId, int start, int end,
		OrderByComparator<Instruccion> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByrecetaId;
				finderArgs = new Object[] {recetaId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByrecetaId;
			finderArgs = new Object[] {recetaId, start, end, orderByComparator};
		}

		List<Instruccion> list = null;

		if (useFinderCache) {
			list = (List<Instruccion>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (Instruccion instruccion : list) {
					if (recetaId != instruccion.getRecetaId()) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_INSTRUCCION_WHERE);

			sb.append(_FINDER_COLUMN_RECETAID_RECETAID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(InstruccionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(recetaId);

				list = (List<Instruccion>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first instruccion in the ordered set where recetaId = &#63;.
	 *
	 * @param recetaId the receta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instruccion
	 * @throws NoSuchInstruccionException if a matching instruccion could not be found
	 */
	@Override
	public Instruccion findByrecetaId_First(
			long recetaId, OrderByComparator<Instruccion> orderByComparator)
		throws NoSuchInstruccionException {

		Instruccion instruccion = fetchByrecetaId_First(
			recetaId, orderByComparator);

		if (instruccion != null) {
			return instruccion;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("recetaId=");
		sb.append(recetaId);

		sb.append("}");

		throw new NoSuchInstruccionException(sb.toString());
	}

	/**
	 * Returns the first instruccion in the ordered set where recetaId = &#63;.
	 *
	 * @param recetaId the receta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instruccion, or <code>null</code> if a matching instruccion could not be found
	 */
	@Override
	public Instruccion fetchByrecetaId_First(
		long recetaId, OrderByComparator<Instruccion> orderByComparator) {

		List<Instruccion> list = findByrecetaId(
			recetaId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last instruccion in the ordered set where recetaId = &#63;.
	 *
	 * @param recetaId the receta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instruccion
	 * @throws NoSuchInstruccionException if a matching instruccion could not be found
	 */
	@Override
	public Instruccion findByrecetaId_Last(
			long recetaId, OrderByComparator<Instruccion> orderByComparator)
		throws NoSuchInstruccionException {

		Instruccion instruccion = fetchByrecetaId_Last(
			recetaId, orderByComparator);

		if (instruccion != null) {
			return instruccion;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("recetaId=");
		sb.append(recetaId);

		sb.append("}");

		throw new NoSuchInstruccionException(sb.toString());
	}

	/**
	 * Returns the last instruccion in the ordered set where recetaId = &#63;.
	 *
	 * @param recetaId the receta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instruccion, or <code>null</code> if a matching instruccion could not be found
	 */
	@Override
	public Instruccion fetchByrecetaId_Last(
		long recetaId, OrderByComparator<Instruccion> orderByComparator) {

		int count = countByrecetaId(recetaId);

		if (count == 0) {
			return null;
		}

		List<Instruccion> list = findByrecetaId(
			recetaId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the instruccions before and after the current instruccion in the ordered set where recetaId = &#63;.
	 *
	 * @param instruccionId the primary key of the current instruccion
	 * @param recetaId the receta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next instruccion
	 * @throws NoSuchInstruccionException if a instruccion with the primary key could not be found
	 */
	@Override
	public Instruccion[] findByrecetaId_PrevAndNext(
			long instruccionId, long recetaId,
			OrderByComparator<Instruccion> orderByComparator)
		throws NoSuchInstruccionException {

		Instruccion instruccion = findByPrimaryKey(instruccionId);

		Session session = null;

		try {
			session = openSession();

			Instruccion[] array = new InstruccionImpl[3];

			array[0] = getByrecetaId_PrevAndNext(
				session, instruccion, recetaId, orderByComparator, true);

			array[1] = instruccion;

			array[2] = getByrecetaId_PrevAndNext(
				session, instruccion, recetaId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Instruccion getByrecetaId_PrevAndNext(
		Session session, Instruccion instruccion, long recetaId,
		OrderByComparator<Instruccion> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_INSTRUCCION_WHERE);

		sb.append(_FINDER_COLUMN_RECETAID_RECETAID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(InstruccionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(recetaId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(instruccion)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Instruccion> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the instruccions where recetaId = &#63; from the database.
	 *
	 * @param recetaId the receta ID
	 */
	@Override
	public void removeByrecetaId(long recetaId) {
		for (Instruccion instruccion :
				findByrecetaId(
					recetaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(instruccion);
		}
	}

	/**
	 * Returns the number of instruccions where recetaId = &#63;.
	 *
	 * @param recetaId the receta ID
	 * @return the number of matching instruccions
	 */
	@Override
	public int countByrecetaId(long recetaId) {
		FinderPath finderPath = _finderPathCountByrecetaId;

		Object[] finderArgs = new Object[] {recetaId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_INSTRUCCION_WHERE);

			sb.append(_FINDER_COLUMN_RECETAID_RECETAID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(recetaId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_RECETAID_RECETAID_2 =
		"instruccion.recetaId = ?";

	public InstruccionPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Instruccion.class);

		setModelImplClass(InstruccionImpl.class);
		setModelPKClass(long.class);

		setTable(InstruccionTable.INSTANCE);
	}

	/**
	 * Caches the instruccion in the entity cache if it is enabled.
	 *
	 * @param instruccion the instruccion
	 */
	@Override
	public void cacheResult(Instruccion instruccion) {
		entityCache.putResult(
			InstruccionImpl.class, instruccion.getPrimaryKey(), instruccion);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {instruccion.getUuid(), instruccion.getGroupId()},
			instruccion);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the instruccions in the entity cache if it is enabled.
	 *
	 * @param instruccions the instruccions
	 */
	@Override
	public void cacheResult(List<Instruccion> instruccions) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (instruccions.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Instruccion instruccion : instruccions) {
			if (entityCache.getResult(
					InstruccionImpl.class, instruccion.getPrimaryKey()) ==
						null) {

				cacheResult(instruccion);
			}
		}
	}

	/**
	 * Clears the cache for all instruccions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(InstruccionImpl.class);

		finderCache.clearCache(InstruccionImpl.class);
	}

	/**
	 * Clears the cache for the instruccion.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Instruccion instruccion) {
		entityCache.removeResult(InstruccionImpl.class, instruccion);
	}

	@Override
	public void clearCache(List<Instruccion> instruccions) {
		for (Instruccion instruccion : instruccions) {
			entityCache.removeResult(InstruccionImpl.class, instruccion);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(InstruccionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(InstruccionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		InstruccionModelImpl instruccionModelImpl) {

		Object[] args = new Object[] {
			instruccionModelImpl.getUuid(), instruccionModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, instruccionModelImpl);
	}

	/**
	 * Creates a new instruccion with the primary key. Does not add the instruccion to the database.
	 *
	 * @param instruccionId the primary key for the new instruccion
	 * @return the new instruccion
	 */
	@Override
	public Instruccion create(long instruccionId) {
		Instruccion instruccion = new InstruccionImpl();

		instruccion.setNew(true);
		instruccion.setPrimaryKey(instruccionId);

		String uuid = PortalUUIDUtil.generate();

		instruccion.setUuid(uuid);

		instruccion.setCompanyId(CompanyThreadLocal.getCompanyId());

		return instruccion;
	}

	/**
	 * Removes the instruccion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param instruccionId the primary key of the instruccion
	 * @return the instruccion that was removed
	 * @throws NoSuchInstruccionException if a instruccion with the primary key could not be found
	 */
	@Override
	public Instruccion remove(long instruccionId)
		throws NoSuchInstruccionException {

		return remove((Serializable)instruccionId);
	}

	/**
	 * Removes the instruccion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the instruccion
	 * @return the instruccion that was removed
	 * @throws NoSuchInstruccionException if a instruccion with the primary key could not be found
	 */
	@Override
	public Instruccion remove(Serializable primaryKey)
		throws NoSuchInstruccionException {

		Session session = null;

		try {
			session = openSession();

			Instruccion instruccion = (Instruccion)session.get(
				InstruccionImpl.class, primaryKey);

			if (instruccion == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchInstruccionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(instruccion);
		}
		catch (NoSuchInstruccionException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Instruccion removeImpl(Instruccion instruccion) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(instruccion)) {
				instruccion = (Instruccion)session.get(
					InstruccionImpl.class, instruccion.getPrimaryKeyObj());
			}

			if (instruccion != null) {
				session.delete(instruccion);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (instruccion != null) {
			clearCache(instruccion);
		}

		return instruccion;
	}

	@Override
	public Instruccion updateImpl(Instruccion instruccion) {
		boolean isNew = instruccion.isNew();

		if (!(instruccion instanceof InstruccionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(instruccion.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(instruccion);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in instruccion proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Instruccion implementation " +
					instruccion.getClass());
		}

		InstruccionModelImpl instruccionModelImpl =
			(InstruccionModelImpl)instruccion;

		if (Validator.isNull(instruccion.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			instruccion.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (instruccion.getCreateDate() == null)) {
			if (serviceContext == null) {
				instruccion.setCreateDate(date);
			}
			else {
				instruccion.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!instruccionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				instruccion.setModifiedDate(date);
			}
			else {
				instruccion.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(instruccion);
			}
			else {
				instruccion = (Instruccion)session.merge(instruccion);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			InstruccionImpl.class, instruccionModelImpl, false, true);

		cacheUniqueFindersCache(instruccionModelImpl);

		if (isNew) {
			instruccion.setNew(false);
		}

		instruccion.resetOriginalValues();

		return instruccion;
	}

	/**
	 * Returns the instruccion with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the instruccion
	 * @return the instruccion
	 * @throws NoSuchInstruccionException if a instruccion with the primary key could not be found
	 */
	@Override
	public Instruccion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchInstruccionException {

		Instruccion instruccion = fetchByPrimaryKey(primaryKey);

		if (instruccion == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchInstruccionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return instruccion;
	}

	/**
	 * Returns the instruccion with the primary key or throws a <code>NoSuchInstruccionException</code> if it could not be found.
	 *
	 * @param instruccionId the primary key of the instruccion
	 * @return the instruccion
	 * @throws NoSuchInstruccionException if a instruccion with the primary key could not be found
	 */
	@Override
	public Instruccion findByPrimaryKey(long instruccionId)
		throws NoSuchInstruccionException {

		return findByPrimaryKey((Serializable)instruccionId);
	}

	/**
	 * Returns the instruccion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param instruccionId the primary key of the instruccion
	 * @return the instruccion, or <code>null</code> if a instruccion with the primary key could not be found
	 */
	@Override
	public Instruccion fetchByPrimaryKey(long instruccionId) {
		return fetchByPrimaryKey((Serializable)instruccionId);
	}

	/**
	 * Returns all the instruccions.
	 *
	 * @return the instruccions
	 */
	@Override
	public List<Instruccion> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Instruccion> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<Instruccion> findAll(
		int start, int end, OrderByComparator<Instruccion> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<Instruccion> findAll(
		int start, int end, OrderByComparator<Instruccion> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Instruccion> list = null;

		if (useFinderCache) {
			list = (List<Instruccion>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_INSTRUCCION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_INSTRUCCION;

				sql = sql.concat(InstruccionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Instruccion>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the instruccions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Instruccion instruccion : findAll()) {
			remove(instruccion);
		}
	}

	/**
	 * Returns the number of instruccions.
	 *
	 * @return the number of instruccions
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_INSTRUCCION);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "instruccionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_INSTRUCCION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return InstruccionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the instruccion persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_finderPathFetchByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, true);

		_finderPathCountByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, false);

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathCountByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, false);

		_finderPathWithPaginationFindByrecetaId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByrecetaId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"recetaId"}, true);

		_finderPathWithoutPaginationFindByrecetaId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByrecetaId",
			new String[] {Long.class.getName()}, new String[] {"recetaId"},
			true);

		_finderPathCountByrecetaId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByrecetaId",
			new String[] {Long.class.getName()}, new String[] {"recetaId"},
			false);

		_setInstruccionUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setInstruccionUtilPersistence(null);

		entityCache.removeCache(InstruccionImpl.class.getName());
	}

	private void _setInstruccionUtilPersistence(
		InstruccionPersistence instruccionPersistence) {

		try {
			Field field = InstruccionUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, instruccionPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = RDMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = RDMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = RDMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_INSTRUCCION =
		"SELECT instruccion FROM Instruccion instruccion";

	private static final String _SQL_SELECT_INSTRUCCION_WHERE =
		"SELECT instruccion FROM Instruccion instruccion WHERE ";

	private static final String _SQL_COUNT_INSTRUCCION =
		"SELECT COUNT(instruccion) FROM Instruccion instruccion";

	private static final String _SQL_COUNT_INSTRUCCION_WHERE =
		"SELECT COUNT(instruccion) FROM Instruccion instruccion WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "instruccion.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Instruccion exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Instruccion exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		InstruccionPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private InstruccionModelArgumentsResolver
		_instruccionModelArgumentsResolver;

}