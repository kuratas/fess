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
package org.codelibs.fess.es.config.cbean.ca.bs;

import org.codelibs.fess.es.config.allcommon.EsAbstractConditionAggregation;
import org.codelibs.fess.es.config.allcommon.EsAbstractConditionQuery;
import org.codelibs.fess.es.config.cbean.ca.FileConfigToRoleCA;
import org.codelibs.fess.es.config.cbean.cq.FileConfigToRoleCQ;
import org.codelibs.fess.es.config.cbean.cq.bs.BsFileConfigToRoleCQ;
import org.elasticsearch.search.aggregations.bucket.filter.FilterAggregationBuilder;
import org.elasticsearch.search.aggregations.bucket.global.GlobalBuilder;
import org.elasticsearch.search.aggregations.bucket.missing.MissingBuilder;
import org.elasticsearch.search.aggregations.bucket.range.ipv4.IPv4RangeBuilder;
import org.elasticsearch.search.aggregations.bucket.sampler.SamplerAggregationBuilder;
import org.elasticsearch.search.aggregations.bucket.significant.SignificantTermsBuilder;
import org.elasticsearch.search.aggregations.bucket.terms.TermsBuilder;
import org.elasticsearch.search.aggregations.metrics.cardinality.CardinalityBuilder;
import org.elasticsearch.search.aggregations.metrics.scripted.ScriptedMetricBuilder;
import org.elasticsearch.search.aggregations.metrics.tophits.TopHitsBuilder;
import org.elasticsearch.search.aggregations.metrics.valuecount.ValueCountBuilder;

/**
 * @author ESFlute (using FreeGen)
 */
public abstract class BsFileConfigToRoleCA extends EsAbstractConditionAggregation {

    // ===================================================================================
    //                                                                     Aggregation Set
    //                                                                           =========

