package com.md.consumer.ruleConfig;

import com.alibaba.csp.sentinel.init.InitFunc;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;

import java.util.ArrayList;
import java.util.List;

// 限流规则 重写init方法
public class FlowRuleInitFunc implements InitFunc {
    @Override
    public void init(){
        List<FlowRule> rules = new ArrayList<>();
        FlowRule flowRule = new FlowRule();
        flowRule.setCount(1);
        flowRule.setResource("hello");
        flowRule.setGrade(RuleConstant.FLOW_GRADE_QPS);//降级模式，根据 RT 降级还是根据异常比例降级
        flowRule.setLimitApp("default");
        rules.add(flowRule);
        FlowRuleManager.loadRules(rules);

    }
}
