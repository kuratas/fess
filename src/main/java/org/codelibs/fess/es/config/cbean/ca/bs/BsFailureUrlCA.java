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
import org.codelibs.fess.es.config.cbean.ca.FailureUrlCA;
import org.codelibs.fess.es.config.cbean.cq.FailureUrlCQ;
import org.codelibs.fess.es.config.cbean.cq.bs.BsFailureUrlCQ;
import org.elasticsearch.search.aggregations.bucket.filter.FilterAggregationBuilder;
import org.elasticsearch.search.aggregations.bucket.global.GlobalBuilder;
import org.elasticsearch.search.aggregations.bucket.histogram.HistogramBuilder;
import org.elasticsearch.search.aggregations.bucket.missing.MissingBuilder;
import org.elasticsearch.search.aggregations.bucket.range.RangeBuilder;
import org.elasticsearch.search.aggregations.bucket.range.ipv4.IPv4RangeBuilder;
import org.elasticsearch.search.aggregations.bucket.sampler.SamplerAggregationBuilder;
import org.elasticsearch.search.aggregations.bucket.significant.SignificantTermsBuilder;
import org.elasticsearch.search.aggregations.bucket.terms.TermsBuilder;
import org.elasticsearch.search.aggregations.metrics.avg.AvgBuilder;
import org.elasticsearch.search.aggregations.metrics.cardinality.CardinalityBuilder;
import org.elasticsearch.search.aggregations.metrics.max.MaxBuilder;
import org.elasticsearch.search.aggregations.metrics.min.MinBuilder;
import org.elasticsearch.search.aggregations.metrics.percentiles.PercentileRanksBuilder;
import org.elasticsearch.search.aggregations.metrics.percentiles.PercentilesBuilder;
import org.elasticsearch.search.aggregations.metrics.scripted.ScriptedMetricBuilder;
import org.elasticsearch.search.aggregations.metrics.stats.StatsBuilder;
import org.elasticsearch.search.aggregations.metrics.stats.extended.ExtendedStatsBuilder;
import org.elasticsearch.search.aggregations.metrics.sum.SumBuilder;
import org.elasticsearch.search.aggregations.metrics.tophits.TopHitsBuilder;
import org.elasticsearch.search.aggregations.metrics.valuecount.ValueCountBuilder;

/**
 * @author ESFlute (using FreeGen)
 */
public abstract class BsFailureUrlCA extends EsAbstractConditionAggregation {

    // ===================================================================================
    //                                                                     Aggregation Set
    //                                                                           =========

