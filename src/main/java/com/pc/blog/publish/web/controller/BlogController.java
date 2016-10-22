package com.pc.blog.publish.web.controller;

import com.pc.blog.publish.domain.Blog;
import com.pc.blog.publish.service.BlogServiceInter;
import com.pc.blog.publish.service.impl.BlogServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Blog控制器
 * Created by switch on 16/10/22.
 */
@Controller
public class BlogController {
    /**
     * 显示发表Blog界面
     *
     * @return 发表博客视图
     */
    @RequestMapping(value = "/toPublishBlogUI")
    public String showPublishUI() {
        return "publishBlog";
    }

    /**
     * 发送博客
     *
     * @param blogTitle   博客标题
     * @param blogContent 博客内容
     * @param request     请求
     * @param response    响应
     * @param map         模型
     * @return 结果视图
     */
    @RequestMapping(value = "/publishBlog", method = RequestMethod.POST)
    public String showPublishResult(@RequestParam("blogTitle") String blogTitle, @RequestParam("blogContent") String blogContent, HttpServletRequest request, HttpServletResponse response, ModelMap map) {
        // 测试获取内容(成功)
        // System.out.println(blogTitle + "\n" + blogContent);

        // 是否发布标识
        boolean isPublish = true;
        // 判断博客标题是否满足条件
        if (blogTitle == null || blogTitle.length() == 0 || blogTitle.length() > 20) {
            isPublish = false;
        }

        if (blogContent == null || blogContent.length() == 0 || blogContent.length() > 100) {
            isPublish = false;
        }
        // 成功，返回200响应码
        if (isPublish) {
            response.setStatus(200);
            map.addAttribute("msg", "恭喜您，发表成功！");
            BlogServiceInter blogService = new BlogServiceImpl();
            Blog blog = new Blog();
            blog.setBlogTitle(blogTitle);
            blog.setBlogContent(blogContent);
            blogService.saveBlog(request.getServletContext(), blog);
        } else {
            // 失败，返回400响应码
            response.setStatus(400);
            map.addAttribute("msg", "请检查博客标题和内容是否符合要求！");
        }
        return "publishBlogResult";
    }
}
