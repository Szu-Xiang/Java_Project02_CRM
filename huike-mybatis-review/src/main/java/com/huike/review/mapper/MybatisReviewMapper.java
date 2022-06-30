package com.huike.review.mapper;

import com.huike.review.pojo.Review;
import com.huike.review.vo.MybatisReviewVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Mybatis复习的Mapper层
 */
@Mapper

public interface MybatisReviewMapper {


    /**===================新增======================**/
    int saveData(Review review);

    /**===================删除======================**/
    int deleteById(Integer id);


    /**===================修改======================**/
    int updateData(Review review);

    /**==================简单查询====================**/
    Review getById(Integer id);

    List<Review> getByPage(@Param("a") Integer a, @Param("b") Integer b);

}
