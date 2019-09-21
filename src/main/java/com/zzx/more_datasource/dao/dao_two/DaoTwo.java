package com.zzx.more_datasource.dao.dao_two;

import com.zzx.more_datasource.po.ItemPO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
public interface DaoTwo {

    @Select("SELECT * from t_item where id=#{id}")
    ItemPO selectOne(@Param("id")int id);
}
