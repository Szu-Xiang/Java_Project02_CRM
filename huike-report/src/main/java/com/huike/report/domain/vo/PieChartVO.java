package com.huike.report.domain.vo;

/**
 * 饼状图
 */
public class PieChartVO {

    private Integer num;

    private String subject;


    public PieChartVO() {
    }

    public PieChartVO(Integer num, String subject) {
        this.num = num;
        this.subject = subject;
    }

    /**
     * 获取
     * @return num
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置
     * @param num
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 获取
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * 设置
     * @param subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String toString() {
        return "PieChartVO{num = " + num + ", subject = " + subject + "}";
    }
}
