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
package cn.ruleengine.core.decisiontable;

import cn.ruleengine.core.RuleEngineConfiguration;
import cn.ruleengine.core.Input;
import cn.ruleengine.core.condition.Operator;
import cn.ruleengine.core.value.Value;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author dingqianwen
 * @date 2020/12/18
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
public class CollHead {

    /**
     * 条件左值
     */
    private Value leftValue;

    /**
     * 运算符
     */
    private Operator operator;

    public CollHead(Value leftValue, Operator operator) {
        this.leftValue = leftValue;
        this.operator = operator;
    }

    public Object getLeftValue(@NonNull Input input, @NonNull RuleEngineConfiguration configuration) {
        return this.leftValue.getValue(input, configuration);
    }

}
