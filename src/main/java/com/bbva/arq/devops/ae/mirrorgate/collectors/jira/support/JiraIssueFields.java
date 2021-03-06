/*
 * Copyright 2017 Banco Bilbao Vizcaya Argentaria, S.A.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bbva.arq.devops.ae.mirrorgate.collectors.jira.support;

import java.util.List;

/**
 * Created by alfonso on 26/05/17.
 */
public class JiraIssueFields<T> {

    public static final JiraIssueFields STORY_POINTS = new JiraIssueFields(Double.class);
    public static final JiraIssueFields SPRINT = new JiraIssueFields(List.class);
    public static final JiraIssueFields KEYWORDS = new JiraIssueFields(String.class);
    //Can a feature be part of multiple PIs?
    public static final JiraIssueFields PI = new JiraIssueFields(List.class);

    public Class<T> type;

    private JiraIssueFields(Class<T> type) {
        this.type = type;
    }
}
