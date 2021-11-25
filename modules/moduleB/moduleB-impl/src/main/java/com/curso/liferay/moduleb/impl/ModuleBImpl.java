package com.curso.liferay.moduleb.impl;

import com.curso.liferay.modulea.api.ModuleA;
import com.curso.liferay.moduleb.api.ModuleB;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true,
        property = {},
        service = ModuleB.class)
public class ModuleBImpl implements ModuleB {

    @Override
    public String metodoEnModuleB() {
        return moduleA.miMetodo();
    }

    // Injectar un bean en OSGI, es fa amb reference. Si el mòdul A no està deplegat, no es deplegaria del tot. (es queda RESOLVE)
    @Reference
    private ModuleA moduleA;

}
