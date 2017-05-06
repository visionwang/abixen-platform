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

package com.abixen.platform.service.webcontent.controller;

import com.abixen.platform.service.webcontent.dto.WebContentDto;
import com.abixen.platform.service.webcontent.facade.WebContentFacade;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class AbstractWebContentController {

    private final WebContentFacade webContentFacade;

    public AbstractWebContentController(WebContentFacade webContentFacade) {
        this.webContentFacade = webContentFacade;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Page<WebContentDto> findWebContents(@PageableDefault(size = 1) Pageable pageable) {

        return webContentFacade.findWebContents(pageable);
    }
}