package com.splitexpense;

import com.splitexpense.constant.TransactionType;
import com.splitexpense.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDetails {
    private TransactionType transactionType;
    private User user;
    private BigDecimal amount;


}
