package com.splitexpense.model;

import com.splitexpense.TransactionDetails;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
public class User {
    private String userId = UUID.randomUUID().toString();
    private String name;
    private String email;
    private String mobileNumber;
    private List<TransactionDetails> transactionDetails;

    public User(String name, String email, String mobileNumber) {
        this.userId = UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }
}
