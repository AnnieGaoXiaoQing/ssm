package com.basic.logInterceptor;

/***
 * 日志
 * @author: gaoxiaoqing
 * @create: 2019/06/10 16:58
 **/
public class Log {

    private String ip;
    private String operator;
    private String userPin;
    private String remark;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getUserPin() {
        return userPin;
    }

    public void setUserPin(String userPin) {
        this.userPin = userPin;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
