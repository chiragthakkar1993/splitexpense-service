package com.splitexpense.model;

import com.splitexpense.model.split.SplitStrategy;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

@AllArgsConstructor
@Data
public class Expense {

    private String expenseId; //unique id
    private String expenseDescription;
    private BigDecimal totalAmount;
    private String remarks;
    private User addedBy;
    private User paidBy;
    private LocalDateTime createdAt;
    private SplitStrategy splitStrategy;
    private Map<User, BigDecimal> userWiseSplit; //[{user1: 49.50}, {user2: 33}, 	]


    public Expense(String expenseName, BigDecimal totalAmount, String expenseDescription, User addedBy, User paidBy, SplitStrategy splitStrategy) {
        this.expenseId = UUID.randomUUID().toString();
        this.expenseDescription = expenseDescription;
        this.totalAmount = totalAmount;
        this.createdAt = LocalDateTime.now();
        this.addedBy = addedBy;
        this.paidBy = paidBy;
        this.splitStrategy = splitStrategy;
    }

    public void updateSplit() {
        this.userWiseSplit = splitStrategy.splitExpense(totalAmount);
    }

    private boolean validateTotalAmount() {
        BigDecimal total = BigDecimal.ZERO;
        for (BigDecimal splitAmount : userWiseSplit.values()) total = total.add(splitAmount);

        if (total.compareTo(totalAmount) == 0) return true;

        return false;
    }

}
