package com.basic.logInterceptor;

import org.apache.commons.lang.StringUtils;

import javax.servlet.http.HttpServletRequest;

/***
 * 日志工具类
 * @author: gaoxiaoqing
 * @create: 2019/06/10 16:34
 **/
public class LoggerUtil {

    public static final String LOG_TARGET_TYPE = "targetType";
    public static final String LOG_ACTION = "action";
    public static final String LOG_REMARK = "remark";

    public LoggerUtil() {
    }

    public static Log getLog(HttpServletRequest request) {
        Log log = new Log();
        log.setIp("127.0.0.1");
        log.setUserPin("gaoxiaoqing");
        log.setOperator("gaoxiaoqing");
        log.setRemark("其他");
        return log;
    }

    public static String getClientIp(HttpServletRequest httpServletRequest) {
        String ip = httpServletRequest.getHeader("X-Real-IP");
        if (!StringUtils.isEmpty(ip) && !"unknown".equalsIgnoreCase(ip)) {
            return ip;
        }
        ip = httpServletRequest.getHeader("X-Forwarded-For");
        if (!StringUtils.isBlank(ip) && !"unknown".equalsIgnoreCase(ip)) {
            int index = ip.indexOf(",");
            if (index != -1) {
                return ip.substring(0, index);
            } else {
                return ip;
            }
        } else {
            return httpServletRequest.getRemoteAddr();
        }

    }
}
