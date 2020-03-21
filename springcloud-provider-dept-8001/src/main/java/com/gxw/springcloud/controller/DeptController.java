package com.gxw.springcloud.controller;

import com.gxw.springcloud.pojo.Dept;
import com.gxw.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping (value = "/dept/add", method = RequestMethod.POST)
    public boolean addDept(Dept dept){
        return deptService.addDept(dept);
    }

    @RequestMapping (value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id){
        return deptService.queryById(id);
    }

    @RequestMapping (value = "dept/list", method = RequestMethod.GET)
    public List<Dept> queryAll(){
        return deptService.queryAll();
    }
}
