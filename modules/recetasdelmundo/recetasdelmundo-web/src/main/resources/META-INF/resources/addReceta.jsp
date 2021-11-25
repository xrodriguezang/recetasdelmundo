<%@ taglib prefix="porlet" uri="http://java.sun.com/portlet" %>
<%@ include file="/init.jsp" %>

<h1><liferay-ui:message key="recetasdelmundoweb.nueva-receta"/></h1>

<liferay-portlet:actionURL var="addRecetaURL" name="addReceta" />

<%--

Tambés es pot fer:

Directament amb l'especificació de portlet.

<porlet:actionURL var="" name="" />

Es recomana utilitzar el de <liferay-portlet:actionURL...

--%>

<%--
<form method="post" action="${addRecetaURL}">

    Nombre: <input type="text" name="<portlet:namespace/>nombre" value="" />

    <button type="submit">Enviar</button>

</form>

Ara es farà més senzill amb el aui. Utilitzant el taglibs de Liferay

allowYi -> S'ha tret en la nova versió
--%>

<aui:form action="${addRecetaURL}">

    <aui:input type="text" name="nombre" localized="true" />

    <aui:button type="submit" value="Enviar" />

</aui:form>