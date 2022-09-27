package com.splitexpense.model.split;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.splitexpense.constant.SplitType;
import com.splitexpense.model.User;

import java.math.BigDecimal;
import java.util.Map;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = ExactSplitStrategy.class, name = "EXACT"),
        @JsonSubTypes.Type(value = PercentageSplitStrategy.class, name = "PERCENTAGE"),
        @JsonSubTypes.Type(value = EqualSplitStrategy.class, name = "EQUAL")})

public abstract class SplitStrategy {
    SplitType type;
    Map<User, BigDecimal> userWiseSplit;

    abstract public Map<User, BigDecimal> splitExpense(BigDecimal totalAmount);

}
