package com.huike.review.service;

import com.huike.review.pojo.Review;
import com.huike.review.vo.MybatisReviewVO;

import java.util.List;

/**
 * mybatis复习接口层
 */
public interface ReviewService {

    /**
     * 新增数据
     * @param review   用户对象
     * @return         改变的行数
     */
    int saveData(Review review);

    /**
     * 修改数据
     * @param review   用户对象
     * @return         改变的行数
     */
    int updateData(Review review);

    /**
     * 按照ID删除用户数据
     * @param id       用户ID
     * @return         响应信息
     */
    int deleteData(Integer id);

    /**
     * 按照ID查找用户数据
     * @param id       用户ID
     * @return         用户信息
     */
    Review getById(Integer id);

    List<Review> getByPage(Integer pageNum, Integer pageSize);

}
