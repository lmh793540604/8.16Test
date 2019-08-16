package com.example.api.dao;

import com.example.api.entity.PerDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author lmh
 * @Title:
 * @date 2019/8/16 0016
 */
@Mapper
public interface UserDao {
    List<PerDto> getPerAndAchList();
}
