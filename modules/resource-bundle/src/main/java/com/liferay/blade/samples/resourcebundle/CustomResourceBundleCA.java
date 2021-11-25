/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.liferay.blade.samples.resourcebundle;

import com.liferay.portal.kernel.language.UTF8Control;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

import java.util.Enumeration;
import java.util.ResourceBundle;

/**
 * @author Liferay
 *
 * // Es posa tantes resourcesBundle com fitxers es vulguin modificar
 */

// immediate = true -> Que no sigui Lazy
@Component(
	immediate = true, property = "language.id=ca",
	service = ResourceBundle.class
)
public class CustomResourceBundleCA extends ResourceBundle {

	// Per indicar als logs que està activat!
	@Activate
	public void activate() {
		if (_log.isInfoEnabled()) {
			_log.info("Blade Resource Bundle Deployed - CA!");
		}
	}

	@Override
	public Enumeration<String> getKeys() {
		return _resourceBundle.getKeys();
	}

	@Override
	protected Object handleGetObject(String key) {
		return _resourceBundle.getObject(key);
	}

	private static final Log _log = LogFactoryUtil.getLog(
		CustomResourceBundleCA.class);

	private final ResourceBundle _resourceBundle = ResourceBundle.getBundle(
		"content.Language_ca", UTF8Control.INSTANCE);

}