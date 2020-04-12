package com.sgg.gmall.user.controller;


import com.sgg.gmall.bean.UmsMember;
import com.sgg.gmall.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UmsMemberService umsMemberService;

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMemberList = umsMemberService.getAllUser();
        return umsMemberList;
    }

    @RequestMapping("getAllUserMapper")
    @ResponseBody
    public List<UmsMember> getAllUserMapper(){
        List<UmsMember> umsMemberList = umsMemberService.getAllUserMapper();
        return umsMemberList;
    }

}
