package com.splitexpense;

import com.splitexpense.constant.GroupType;
import com.splitexpense.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.UUID;

@NoArgsConstructor
@Data
public class Group {
    private String groupId;
    private String groupName;
    private GroupType type;
    private Set<User> members;

    public Group(String groupId, String groupName, GroupType type, Set<User> members) {
        this.groupId = UUID.randomUUID().toString();
        this.groupName = groupName;
        this.type = type;
        this.members = members;
    }
}