    public void filter(String name, EsAbstractConditionQuery.OperatorCall<BsFileConfigToRoleCQ> queryLambda,
            ConditionOptionCall<FilterAggregationBuilder> opLambda, OperatorCall<BsFileConfigToRoleCA> aggsLambda) {
        FileConfigToRoleCQ cq = new FileConfigToRoleCQ();
        if (queryLambda != null) {
            queryLambda.callback(cq);
        }
        FilterAggregationBuilder builder = regFilterA(name, cq.getQuery());
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FileConfigToRoleCA ca = new FileConfigToRoleCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void global(String name, ConditionOptionCall<GlobalBuilder> opLambda, OperatorCall<BsFileConfigToRoleCA> aggsLambda) {
        GlobalBuilder builder = regGlobalA(name);
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FileConfigToRoleCA ca = new FileConfigToRoleCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void sampler(String name, ConditionOptionCall<SamplerAggregationBuilder> opLambda, OperatorCall<BsFileConfigToRoleCA> aggsLambda) {
        SamplerAggregationBuilder builder = regSamplerA(name);
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FileConfigToRoleCA ca = new FileConfigToRoleCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void scriptedMetric(String name, ConditionOptionCall<ScriptedMetricBuilder> opLambda) {
        ScriptedMetricBuilder builder = regScriptedMetricA(name);
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void topHits(String name, ConditionOptionCall<TopHitsBuilder> opLambda) {
        TopHitsBuilder builder = regTopHitsA(name);
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    // String fileConfigId

    public void setFileConfigId_Terms() {
        setFileConfigId_Terms(null);
    }

    public void setFileConfigId_Terms(ConditionOptionCall<TermsBuilder> opLambda) {
        setFileConfigId_Terms("fileConfigId", opLambda, null);
    }

    public void setFileConfigId_Terms(ConditionOptionCall<TermsBuilder> opLambda, OperatorCall<BsFileConfigToRoleCA> aggsLambda) {
        setFileConfigId_Terms("fileConfigId", opLambda, aggsLambda);
    }

    public void setFileConfigId_Terms(String name, ConditionOptionCall<TermsBuilder> opLambda, OperatorCall<BsFileConfigToRoleCA> aggsLambda) {
        TermsBuilder builder = regTermsA(name, "fileConfigId");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FileConfigToRoleCA ca = new FileConfigToRoleCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void setFileConfigId_SignificantTerms() {
        setFileConfigId_SignificantTerms(null);
    }

    public void setFileConfigId_SignificantTerms(ConditionOptionCall<SignificantTermsBuilder> opLambda) {
        setFileConfigId_SignificantTerms("fileConfigId", opLambda, null);
    }

    public void setFileConfigId_SignificantTerms(ConditionOptionCall<SignificantTermsBuilder> opLambda,
            OperatorCall<BsFileConfigToRoleCA> aggsLambda) {
        setFileConfigId_SignificantTerms("fileConfigId", opLambda, aggsLambda);
    }

    public void setFileConfigId_SignificantTerms(String name, ConditionOptionCall<SignificantTermsBuilder> opLambda,
            OperatorCall<BsFileConfigToRoleCA> aggsLambda) {
        SignificantTermsBuilder builder = regSignificantTermsA(name, "fileConfigId");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FileConfigToRoleCA ca = new FileConfigToRoleCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void setFileConfigId_IpRange() {
        setFileConfigId_IpRange(null);
    }

    public void setFileConfigId_IpRange(ConditionOptionCall<IPv4RangeBuilder> opLambda) {
        setFileConfigId_IpRange("fileConfigId", opLambda, null);
    }

    public void setFileConfigId_IpRange(ConditionOptionCall<IPv4RangeBuilder> opLambda, OperatorCall<BsFileConfigToRoleCA> aggsLambda) {
        setFileConfigId_IpRange("fileConfigId", opLambda, aggsLambda);
    }

    public void setFileConfigId_IpRange(String name, ConditionOptionCall<IPv4RangeBuilder> opLambda,
            OperatorCall<BsFileConfigToRoleCA> aggsLambda) {
        IPv4RangeBuilder builder = regIpRangeA(name, "fileConfigId");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FileConfigToRoleCA ca = new FileConfigToRoleCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void setFileConfigId_Count() {
        setFileConfigId_Count(null);
    }

    public void setFileConfigId_Count(ConditionOptionCall<ValueCountBuilder> opLambda) {
        setFileConfigId_Count("fileConfigId", opLambda);
    }

    public void setFileConfigId_Count(String name, ConditionOptionCall<ValueCountBuilder> opLambda) {
        ValueCountBuilder builder = regCountA(name, "fileConfigId");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setFileConfigId_Cardinality() {
        setFileConfigId_Cardinality(null);
    }

    public void setFileConfigId_Cardinality(ConditionOptionCall<CardinalityBuilder> opLambda) {
        setFileConfigId_Cardinality("fileConfigId", opLambda);
    }

    public void setFileConfigId_Cardinality(String name, ConditionOptionCall<CardinalityBuilder> opLambda) {
        CardinalityBuilder builder = regCardinalityA(name, "fileConfigId");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setFileConfigId_Missing() {
        setFileConfigId_Missing(null);
    }

    public void setFileConfigId_Missing(ConditionOptionCall<MissingBuilder> opLambda) {
        setFileConfigId_Missing("fileConfigId", opLambda, null);
    }

    public void setFileConfigId_Missing(ConditionOptionCall<MissingBuilder> opLambda, OperatorCall<BsFileConfigToRoleCA> aggsLambda) {
        setFileConfigId_Missing("fileConfigId", opLambda, aggsLambda);
    }

    public void setFileConfigId_Missing(String name, ConditionOptionCall<MissingBuilder> opLambda,
            OperatorCall<BsFileConfigToRoleCA> aggsLambda) {
        MissingBuilder builder = regMissingA(name, "fileConfigId");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FileConfigToRoleCA ca = new FileConfigToRoleCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    // String roleTypeId

    public void setRoleTypeId_Terms() {
        setRoleTypeId_Terms(null);
    }

    public void setRoleTypeId_Terms(ConditionOptionCall<TermsBuilder> opLambda) {
        setRoleTypeId_Terms("roleTypeId", opLambda, null);
    }

    public void setRoleTypeId_Terms(ConditionOptionCall<TermsBuilder> opLambda, OperatorCall<BsFileConfigToRoleCA> aggsLambda) {
        setRoleTypeId_Terms("roleTypeId", opLambda, aggsLambda);
    }

    public void setRoleTypeId_Terms(String name, ConditionOptionCall<TermsBuilder> opLambda, OperatorCall<BsFileConfigToRoleCA> aggsLambda) {
        TermsBuilder builder = regTermsA(name, "roleTypeId");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FileConfigToRoleCA ca = new FileConfigToRoleCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void setRoleTypeId_SignificantTerms() {
        setRoleTypeId_SignificantTerms(null);
    }

    public void setRoleTypeId_SignificantTerms(ConditionOptionCall<SignificantTermsBuilder> opLambda) {
        setRoleTypeId_SignificantTerms("roleTypeId", opLambda, null);
    }

    public void setRoleTypeId_SignificantTerms(ConditionOptionCall<SignificantTermsBuilder> opLambda,
            OperatorCall<BsFileConfigToRoleCA> aggsLambda) {
        setRoleTypeId_SignificantTerms("roleTypeId", opLambda, aggsLambda);
    }

    public void setRoleTypeId_SignificantTerms(String name, ConditionOptionCall<SignificantTermsBuilder> opLambda,
            OperatorCall<BsFileConfigToRoleCA> aggsLambda) {
        SignificantTermsBuilder builder = regSignificantTermsA(name, "roleTypeId");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FileConfigToRoleCA ca = new FileConfigToRoleCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void setRoleTypeId_IpRange() {
        setRoleTypeId_IpRange(null);
    }

    public void setRoleTypeId_IpRange(ConditionOptionCall<IPv4RangeBuilder> opLambda) {
        setRoleTypeId_IpRange("roleTypeId", opLambda, null);
    }

    public void setRoleTypeId_IpRange(ConditionOptionCall<IPv4RangeBuilder> opLambda, OperatorCall<BsFileConfigToRoleCA> aggsLambda) {
        setRoleTypeId_IpRange("roleTypeId", opLambda, aggsLambda);
    }

    public void setRoleTypeId_IpRange(String name, ConditionOptionCall<IPv4RangeBuilder> opLambda,
            OperatorCall<BsFileConfigToRoleCA> aggsLambda) {
        IPv4RangeBuilder builder = regIpRangeA(name, "roleTypeId");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FileConfigToRoleCA ca = new FileConfigToRoleCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void setRoleTypeId_Count() {
        setRoleTypeId_Count(null);
    }

    public void setRoleTypeId_Count(ConditionOptionCall<ValueCountBuilder> opLambda) {
        setRoleTypeId_Count("roleTypeId", opLambda);
    }

    public void setRoleTypeId_Count(String name, ConditionOptionCall<ValueCountBuilder> opLambda) {
        ValueCountBuilder builder = regCountA(name, "roleTypeId");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setRoleTypeId_Cardinality() {
        setRoleTypeId_Cardinality(null);
    }

    public void setRoleTypeId_Cardinality(ConditionOptionCall<CardinalityBuilder> opLambda) {
        setRoleTypeId_Cardinality("roleTypeId", opLambda);
    }

    public void setRoleTypeId_Cardinality(String name, ConditionOptionCall<CardinalityBuilder> opLambda) {
        CardinalityBuilder builder = regCardinalityA(name, "roleTypeId");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setRoleTypeId_Missing() {
        setRoleTypeId_Missing(null);
    }

    public void setRoleTypeId_Missing(ConditionOptionCall<MissingBuilder> opLambda) {
        setRoleTypeId_Missing("roleTypeId", opLambda, null);
    }

    public void setRoleTypeId_Missing(ConditionOptionCall<MissingBuilder> opLambda, OperatorCall<BsFileConfigToRoleCA> aggsLambda) {
        setRoleTypeId_Missing("roleTypeId", opLambda, aggsLambda);
    }

    public void setRoleTypeId_Missing(String name, ConditionOptionCall<MissingBuilder> opLambda,
            OperatorCall<BsFileConfigToRoleCA> aggsLambda) {
        MissingBuilder builder = regMissingA(name, "roleTypeId");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FileConfigToRoleCA ca = new FileConfigToRoleCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

}
