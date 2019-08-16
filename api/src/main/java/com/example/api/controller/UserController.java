package com.example.api.controller;

import com.example.api.entity.PerDto;
import com.example.api.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lmh
 * @Title:
 * @date 2019/8/16 0016
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/getPerAndAchList",method = RequestMethod.GET)
    public Map<String,Object> getPerAndAchList(int pageSize,int pageNum){
        if(pageNum<=0){
            pageNum=1;
        }
        if(pageSize<=5){
            pageSize=5;
        }
        PageHelper.startPage(pageNum,pageSize);
        List<PerDto> perAndAchList = userService.getPerAndAchList();
        PageInfo<PerDto> pageInfo=new PageInfo<>(perAndAchList);
        Map map=new HashMap();
        map.put("200",pageInfo);
        return map;
    }
}
