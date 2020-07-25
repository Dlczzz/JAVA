package com.crud.service;

import com.crud.bean.Dept;
import com.crud.dao.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Auther 段凌楚
 * @Date 2020-07-23 17:12
 */

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> getDepts() {
        List<Dept> deptList = deptMapper.selectByExample(null);
        return deptList;
    }
}
