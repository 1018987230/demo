package com.wyx.demo.dao;

import com.wyx.demo.entity.Sum;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author wangyixiong
 * @Date 2023/8/15 下午2:17
 * @PackageName:com.wyx.demo.dao
 * @ClassName: SumMapper
 * @Description: TODO
 * @Version 1.0
 */
@Mapper
public interface SumMapper {

    void insert(Sum sum);

}
