package com.splitexpense.model.split;

import com.splitexpense.model.User;

import java.math.BigDecimal;
import java.util.Map;
import java.util.stream.Collectors;

public class ExactSplitStrategy extends SplitStrategy {


    @Override
    public Map<User, BigDecimal> splitExpense(BigDecimal totalAMount) {
        return this.userWiseSplit.entrySet().stream()
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
    }
}
