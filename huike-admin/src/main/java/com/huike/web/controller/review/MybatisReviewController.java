package com.huike.web.controller.review;


import com.huike.common.core.controller.BaseController;
import com.huike.common.core.domain.AjaxResult;
import com.huike.common.core.page.PageDomain;
import com.huike.review.pojo.Review;
import com.huike.review.service.ReviewService;
import com.huike.review.vo.MybatisReviewVO;
import org.aspectj.weaver.loadtime.Aj;
import org.checkerframework.checker.units.qual.A;
import org.simpleframework.xml.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 该Controller主要是为了复习三层架构以及Mybatis使用的，该部分接口已经放开权限，可以直接访问
 * 同学们在此处编写接口通过浏览器访问看是否能完成最简单的增删改查
 */
@RestController
@RequestMapping("/review")
public class MybatisReviewController extends BaseController {

    @Autowired
    private ReviewService reviewService;

    //用review对象来封装
    Review review = new Review();

    /**=====================新增数据====================*/

    @GetMapping("/saveData/{name}/{age}/{sex}")
    public AjaxResult addData(@PathVariable("name") String name, @PathVariable("age") Integer age, @PathVariable("sex") String sex) {

        review.setName(name);
        review.setAge(age);
        review.setSex(sex);

        int rows = reviewService.saveData(review);

        if (rows > 0) {
            System.out.println("success~");
            return new AjaxResult(200,"成功插入：1条数据" );
        }
        System.out.println("error!!");
        return new AjaxResult(100, "插入数据失败");
    }

    /**=====================删除数据====================*/
    @DeleteMapping("/remove/{id}")
    public AjaxResult deleteData(@PathVariable("id") Integer id) {

        int rows = reviewService.deleteData(id);

        if (rows > 0) {
            return new AjaxResult(200, "成功删除： 1条数据");
        } else {
            return new AjaxResult(100, "删除失败");
        }
    }



    /**=====================修改数据====================*/
    @PostMapping("/update")
    public AjaxResult updateData(@RequestBody Review review) {

        int rows = reviewService.updateData(review);

        if (rows > 0) {
            return new AjaxResult(200, "修改成功");

        } else {
            return new AjaxResult(100, "修改失败");
        }


    }

    /**=====================查询数据====================*/
    @GetMapping("/getById")
    public AjaxResult getData(Integer id) {

        Review review = reviewService.getById(id);

        return new AjaxResult(200,"操作成功", review);
    }


    /**=====================分页查询====================*/
    @GetMapping("getDataByPage")
    public AjaxResult getByPage(Integer a, Integer b) {

        List<Review> list = reviewService.getByPage(a, b);

        return new AjaxResult(200, "查询成功", list);
    }


}