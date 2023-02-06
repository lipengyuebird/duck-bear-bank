package com.bodb.duckbearbank;

import org.springframework.stereotype.Component;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("unchecked")
@Component
public class CorsInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods","GET, HEAD, POST, PUT, DELETE, CONNECT, OPTIONS, TRACE, PATCH");
        response.setHeader("Access-Control-Max-Age","100");
        response.setHeader("Access-Control-Allow-Headers", "*, token, accept, user-agent, content-type, Access-Control-Expose-Headers");
        response.setHeader("Access-Control-Allow-Credentials","true");
        response.setHeader("Access-Control-Expose-Headers", "token, accept, user-agent, content-type");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
//        String rawResponseBody = response.getOutputStream().toString();
//        response.getOutputStream().flush();
//        response.getOutputStream().write((StringUtils.removeEnd(rawResponseBody, "}") + ", \"aaa\": 1}").getBytes());
    }

}
