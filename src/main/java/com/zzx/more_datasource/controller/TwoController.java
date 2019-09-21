package com.zzx.more_datasource.controller;


import com.zzx.more_datasource.dao.dao_two.DaoTwo;
import com.zzx.more_datasource.po.ItemPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwoController {

    @Autowired
    DaoTwo daoTwo;

    @GetMapping("/item")
    public ItemPO getOne(int id){
        return daoTwo.selectOne(id);
    }
}
