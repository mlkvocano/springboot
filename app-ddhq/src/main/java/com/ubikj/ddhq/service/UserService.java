package com.ubikj.ddhq.service;

import com.ubikj.ddhq.entry.User;

import java.util.List;

public interface UserService {

    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}