    public void filter(String name, EsAbstractConditionQuery.OperatorCall<BsFailureUrlCQ> queryLambda,
            ConditionOptionCall<FilterAggregationBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        FailureUrlCQ cq = new FailureUrlCQ();
        if (queryLambda != null) {
            queryLambda.callback(cq);
        }
        FilterAggregationBuilder builder = regFilterA(name, cq.getQuery());
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FailureUrlCA ca = new FailureUrlCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void global(String name, ConditionOptionCall<GlobalBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        GlobalBuilder builder = regGlobalA(name);
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FailureUrlCA ca = new FailureUrlCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void sampler(String name, ConditionOptionCall<SamplerAggregationBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        SamplerAggregationBuilder builder = regSamplerA(name);
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FailureUrlCA ca = new FailureUrlCA();
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

    // String configId

    public void setConfigId_Terms() {
        setConfigId_Terms(null);
    }

    public void setConfigId_Terms(ConditionOptionCall<TermsBuilder> opLambda) {
        setConfigId_Terms("configId", opLambda, null);
    }

    public void setConfigId_Terms(ConditionOptionCall<TermsBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        setConfigId_Terms("configId", opLambda, aggsLambda);
    }

    public void setConfigId_Terms(String name, ConditionOptionCall<TermsBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        TermsBuilder builder = regTermsA(name, "configId");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FailureUrlCA ca = new FailureUrlCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void setConfigId_SignificantTerms() {
        setConfigId_SignificantTerms(null);
    }

    public void setConfigId_SignificantTerms(ConditionOptionCall<SignificantTermsBuilder> opLambda) {
        setConfigId_SignificantTerms("configId", opLambda, null);
    }

    public void setConfigId_SignificantTerms(ConditionOptionCall<SignificantTermsBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        setConfigId_SignificantTerms("configId", opLambda, aggsLambda);
    }

    public void setConfigId_SignificantTerms(String name, ConditionOptionCall<SignificantTermsBuilder> opLambda,
            OperatorCall<BsFailureUrlCA> aggsLambda) {
        SignificantTermsBuilder builder = regSignificantTermsA(name, "configId");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FailureUrlCA ca = new FailureUrlCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void setConfigId_IpRange() {
        setConfigId_IpRange(null);
    }

    public void setConfigId_IpRange(ConditionOptionCall<IPv4RangeBuilder> opLambda) {
        setConfigId_IpRange("configId", opLambda, null);
    }

    public void setConfigId_IpRange(ConditionOptionCall<IPv4RangeBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        setConfigId_IpRange("configId", opLambda, aggsLambda);
    }

    public void setConfigId_IpRange(String name, ConditionOptionCall<IPv4RangeBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        IPv4RangeBuilder builder = regIpRangeA(name, "configId");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FailureUrlCA ca = new FailureUrlCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void setConfigId_Count() {
        setConfigId_Count(null);
    }

    public void setConfigId_Count(ConditionOptionCall<ValueCountBuilder> opLambda) {
        setConfigId_Count("configId", opLambda);
    }

    public void setConfigId_Count(String name, ConditionOptionCall<ValueCountBuilder> opLambda) {
        ValueCountBuilder builder = regCountA(name, "configId");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setConfigId_Cardinality() {
        setConfigId_Cardinality(null);
    }

    public void setConfigId_Cardinality(ConditionOptionCall<CardinalityBuilder> opLambda) {
        setConfigId_Cardinality("configId", opLambda);
    }

    public void setConfigId_Cardinality(String name, ConditionOptionCall<CardinalityBuilder> opLambda) {
        CardinalityBuilder builder = regCardinalityA(name, "configId");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setConfigId_Missing() {
        setConfigId_Missing(null);
    }

    public void setConfigId_Missing(ConditionOptionCall<MissingBuilder> opLambda) {
        setConfigId_Missing("configId", opLambda, null);
    }

    public void setConfigId_Missing(ConditionOptionCall<MissingBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        setConfigId_Missing("configId", opLambda, aggsLambda);
    }

    public void setConfigId_Missing(String name, ConditionOptionCall<MissingBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        MissingBuilder builder = regMissingA(name, "configId");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FailureUrlCA ca = new FailureUrlCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    // Integer errorCount
    public void setErrorCount_Avg() {
        setErrorCount_Avg(null);
    }

    public void setErrorCount_Avg(ConditionOptionCall<AvgBuilder> opLambda) {
        setErrorCount_Avg("errorCount", opLambda);
    }

    public void setErrorCount_Avg(String name, ConditionOptionCall<AvgBuilder> opLambda) {
        AvgBuilder builder = regAvgA(name, "errorCount");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setErrorCount_Max() {
        setErrorCount_Max(null);
    }

    public void setErrorCount_Max(ConditionOptionCall<MaxBuilder> opLambda) {
        setErrorCount_Max("errorCount", opLambda);
    }

    public void setErrorCount_Max(String name, ConditionOptionCall<MaxBuilder> opLambda) {
        MaxBuilder builder = regMaxA(name, "errorCount");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setErrorCount_Min() {
        setErrorCount_Min(null);
    }

    public void setErrorCount_Min(ConditionOptionCall<MinBuilder> opLambda) {
        setErrorCount_Min("errorCount", opLambda);
    }

    public void setErrorCount_Min(String name, ConditionOptionCall<MinBuilder> opLambda) {
        MinBuilder builder = regMinA(name, "errorCount");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setErrorCount_Sum() {
        setErrorCount_Sum(null);
    }

    public void setErrorCount_Sum(ConditionOptionCall<SumBuilder> opLambda) {
        setErrorCount_Sum("errorCount", opLambda);
    }

    public void setErrorCount_Sum(String name, ConditionOptionCall<SumBuilder> opLambda) {
        SumBuilder builder = regSumA(name, "errorCount");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setErrorCount_ExtendedStats() {
        setErrorCount_ExtendedStats(null);
    }

    public void setErrorCount_ExtendedStats(ConditionOptionCall<ExtendedStatsBuilder> opLambda) {
        setErrorCount_ExtendedStats("errorCount", opLambda);
    }

    public void setErrorCount_ExtendedStats(String name, ConditionOptionCall<ExtendedStatsBuilder> opLambda) {
        ExtendedStatsBuilder builder = regExtendedStatsA(name, "errorCount");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setErrorCount_Stats() {
        setErrorCount_Stats(null);
    }

    public void setErrorCount_Stats(ConditionOptionCall<StatsBuilder> opLambda) {
        setErrorCount_Stats("errorCount", opLambda);
    }

    public void setErrorCount_Stats(String name, ConditionOptionCall<StatsBuilder> opLambda) {
        StatsBuilder builder = regStatsA(name, "errorCount");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setErrorCount_Percentiles() {
        setErrorCount_Percentiles(null);
    }

    public void setErrorCount_Percentiles(ConditionOptionCall<PercentilesBuilder> opLambda) {
        setErrorCount_Percentiles("errorCount", opLambda);
    }

    public void setErrorCount_Percentiles(String name, ConditionOptionCall<PercentilesBuilder> opLambda) {
        PercentilesBuilder builder = regPercentilesA(name, "errorCount");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setErrorCount_PercentileRanks() {
        setErrorCount_PercentileRanks(null);
    }

    public void setErrorCount_PercentileRanks(ConditionOptionCall<PercentileRanksBuilder> opLambda) {
        setErrorCount_PercentileRanks("errorCount", opLambda);
    }

    public void setErrorCount_PercentileRanks(String name, ConditionOptionCall<PercentileRanksBuilder> opLambda) {
        PercentileRanksBuilder builder = regPercentileRanksA(name, "errorCount");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setErrorCount_Histogram() {
        setErrorCount_Histogram(null);
    }

    public void setErrorCount_Histogram(ConditionOptionCall<HistogramBuilder> opLambda) {
        setErrorCount_Histogram("errorCount", opLambda, null);
    }

    public void setErrorCount_Histogram(ConditionOptionCall<HistogramBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        setErrorCount_Histogram("errorCount", opLambda, aggsLambda);
    }

    public void setErrorCount_Histogram(String name, ConditionOptionCall<HistogramBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        HistogramBuilder builder = regHistogramA(name, "errorCount");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FailureUrlCA ca = new FailureUrlCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void setErrorCount_Range() {
        setErrorCount_Range(null);
    }

    public void setErrorCount_Range(ConditionOptionCall<RangeBuilder> opLambda) {
        setErrorCount_Range("errorCount", opLambda, null);
    }

    public void setErrorCount_Range(ConditionOptionCall<RangeBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        setErrorCount_Range("errorCount", opLambda, aggsLambda);
    }

    public void setErrorCount_Range(String name, ConditionOptionCall<RangeBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        RangeBuilder builder = regRangeA(name, "errorCount");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FailureUrlCA ca = new FailureUrlCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void setErrorCount_Count() {
        setErrorCount_Count(null);
    }

    public void setErrorCount_Count(ConditionOptionCall<ValueCountBuilder> opLambda) {
        setErrorCount_Count("errorCount", opLambda);
    }

    public void setErrorCount_Count(String name, ConditionOptionCall<ValueCountBuilder> opLambda) {
        ValueCountBuilder builder = regCountA(name, "errorCount");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setErrorCount_Cardinality() {
        setErrorCount_Cardinality(null);
    }

    public void setErrorCount_Cardinality(ConditionOptionCall<CardinalityBuilder> opLambda) {
        setErrorCount_Cardinality("errorCount", opLambda);
    }

    public void setErrorCount_Cardinality(String name, ConditionOptionCall<CardinalityBuilder> opLambda) {
        CardinalityBuilder builder = regCardinalityA(name, "errorCount");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setErrorCount_Missing() {
        setErrorCount_Missing(null);
    }

    public void setErrorCount_Missing(ConditionOptionCall<MissingBuilder> opLambda) {
        setErrorCount_Missing("errorCount", opLambda, null);
    }

    public void setErrorCount_Missing(ConditionOptionCall<MissingBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        setErrorCount_Missing("errorCount", opLambda, aggsLambda);
    }

    public void setErrorCount_Missing(String name, ConditionOptionCall<MissingBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        MissingBuilder builder = regMissingA(name, "errorCount");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FailureUrlCA ca = new FailureUrlCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    // String errorLog

    public void setErrorLog_Terms() {
        setErrorLog_Terms(null);
    }

    public void setErrorLog_Terms(ConditionOptionCall<TermsBuilder> opLambda) {
        setErrorLog_Terms("errorLog", opLambda, null);
    }

    public void setErrorLog_Terms(ConditionOptionCall<TermsBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        setErrorLog_Terms("errorLog", opLambda, aggsLambda);
    }

    public void setErrorLog_Terms(String name, ConditionOptionCall<TermsBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        TermsBuilder builder = regTermsA(name, "errorLog");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FailureUrlCA ca = new FailureUrlCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void setErrorLog_SignificantTerms() {
        setErrorLog_SignificantTerms(null);
    }

    public void setErrorLog_SignificantTerms(ConditionOptionCall<SignificantTermsBuilder> opLambda) {
        setErrorLog_SignificantTerms("errorLog", opLambda, null);
    }

    public void setErrorLog_SignificantTerms(ConditionOptionCall<SignificantTermsBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        setErrorLog_SignificantTerms("errorLog", opLambda, aggsLambda);
    }

    public void setErrorLog_SignificantTerms(String name, ConditionOptionCall<SignificantTermsBuilder> opLambda,
            OperatorCall<BsFailureUrlCA> aggsLambda) {
        SignificantTermsBuilder builder = regSignificantTermsA(name, "errorLog");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FailureUrlCA ca = new FailureUrlCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void setErrorLog_IpRange() {
        setErrorLog_IpRange(null);
    }

    public void setErrorLog_IpRange(ConditionOptionCall<IPv4RangeBuilder> opLambda) {
        setErrorLog_IpRange("errorLog", opLambda, null);
    }

    public void setErrorLog_IpRange(ConditionOptionCall<IPv4RangeBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        setErrorLog_IpRange("errorLog", opLambda, aggsLambda);
    }

    public void setErrorLog_IpRange(String name, ConditionOptionCall<IPv4RangeBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        IPv4RangeBuilder builder = regIpRangeA(name, "errorLog");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FailureUrlCA ca = new FailureUrlCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void setErrorLog_Count() {
        setErrorLog_Count(null);
    }

    public void setErrorLog_Count(ConditionOptionCall<ValueCountBuilder> opLambda) {
        setErrorLog_Count("errorLog", opLambda);
    }

    public void setErrorLog_Count(String name, ConditionOptionCall<ValueCountBuilder> opLambda) {
        ValueCountBuilder builder = regCountA(name, "errorLog");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setErrorLog_Cardinality() {
        setErrorLog_Cardinality(null);
    }

    public void setErrorLog_Cardinality(ConditionOptionCall<CardinalityBuilder> opLambda) {
        setErrorLog_Cardinality("errorLog", opLambda);
    }

    public void setErrorLog_Cardinality(String name, ConditionOptionCall<CardinalityBuilder> opLambda) {
        CardinalityBuilder builder = regCardinalityA(name, "errorLog");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setErrorLog_Missing() {
        setErrorLog_Missing(null);
    }

    public void setErrorLog_Missing(ConditionOptionCall<MissingBuilder> opLambda) {
        setErrorLog_Missing("errorLog", opLambda, null);
    }

    public void setErrorLog_Missing(ConditionOptionCall<MissingBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        setErrorLog_Missing("errorLog", opLambda, aggsLambda);
    }

    public void setErrorLog_Missing(String name, ConditionOptionCall<MissingBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        MissingBuilder builder = regMissingA(name, "errorLog");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FailureUrlCA ca = new FailureUrlCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    // String errorName

    public void setErrorName_Terms() {
        setErrorName_Terms(null);
    }

    public void setErrorName_Terms(ConditionOptionCall<TermsBuilder> opLambda) {
        setErrorName_Terms("errorName", opLambda, null);
    }

    public void setErrorName_Terms(ConditionOptionCall<TermsBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        setErrorName_Terms("errorName", opLambda, aggsLambda);
    }

    public void setErrorName_Terms(String name, ConditionOptionCall<TermsBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        TermsBuilder builder = regTermsA(name, "errorName");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FailureUrlCA ca = new FailureUrlCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void setErrorName_SignificantTerms() {
        setErrorName_SignificantTerms(null);
    }

    public void setErrorName_SignificantTerms(ConditionOptionCall<SignificantTermsBuilder> opLambda) {
        setErrorName_SignificantTerms("errorName", opLambda, null);
    }

    public void setErrorName_SignificantTerms(ConditionOptionCall<SignificantTermsBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        setErrorName_SignificantTerms("errorName", opLambda, aggsLambda);
    }

    public void setErrorName_SignificantTerms(String name, ConditionOptionCall<SignificantTermsBuilder> opLambda,
            OperatorCall<BsFailureUrlCA> aggsLambda) {
        SignificantTermsBuilder builder = regSignificantTermsA(name, "errorName");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FailureUrlCA ca = new FailureUrlCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void setErrorName_IpRange() {
        setErrorName_IpRange(null);
    }

    public void setErrorName_IpRange(ConditionOptionCall<IPv4RangeBuilder> opLambda) {
        setErrorName_IpRange("errorName", opLambda, null);
    }

    public void setErrorName_IpRange(ConditionOptionCall<IPv4RangeBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        setErrorName_IpRange("errorName", opLambda, aggsLambda);
    }

    public void setErrorName_IpRange(String name, ConditionOptionCall<IPv4RangeBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        IPv4RangeBuilder builder = regIpRangeA(name, "errorName");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FailureUrlCA ca = new FailureUrlCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void setErrorName_Count() {
        setErrorName_Count(null);
    }

    public void setErrorName_Count(ConditionOptionCall<ValueCountBuilder> opLambda) {
        setErrorName_Count("errorName", opLambda);
    }

    public void setErrorName_Count(String name, ConditionOptionCall<ValueCountBuilder> opLambda) {
        ValueCountBuilder builder = regCountA(name, "errorName");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setErrorName_Cardinality() {
        setErrorName_Cardinality(null);
    }

    public void setErrorName_Cardinality(ConditionOptionCall<CardinalityBuilder> opLambda) {
        setErrorName_Cardinality("errorName", opLambda);
    }

    public void setErrorName_Cardinality(String name, ConditionOptionCall<CardinalityBuilder> opLambda) {
        CardinalityBuilder builder = regCardinalityA(name, "errorName");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setErrorName_Missing() {
        setErrorName_Missing(null);
    }

    public void setErrorName_Missing(ConditionOptionCall<MissingBuilder> opLambda) {
        setErrorName_Missing("errorName", opLambda, null);
    }

    public void setErrorName_Missing(ConditionOptionCall<MissingBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        setErrorName_Missing("errorName", opLambda, aggsLambda);
    }

    public void setErrorName_Missing(String name, ConditionOptionCall<MissingBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        MissingBuilder builder = regMissingA(name, "errorName");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FailureUrlCA ca = new FailureUrlCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    // Long lastAccessTime
    public void setLastAccessTime_Avg() {
        setLastAccessTime_Avg(null);
    }

    public void setLastAccessTime_Avg(ConditionOptionCall<AvgBuilder> opLambda) {
        setLastAccessTime_Avg("lastAccessTime", opLambda);
    }

    public void setLastAccessTime_Avg(String name, ConditionOptionCall<AvgBuilder> opLambda) {
        AvgBuilder builder = regAvgA(name, "lastAccessTime");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setLastAccessTime_Max() {
        setLastAccessTime_Max(null);
    }

    public void setLastAccessTime_Max(ConditionOptionCall<MaxBuilder> opLambda) {
        setLastAccessTime_Max("lastAccessTime", opLambda);
    }

    public void setLastAccessTime_Max(String name, ConditionOptionCall<MaxBuilder> opLambda) {
        MaxBuilder builder = regMaxA(name, "lastAccessTime");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setLastAccessTime_Min() {
        setLastAccessTime_Min(null);
    }

    public void setLastAccessTime_Min(ConditionOptionCall<MinBuilder> opLambda) {
        setLastAccessTime_Min("lastAccessTime", opLambda);
    }

    public void setLastAccessTime_Min(String name, ConditionOptionCall<MinBuilder> opLambda) {
        MinBuilder builder = regMinA(name, "lastAccessTime");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setLastAccessTime_Sum() {
        setLastAccessTime_Sum(null);
    }

    public void setLastAccessTime_Sum(ConditionOptionCall<SumBuilder> opLambda) {
        setLastAccessTime_Sum("lastAccessTime", opLambda);
    }

    public void setLastAccessTime_Sum(String name, ConditionOptionCall<SumBuilder> opLambda) {
        SumBuilder builder = regSumA(name, "lastAccessTime");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setLastAccessTime_ExtendedStats() {
        setLastAccessTime_ExtendedStats(null);
    }

    public void setLastAccessTime_ExtendedStats(ConditionOptionCall<ExtendedStatsBuilder> opLambda) {
        setLastAccessTime_ExtendedStats("lastAccessTime", opLambda);
    }

    public void setLastAccessTime_ExtendedStats(String name, ConditionOptionCall<ExtendedStatsBuilder> opLambda) {
        ExtendedStatsBuilder builder = regExtendedStatsA(name, "lastAccessTime");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setLastAccessTime_Stats() {
        setLastAccessTime_Stats(null);
    }

    public void setLastAccessTime_Stats(ConditionOptionCall<StatsBuilder> opLambda) {
        setLastAccessTime_Stats("lastAccessTime", opLambda);
    }

    public void setLastAccessTime_Stats(String name, ConditionOptionCall<StatsBuilder> opLambda) {
        StatsBuilder builder = regStatsA(name, "lastAccessTime");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setLastAccessTime_Percentiles() {
        setLastAccessTime_Percentiles(null);
    }

    public void setLastAccessTime_Percentiles(ConditionOptionCall<PercentilesBuilder> opLambda) {
        setLastAccessTime_Percentiles("lastAccessTime", opLambda);
    }

    public void setLastAccessTime_Percentiles(String name, ConditionOptionCall<PercentilesBuilder> opLambda) {
        PercentilesBuilder builder = regPercentilesA(name, "lastAccessTime");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setLastAccessTime_PercentileRanks() {
        setLastAccessTime_PercentileRanks(null);
    }

    public void setLastAccessTime_PercentileRanks(ConditionOptionCall<PercentileRanksBuilder> opLambda) {
        setLastAccessTime_PercentileRanks("lastAccessTime", opLambda);
    }

    public void setLastAccessTime_PercentileRanks(String name, ConditionOptionCall<PercentileRanksBuilder> opLambda) {
        PercentileRanksBuilder builder = regPercentileRanksA(name, "lastAccessTime");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setLastAccessTime_Histogram() {
        setLastAccessTime_Histogram(null);
    }

    public void setLastAccessTime_Histogram(ConditionOptionCall<HistogramBuilder> opLambda) {
        setLastAccessTime_Histogram("lastAccessTime", opLambda, null);
    }

    public void setLastAccessTime_Histogram(ConditionOptionCall<HistogramBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        setLastAccessTime_Histogram("lastAccessTime", opLambda, aggsLambda);
    }

    public void setLastAccessTime_Histogram(String name, ConditionOptionCall<HistogramBuilder> opLambda,
            OperatorCall<BsFailureUrlCA> aggsLambda) {
        HistogramBuilder builder = regHistogramA(name, "lastAccessTime");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FailureUrlCA ca = new FailureUrlCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void setLastAccessTime_Range() {
        setLastAccessTime_Range(null);
    }

    public void setLastAccessTime_Range(ConditionOptionCall<RangeBuilder> opLambda) {
        setLastAccessTime_Range("lastAccessTime", opLambda, null);
    }

    public void setLastAccessTime_Range(ConditionOptionCall<RangeBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        setLastAccessTime_Range("lastAccessTime", opLambda, aggsLambda);
    }

    public void setLastAccessTime_Range(String name, ConditionOptionCall<RangeBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        RangeBuilder builder = regRangeA(name, "lastAccessTime");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FailureUrlCA ca = new FailureUrlCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void setLastAccessTime_Count() {
        setLastAccessTime_Count(null);
    }

    public void setLastAccessTime_Count(ConditionOptionCall<ValueCountBuilder> opLambda) {
        setLastAccessTime_Count("lastAccessTime", opLambda);
    }

    public void setLastAccessTime_Count(String name, ConditionOptionCall<ValueCountBuilder> opLambda) {
        ValueCountBuilder builder = regCountA(name, "lastAccessTime");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setLastAccessTime_Cardinality() {
        setLastAccessTime_Cardinality(null);
    }

    public void setLastAccessTime_Cardinality(ConditionOptionCall<CardinalityBuilder> opLambda) {
        setLastAccessTime_Cardinality("lastAccessTime", opLambda);
    }

    public void setLastAccessTime_Cardinality(String name, ConditionOptionCall<CardinalityBuilder> opLambda) {
        CardinalityBuilder builder = regCardinalityA(name, "lastAccessTime");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setLastAccessTime_Missing() {
        setLastAccessTime_Missing(null);
    }

    public void setLastAccessTime_Missing(ConditionOptionCall<MissingBuilder> opLambda) {
        setLastAccessTime_Missing("lastAccessTime", opLambda, null);
    }

    public void setLastAccessTime_Missing(ConditionOptionCall<MissingBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        setLastAccessTime_Missing("lastAccessTime", opLambda, aggsLambda);
    }

    public void setLastAccessTime_Missing(String name, ConditionOptionCall<MissingBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        MissingBuilder builder = regMissingA(name, "lastAccessTime");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FailureUrlCA ca = new FailureUrlCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    // String threadName

    public void setThreadName_Terms() {
        setThreadName_Terms(null);
    }

    public void setThreadName_Terms(ConditionOptionCall<TermsBuilder> opLambda) {
        setThreadName_Terms("threadName", opLambda, null);
    }

    public void setThreadName_Terms(ConditionOptionCall<TermsBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        setThreadName_Terms("threadName", opLambda, aggsLambda);
    }

    public void setThreadName_Terms(String name, ConditionOptionCall<TermsBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        TermsBuilder builder = regTermsA(name, "threadName");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FailureUrlCA ca = new FailureUrlCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void setThreadName_SignificantTerms() {
        setThreadName_SignificantTerms(null);
    }

    public void setThreadName_SignificantTerms(ConditionOptionCall<SignificantTermsBuilder> opLambda) {
        setThreadName_SignificantTerms("threadName", opLambda, null);
    }

    public void setThreadName_SignificantTerms(ConditionOptionCall<SignificantTermsBuilder> opLambda,
            OperatorCall<BsFailureUrlCA> aggsLambda) {
        setThreadName_SignificantTerms("threadName", opLambda, aggsLambda);
    }

    public void setThreadName_SignificantTerms(String name, ConditionOptionCall<SignificantTermsBuilder> opLambda,
            OperatorCall<BsFailureUrlCA> aggsLambda) {
        SignificantTermsBuilder builder = regSignificantTermsA(name, "threadName");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FailureUrlCA ca = new FailureUrlCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void setThreadName_IpRange() {
        setThreadName_IpRange(null);
    }

    public void setThreadName_IpRange(ConditionOptionCall<IPv4RangeBuilder> opLambda) {
        setThreadName_IpRange("threadName", opLambda, null);
    }

    public void setThreadName_IpRange(ConditionOptionCall<IPv4RangeBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        setThreadName_IpRange("threadName", opLambda, aggsLambda);
    }

    public void setThreadName_IpRange(String name, ConditionOptionCall<IPv4RangeBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        IPv4RangeBuilder builder = regIpRangeA(name, "threadName");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FailureUrlCA ca = new FailureUrlCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void setThreadName_Count() {
        setThreadName_Count(null);
    }

    public void setThreadName_Count(ConditionOptionCall<ValueCountBuilder> opLambda) {
        setThreadName_Count("threadName", opLambda);
    }

    public void setThreadName_Count(String name, ConditionOptionCall<ValueCountBuilder> opLambda) {
        ValueCountBuilder builder = regCountA(name, "threadName");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setThreadName_Cardinality() {
        setThreadName_Cardinality(null);
    }

    public void setThreadName_Cardinality(ConditionOptionCall<CardinalityBuilder> opLambda) {
        setThreadName_Cardinality("threadName", opLambda);
    }

    public void setThreadName_Cardinality(String name, ConditionOptionCall<CardinalityBuilder> opLambda) {
        CardinalityBuilder builder = regCardinalityA(name, "threadName");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setThreadName_Missing() {
        setThreadName_Missing(null);
    }

    public void setThreadName_Missing(ConditionOptionCall<MissingBuilder> opLambda) {
        setThreadName_Missing("threadName", opLambda, null);
    }

    public void setThreadName_Missing(ConditionOptionCall<MissingBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        setThreadName_Missing("threadName", opLambda, aggsLambda);
    }

    public void setThreadName_Missing(String name, ConditionOptionCall<MissingBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        MissingBuilder builder = regMissingA(name, "threadName");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FailureUrlCA ca = new FailureUrlCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    // String url

    public void setUrl_Terms() {
        setUrl_Terms(null);
    }

    public void setUrl_Terms(ConditionOptionCall<TermsBuilder> opLambda) {
        setUrl_Terms("url", opLambda, null);
    }

    public void setUrl_Terms(ConditionOptionCall<TermsBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        setUrl_Terms("url", opLambda, aggsLambda);
    }

    public void setUrl_Terms(String name, ConditionOptionCall<TermsBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        TermsBuilder builder = regTermsA(name, "url");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FailureUrlCA ca = new FailureUrlCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void setUrl_SignificantTerms() {
        setUrl_SignificantTerms(null);
    }

    public void setUrl_SignificantTerms(ConditionOptionCall<SignificantTermsBuilder> opLambda) {
        setUrl_SignificantTerms("url", opLambda, null);
    }

    public void setUrl_SignificantTerms(ConditionOptionCall<SignificantTermsBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        setUrl_SignificantTerms("url", opLambda, aggsLambda);
    }

    public void setUrl_SignificantTerms(String name, ConditionOptionCall<SignificantTermsBuilder> opLambda,
            OperatorCall<BsFailureUrlCA> aggsLambda) {
        SignificantTermsBuilder builder = regSignificantTermsA(name, "url");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FailureUrlCA ca = new FailureUrlCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void setUrl_IpRange() {
        setUrl_IpRange(null);
    }

    public void setUrl_IpRange(ConditionOptionCall<IPv4RangeBuilder> opLambda) {
        setUrl_IpRange("url", opLambda, null);
    }

    public void setUrl_IpRange(ConditionOptionCall<IPv4RangeBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        setUrl_IpRange("url", opLambda, aggsLambda);
    }

    public void setUrl_IpRange(String name, ConditionOptionCall<IPv4RangeBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        IPv4RangeBuilder builder = regIpRangeA(name, "url");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FailureUrlCA ca = new FailureUrlCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

    public void setUrl_Count() {
        setUrl_Count(null);
    }

    public void setUrl_Count(ConditionOptionCall<ValueCountBuilder> opLambda) {
        setUrl_Count("url", opLambda);
    }

    public void setUrl_Count(String name, ConditionOptionCall<ValueCountBuilder> opLambda) {
        ValueCountBuilder builder = regCountA(name, "url");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setUrl_Cardinality() {
        setUrl_Cardinality(null);
    }

    public void setUrl_Cardinality(ConditionOptionCall<CardinalityBuilder> opLambda) {
        setUrl_Cardinality("url", opLambda);
    }

    public void setUrl_Cardinality(String name, ConditionOptionCall<CardinalityBuilder> opLambda) {
        CardinalityBuilder builder = regCardinalityA(name, "url");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
    }

    public void setUrl_Missing() {
        setUrl_Missing(null);
    }

    public void setUrl_Missing(ConditionOptionCall<MissingBuilder> opLambda) {
        setUrl_Missing("url", opLambda, null);
    }

    public void setUrl_Missing(ConditionOptionCall<MissingBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        setUrl_Missing("url", opLambda, aggsLambda);
    }

    public void setUrl_Missing(String name, ConditionOptionCall<MissingBuilder> opLambda, OperatorCall<BsFailureUrlCA> aggsLambda) {
        MissingBuilder builder = regMissingA(name, "url");
        if (opLambda != null) {
            opLambda.callback(builder);
        }
        if (aggsLambda != null) {
            FailureUrlCA ca = new FailureUrlCA();
            aggsLambda.callback(ca);
            ca.getAggregationBuilderList().forEach(builder::subAggregation);
        }
    }

}
