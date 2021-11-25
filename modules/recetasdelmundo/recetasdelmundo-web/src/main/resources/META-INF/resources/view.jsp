<%@ page import="com.cursoliferay.recetasdelmundo.sb.service.RecetaLocalServiceUtil" %>
<%@ page import="com.cursoliferay.recetasdelmundo.sb.model.Receta" %>
<%@ page import="java.util.List" %>
<%@ page import="com.cursoliferay.recetasdelmundo.sb.service.RecetaLocalService" %>
<%@ page import="org.osgi.service.component.annotations.Reference" %>
<%@ page import="com.liferay.portal.kernel.log.Log" %>
<%@ page import="com.liferay.portal.kernel.log.LogFactoryUtil" %>
<%@ page import="com.cursoliferay.recetasdelmundo.sb.service.RecetaService" %>
<%@ include file="/init.jsp" %>

<%
	RecetaService recetaService = (RecetaService) renderRequest.getAttribute(RecetaService.class.getName());

	//_log.info(recetaService.getRecetasCount());
	// _log.info(recetaService.getReceta(1));

	_log.debug("Estoy en nivel de debug!");
%>

<p>
	<b><liferay-ui:message key="recetasdelmundoweb.caption"/></b>
</p>

<liferay-portlet:renderURL var="addRecetaURL">
	<liferay-portlet:param name="mvcPath" value="/addReceta.jsp"/>
</liferay-portlet:renderURL>

<a href="${addRecetaURL}" class="btn btn-primary">
	<liferay-ui:message key="recetasdelmundoweb.anadir"/>
</a>

<%!
	private Log _log = LogFactoryUtil.getLog("com.cursoliferay.recetasdelmundo.web_view.jsp");
%>

<%--
	NO HACER NUNCA!

	List<Receta> recetas = RecetaLocalServiceUtil.getRecetas(-1, -1);

	@Reference
	RecetaLocalService recetaLocalService;
--%>

<%--Es diu fase render.
jspPage -> Es troba a RecetasDelMundoPorlet.java
--%>