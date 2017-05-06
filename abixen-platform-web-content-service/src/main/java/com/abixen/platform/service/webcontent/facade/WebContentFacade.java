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

package com.abixen.platform.service.webcontent.facade;

import com.abixen.platform.service.webcontent.dto.WebContentDto;
import com.abixen.platform.service.webcontent.form.WebContentForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface WebContentFacade {

    WebContentDto createWebContent(WebContentForm webContentForm);

    WebContentDto updateWebContent(WebContentForm webContentForm);

    WebContentDto findWebContent(Long webContentId);

    WebContentDto findAndAssembleWebContent(Long webContentId);

    Page<WebContentDto> findWebContents(Pageable pageable);

    void deleteWebContent(Long webContentId);
}