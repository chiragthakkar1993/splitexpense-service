package com.splitexpense.Repository;

import com.splitexpense.Group;

import java.util.HashMap;
import java.util.Map;

public class GroupRepository {
    private static Map<String, Group> GROUPS = new HashMap<>();

    public Group getGroupById(String id) {
        return GROUPS.get(id);
    }

    public Group createOrUpdateGroup(Group group) {
        return GROUPS.put(group.getGroupId(), group);
    }

}
