package com.example.xyt.sericefeign.FeignInterface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Map;

/**
 * @author lmh
 * @Title:
 * @date 2019/8/16 0016
 */
@FeignClient(name = "AUTHORITY-MUCON")
public interface UserService {
    @RequestMapping(value = "/getPerAndAchList",method = RequestMethod.GET)
    Map<String,Object>  getPerAndAchList(@RequestParam("pageSize") int pageSize,@RequestParam("pageNum") int pageNum) ;
}
