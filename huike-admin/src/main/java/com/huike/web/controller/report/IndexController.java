package com.huike.web.controller.report;


import com.alibaba.fastjson.JSONObject;
import com.huike.report.domain.vo.IndexVo;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.huike.common.core.domain.AjaxResult;
import com.huike.report.service.IReportService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private IReportService reportService;


    /**
     * 首页--基础数据统计
     * @param beginCreateTime
     * @param endCreateTime
     * @return
     */
    @GetMapping("/getBaseInfo")
    public AjaxResult getBaseInfo(@RequestParam("beginCreateTime") String beginCreateTime,
                                  @RequestParam("endCreateTime") String endCreateTime){
        return AjaxResult.success(reportService.getBaseInfo(beginCreateTime,endCreateTime));
    }

    /**
     * 首页--今日简报
     * @return
     */
    @GetMapping("/getTodayInfo")
    public AjaxResult getTodayInfo() {

        return AjaxResult.success(reportService.getTodayInfo
                (new SimpleDateFormat("yyyy-MM-dd").format(new Date())));
    }

    /**
     * 首页--待办事项
     * @return
     */

    /**
     * 首页--获取待办数据
     * @return
     */
    @GetMapping("/getTodoInfo")
    public AjaxResult getTodoInfo(@RequestParam("beginCreateTime") String beginCreateTime,
                                  @RequestParam("endCreateTime") String endCreateTime) {

        return AjaxResult.success(reportService.getTodoInfo(beginCreateTime, endCreateTime));

    }

}