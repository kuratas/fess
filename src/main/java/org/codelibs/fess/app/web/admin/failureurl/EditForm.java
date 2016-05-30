/*
 * Copyright 2012-2016 CodeLibs Project and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.codelibs.fess.app.web.admin.failureurl;

import java.io.Serializable;

import javax.validation.constraints.Size;

import org.lastaflute.web.validation.Required;
import org.lastaflute.web.validation.theme.conversion.ValidateTypeFailure;

/**
 * @author codelibs
 * @author Keiichi Watanabe
 */
public class EditForm implements Serializable {

    private static final long serialVersionUID = 1L;

    public String webConfigName;

    public String fileConfigName;

    @ValidateTypeFailure
    public String pageNumber;

    @ValidateTypeFailure
    public Integer crudMode;

    @Required
    @Size(max = 1000)
    public String id;

    @Required
    public String url;

    @Required
    public String threadName;

    public String errorName;

    public String errorLog;

    @Required
    @ValidateTypeFailure
    public String errorCount;

    @Required
    public String lastAccessTime;

    @Size(max = 1000)
    public String configId;

    public String getCurrentPageNumber() {
        return pageNumber;
    }

    public void initialize() {
        id = null;
        url = null;
        threadName = null;
        errorName = null;
        errorLog = null;
        errorCount = null;
        lastAccessTime = null;
        configId = null;
    }

}