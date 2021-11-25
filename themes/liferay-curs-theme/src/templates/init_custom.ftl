<#--
This file allows you to override and define new FreeMarker variables.
-->
<#assign sign_in_url="/c/portal/login" />
<#assign sign_in_text="Sign in text value" />

<#assign showHeader = getterUtil.getBoolean(theme_settings["showHeader"])>
<#assign showFooter = getterUtil.getBoolean(theme_settings["showFooter"])>

<#assign mi_variable = miVariable  />