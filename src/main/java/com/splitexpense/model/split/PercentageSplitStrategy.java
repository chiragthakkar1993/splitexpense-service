package com.splitexpense.model.split;

import com.splitexpense.model.User;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map;
import java.util.stream.Collectors;

public class PercentageSplitStrategy extends SplitStrategy {

    @Override
    public Map<User, BigDecimal> splitExpense(BigDecimal totalAMount) {
        return this.userWiseSplit.entrySet().stream()
                .map(e ->
                        new SimpleEntry<User, BigDecimal>(e.getKey(),
                                e.getValue().divide(totalAMount)
                                        .multiply(BigDecimal.valueOf(100))
                                        .setScale(2, RoundingMode.HALF_EVEN)))
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));


    }
}
