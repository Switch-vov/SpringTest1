package com.pc;

import com.pc.blog.publish.dao.BlogDaoInter;
import com.pc.blog.publish.domain.Blog;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Test
 * Created by switch on 16/10/22.
 */
public class AppTest {
    ApplicationContext context = null;

    @Before
    public void init() {
        String resource = "application-context.xml";
        context = new ClassPathXmlApplicationContext(resource);
    }

    @Test
    public void test_spring_mybatis_integration() {
        BlogDaoInter blogDaoInter = context.getBean("blogDaoInter", BlogDaoInter.class);
        Blog blog = new Blog();
        blog.setBlogTitle("B001");
        blog.setBlogContent("BlogContent");
        Integer isPublish = blogDaoInter.saveBlog(blog);
        System.out.println(isPublish);

    }
}
