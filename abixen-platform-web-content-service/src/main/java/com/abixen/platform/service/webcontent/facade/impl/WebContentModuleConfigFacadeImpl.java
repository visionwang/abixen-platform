/**
 * Copyright (c) 2010-present Abixen Systems. All rights reserved.
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

package com.abixen.platform.service.webcontent.facade.impl;

import com.abixen.platform.service.webcontent.converter.WebContentModuleConfigToWebContentModuleConfigDtoConverter;
import com.abixen.platform.service.webcontent.dto.WebContentModuleConfigDto;
import com.abixen.platform.service.webcontent.facade.WebContentModuleConfigFacade;
import com.abixen.platform.service.webcontent.form.WebContentModuleConfigForm;
import com.abixen.platform.service.webcontent.model.impl.WebContentModuleConfig;
import com.abixen.platform.service.webcontent.service.WebContentModuleConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class WebContentModuleConfigFacadeImpl implements WebContentModuleConfigFacade {

    private final WebContentModuleConfigService webContentModuleConfigService;
    private final WebContentModuleConfigToWebContentModuleConfigDtoConverter converter;

    @Autowired
    public WebContentModuleConfigFacadeImpl(WebContentModuleConfigService webContentModuleConfigService,
                                            WebContentModuleConfigToWebContentModuleConfigDtoConverter converter) {
        this.webContentModuleConfigService = webContentModuleConfigService;
        this.converter = converter;
    }

    @Override
    public WebContentModuleConfigDto findWebContentModuleConfig(Long moduleId) {
        WebContentModuleConfig webContentModuleConfig = webContentModuleConfigService.findWebContentModuleConfig(moduleId);
        WebContentModuleConfigDto webContentModuleConfigDto = converter.convert(webContentModuleConfig);
        return webContentModuleConfigDto;
    }

    @Override
    public WebContentModuleConfigDto saveWebContentModuleConfig(WebContentModuleConfigForm webContentModuleConfigForm) {
        WebContentModuleConfig savedWebContentModuleConfig = webContentModuleConfigService.saveWebContentModuleConfig(webContentModuleConfigForm);
        WebContentModuleConfigDto savedWebContentModuleConfigDto = converter.convert(savedWebContentModuleConfig);
        return savedWebContentModuleConfigDto;
    }
}