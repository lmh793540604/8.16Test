package com.example.api.service.impl;

import com.example.api.dao.UserDao;
import com.example.api.entity.PerDto;
import com.example.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lmh
 * @Title:
 * @date 2019/8/16 0016
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<PerDto> getPerAndAchList() {
        return userDao.getPerAndAchList();
    }
}
