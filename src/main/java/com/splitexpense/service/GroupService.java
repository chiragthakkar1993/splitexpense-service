package com.splitexpense.service;

import com.splitexpense.Group;
import com.splitexpense.Repository.GroupRepository;


public class GroupService {

    private GroupRepository groupRepository = new GroupRepository();

    public Group createOrUpdateGroup(Group request) {
        return this.groupRepository.createOrUpdateGroup(request);
    }

}
