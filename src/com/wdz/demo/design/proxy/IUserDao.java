package com.wdz.demo.design.proxy;

import com.wdz.demo.design.proxy.enums.Select;

/**
 * @author by Wangdezhao
 * @date 2023/2/9 11:25 Copyright 2021 北京交个朋友数码科技有限公司. All rights reserved.
 */
public interface IUserDao {
    /**
     * 主键查询
     * @param id userId
     * @return user
     */
    @Select("select * from user where id = #{id}")
    String selectById(String id);
}
