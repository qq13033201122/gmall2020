package com.sgg.gmall.user.service.impl;

import com.sgg.gmall.bean.UmsMember;
import com.sgg.gmall.service.UmsMemberService;

import com.sgg.gmall.user.mapper.UmsMemberMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UmsMemberServiceImpl implements UmsMemberService {
    @Autowired
    private UmsMemberMapper umsMemberMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = umsMemberMapper.selectAllUser();
        return umsMembers;
    }

    @Override
    public List<UmsMember> getAllUserMapper() {
        List<UmsMember> umsMembers = umsMemberMapper.selectAll();
        return umsMembers;
    }
}
