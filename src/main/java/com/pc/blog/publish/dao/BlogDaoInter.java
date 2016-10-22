package com.pc.blog.publish.dao;

import com.pc.blog.publish.domain.Blog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * 博客的Dao接口
 * Created by switch on 16/10/22.
 */
public interface BlogDaoInter {
    /**
     * 保存博客
     *
     * @param blog 博客bean
     * @return 1, 成功；0，失败
     */
    @Insert("insert into Blog values(null, #{blog.blogTitle}, #{blog.blogContent})")
    public Integer saveBlog(@Param("blog") Blog blog);
}
