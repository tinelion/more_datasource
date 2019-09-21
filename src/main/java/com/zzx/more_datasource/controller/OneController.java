package com.zzx.more_datasource.controller;


import com.zzx.more_datasource.dao.dao_one.DaoOne;
import com.zzx.more_datasource.po.GirlPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneController {

    @Autowired
    DaoOne daoOne;

    @GetMapping("get")
    public GirlPO get(int id){
        return daoOne.selectOne(id);
    }
}
