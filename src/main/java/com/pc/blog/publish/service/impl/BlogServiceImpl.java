package com.pc.blog.publish.service.impl;

import com.pc.blog.publish.dao.BlogDaoInter;
import com.pc.blog.publish.domain.Blog;
import com.pc.blog.publish.service.BlogServiceInter;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;

/**
 * Blog服务实现类
 * Created by switch on 16/10/22.
 */
public class BlogServiceImpl implements BlogServiceInter {

    public Integer saveBlog(ServletContext servletContext, Blog blog) {
        // 从Web中获取ApplicationContext的对象
        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        // 从context中获取blogDaoInter
        BlogDaoInter blogDaoInter = context.getBean("blogDaoInter", BlogDaoInter.class);
        return blogDaoInter.saveBlog(blog);
    }
}
