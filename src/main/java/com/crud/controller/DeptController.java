package com.crud.controller;

import com.crud.bean.Dept;
import com.crud.bean.Msg;
import com.crud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description
 * @Auther 段凌楚
 * @Date 2020-07-23 17:11
 */

@Controller
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/depts")
    @ResponseBody
    public Msg getDepts() {
        List<Dept> deptList = deptService.getDepts();
        return Msg.success().add("deptList", deptList);
    }
}
