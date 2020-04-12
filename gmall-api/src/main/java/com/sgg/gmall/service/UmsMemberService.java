package com.sgg.gmall.service;

import com.sgg.gmall.bean.UmsMember;

import java.util.List;

public interface UmsMemberService {
    //手写SQL查询所有用户
    List<UmsMember> getAllUser();

    //通用Mapper查询所有用户
    List<UmsMember> getAllUserMapper();
}
