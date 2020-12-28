/**
 * Copyright (c) 2020 dingqianwen (761945125@qq.com)
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.ruleengine.core.rule;

import cn.ruleengine.core.Input;
import cn.ruleengine.core.JsonParse;
import cn.ruleengine.core.RuleEngineConfiguration;
import lombok.Data;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 * 引入规则集，改进单规则弊端
 *
 * @author 丁乾文
 * @create 2020/12/27
 * @since 1.0.0
 */
@Data
public class RuleSet implements JsonParse {

    /**
     * 规则集
     */
    private List<Rule> rules = new ArrayList<>();

    /**
     * 默认规则
     */
    private Rule defaultRule;

    /**
     * 默认匹配所有的规则结果
     */
    private StrategyType strategyType = StrategyType.ALL_RULE;

    @Nullable
    public Object execute(@NonNull Input input, @NonNull RuleEngineConfiguration configuration) {
        return null;
    }

}
