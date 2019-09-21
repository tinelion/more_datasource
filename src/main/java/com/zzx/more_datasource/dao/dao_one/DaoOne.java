package com.zzx.more_datasource.dao.dao_one;

import com.zzx.more_datasource.po.GirlPO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
public interface DaoOne {

    @Select("SELECT * from girl where id=#{id}")
    GirlPO selectOne(@Param("id")int id);
}
