package com.huike.review.service.impl;

import com.huike.review.pojo.Review;
import com.huike.review.service.ReviewService;
import com.huike.review.mapper.MybatisReviewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;


/**
 * mybatis复习使用的业务层
 * 注意该业务层和我们系统的业务无关，主要是让同学们快速熟悉系统的
 */
@Service
public class ReviewServiceImpl implements ReviewService, Serializable {

    @Autowired
    private MybatisReviewMapper reviewMapper;

    /**
     * ===========保存数据的方法==================
     */
    @Override
    public int saveData(Review review) {

        return reviewMapper.saveData(review);
    }

    /**===========删除数据============*/
    @Override
    public int deleteData(Integer id) {

        return reviewMapper.deleteById(id);
    }

    /**===========修改数据============*/
    public int updateData(Review review) {

        return reviewMapper.updateData(review);
    }

    /**=========查询数据的方法============*/
    @Override
    public Review getById(Integer id) {

        return reviewMapper.getById(id);
    }


    /**========分页查询数据的方法===========*/
    @Override
    public List<Review> getByPage(Integer a, Integer b) {

        return reviewMapper.getByPage(a, b);
    }
}
