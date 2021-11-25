package com.curso.liferay.modulea.impl;

import com.curso.liferay.modulea.api.ModuleA;
import org.osgi.service.component.annotations.Component;

@Component(immediate = true,
        property = {},
        service = ModuleA.class)
public class ModuleAImpl implements ModuleA {

    @Override
    public String miMetodo() {
        return "Hola a todos";
    }

}
