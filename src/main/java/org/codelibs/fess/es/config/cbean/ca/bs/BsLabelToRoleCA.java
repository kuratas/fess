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
import org.codelibs.fess.es.config.cbean.ca.LabelToRoleCA;
import org.codelibs.fess.es.config.cbean.cq.LabelToRoleCQ;
import org.codelibs.fess.es.config.cbean.cq.bs.BsLabelToRoleCQ;
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
public abstract class BsLabelToRoleCA extends EsAbstractConditionAggregation {

    // ===================================================================================
    //                                                                     Aggregation Set
    //                                                                           =========

    public void filter(String name, EsAbstractConditionQuery.OperatorCall<BsLabelToRoleCQ> queryLambda,
            ConditionOptionCall<FilterAggregationBuilder> opLambda, OperatorCall<BsLabelToRoleCA> aggsLambda) {
        LabelToRoleCQ cq = new LabelToRoleCQ();
        if (queryLambda != null) {
            queryLambda.callback(cq);
        }
        FilterAggregationBuilder builder = regFilterA(name, cq.getQuery());
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            LabelToRoleCA ca = new LabelToRoleCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void global(String name, ConditionOptionCall<GlobalBuilder> opLambda, OperatorCall<BsLabelToRoleCA> aggsLambda) {
        GlobalBuilder builder = regGlobalA(name);
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            LabelToRoleCA ca = new LabelToRoleCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void sampler(String name, ConditionOptionCall<SamplerAggregationBuilder> opLambda, OperatorCall<BsLabelToRoleCA> aggsLambda) {
        SamplerAggregationBuilder builder = regSamplerA(name);
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            LabelToRoleCA ca = new LabelToRoleCA();
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

    // String labelTypeId

    public void setLabelTypeId_Terms() {
        setLabelTypeId_Terms(null);
    }

    public void setLabelTypeId_Terms(ConditionOptionCall<TermsBuilder> opLambda) {
        setLabelTypeId_Terms("labelTypeId", opLambda, null);
    }

    public void setLabelTypeId_Terms(ConditionOptionCall<TermsBuilder> opLambda, OperatorCall<BsLabelToRoleCA> aggsLambda) {
        setLabelTypeId_Terms("labelTypeId", opLambda, aggsLambda);
    }

    public void setLabelTypeId_Terms(String name, ConditionOptionCall<TermsBuilder> opLambda, OperatorCall<BsLabelToRoleCA> aggsLambda) {
        TermsBuilder builder = regTermsA(name, "labelTypeId");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            LabelToRoleCA ca = new LabelToRoleCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void setLabelTypeId_SignificantTerms() {
        setLabelTypeId_SignificantTerms(null);
    }

    public void setLabelTypeId_SignificantTerms(ConditionOptionCall<SignificantTermsBuilder> opLambda) {
        setLabelTypeId_SignificantTerms("labelTypeId", opLambda, null);
    }

    public void setLabelTypeId_SignificantTerms(ConditionOptionCall<SignificantTermsBuilder> opLambda,
            OperatorCall<BsLabelToRoleCA> aggsLambda) {
        setLabelTypeId_SignificantTerms("labelTypeId", opLambda, aggsLambda);
    }

    public void setLabelTypeId_SignificantTerms(String name, ConditionOptionCall<SignificantTermsBuilder> opLambda,
            OperatorCall<BsLabelToRoleCA> aggsLambda) {
        SignificantTermsBuilder builder = regSignificantTermsA(name, "labelTypeId");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            LabelToRoleCA ca = new LabelToRoleCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void setLabelTypeId_IpRange() {
        setLabelTypeId_IpRange(null);
    }

    public void setLabelTypeId_IpRange(ConditionOptionCall<IPv4RangeBuilder> opLambda) {
        setLabelTypeId_IpRange("labelTypeId", opLambda, null);
    }

    public void setLabelTypeId_IpRange(ConditionOptionCall<IPv4RangeBuilder> opLambda, OperatorCall<BsLabelToRoleCA> aggsLambda) {
        setLabelTypeId_IpRange("labelTypeId", opLambda, aggsLambda);
    }

    public void setLabelTypeId_IpRange(String name, ConditionOptionCall<IPv4RangeBuilder> opLambda, OperatorCall<BsLabelToRoleCA> aggsLambda) {
        IPv4RangeBuilder builder = regIpRangeA(name, "labelTypeId");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            LabelToRoleCA ca = new LabelToRoleCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void setLabelTypeId_Count() {
        setLabelTypeId_Count(null);
    }

    public void setLabelTypeId_Count(ConditionOptionCall<ValueCountBuilder> opLambda) {
        setLabelTypeId_Count("labelTypeId", opLambda);
    }

    public void setLabelTypeId_Count(String name, ConditionOptionCall<ValueCountBuilder> opLambda) {
        ValueCountBuilder builder = regCountA(name, "labelTypeId");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setLabelTypeId_Cardinality() {
        setLabelTypeId_Cardinality(null);
    }

    public void setLabelTypeId_Cardinality(ConditionOptionCall<CardinalityBuilder> opLambda) {
        setLabelTypeId_Cardinality("labelTypeId", opLambda);
    }

    public void setLabelTypeId_Cardinality(String name, ConditionOptionCall<CardinalityBuilder> opLambda) {
        CardinalityBuilder builder = regCardinalityA(name, "labelTypeId");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setLabelTypeId_Missing() {
        setLabelTypeId_Missing(null);
    }

    public void setLabelTypeId_Missing(ConditionOptionCall<MissingBuilder> opLambda) {
        setLabelTypeId_Missing("labelTypeId", opLambda, null);
    }

    public void setLabelTypeId_Missing(ConditionOptionCall<MissingBuilder> opLambda, OperatorCall<BsLabelToRoleCA> aggsLambda) {
        setLabelTypeId_Missing("labelTypeId", opLambda, aggsLambda);
    }

    public void setLabelTypeId_Missing(String name, ConditionOptionCall<MissingBuilder> opLambda, OperatorCall<BsLabelToRoleCA> aggsLambda) {
        MissingBuilder builder = regMissingA(name, "labelTypeId");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            LabelToRoleCA ca = new LabelToRoleCA();
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

    public void setRoleTypeId_Terms(ConditionOptionCall<TermsBuilder> opLambda, OperatorCall<BsLabelToRoleCA> aggsLambda) {
        setRoleTypeId_Terms("roleTypeId", opLambda, aggsLambda);
    }

    public void setRoleTypeId_Terms(String name, ConditionOptionCall<TermsBuilder> opLambda, OperatorCall<BsLabelToRoleCA> aggsLambda) {
        TermsBuilder builder = regTermsA(name, "roleTypeId");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            LabelToRoleCA ca = new LabelToRoleCA();
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
            OperatorCall<BsLabelToRoleCA> aggsLambda) {
        setRoleTypeId_SignificantTerms("roleTypeId", opLambda, aggsLambda);
    }

    public void setRoleTypeId_SignificantTerms(String name, ConditionOptionCall<SignificantTermsBuilder> opLambda,
            OperatorCall<BsLabelToRoleCA> aggsLambda) {
        SignificantTermsBuilder builder = regSignificantTermsA(name, "roleTypeId");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            LabelToRoleCA ca = new LabelToRoleCA();
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

    public void setRoleTypeId_IpRange(ConditionOptionCall<IPv4RangeBuilder> opLambda, OperatorCall<BsLabelToRoleCA> aggsLambda) {
        setRoleTypeId_IpRange("roleTypeId", opLambda, aggsLambda);
    }

    public void setRoleTypeId_IpRange(String name, ConditionOptionCall<IPv4RangeBuilder> opLambda, OperatorCall<BsLabelToRoleCA> aggsLambda) {
        IPv4RangeBuilder builder = regIpRangeA(name, "roleTypeId");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            LabelToRoleCA ca = new LabelToRoleCA();
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

    public void setRoleTypeId_Missing(ConditionOptionCall<MissingBuilder> opLambda, OperatorCall<BsLabelToRoleCA> aggsLambda) {
        setRoleTypeId_Missing("roleTypeId", opLambda, aggsLambda);
    }

    public void setRoleTypeId_Missing(String name, ConditionOptionCall<MissingBuilder> opLambda, OperatorCall<BsLabelToRoleCA> aggsLambda) {
        MissingBuilder builder = regMissingA(name, "roleTypeId");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            LabelToRoleCA ca = new LabelToRoleCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

}
