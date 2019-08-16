package com.example.xyt.sericefeign.controller;

import com.example.xyt.sericefeign.FeignInterface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    @GetMapping("/getPerAndAchList")
    public Map<String,Object> getPerAndAchList(@RequestParam("pageSize") int pageSize,@RequestParam("pageNum") int pageNum){
        return userService.getPerAndAchList(pageSize,pageNum);
    }
}
