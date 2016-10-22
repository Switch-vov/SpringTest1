package com.pc.blog.publish.service;

import com.pc.blog.publish.domain.Blog;

import javax.servlet.ServletContext;

/**
 * Blog服务接口
 * Created by switch on 16/10/22.
 */
public interface BlogServiceInter {
    /**
     * 保存博客
     *
     * @param servletContext
     * @param blog 博客bean
     * @return 1,成功；0，失败
     */
    public Integer saveBlog(ServletContext servletContext, Blog blog);
}
