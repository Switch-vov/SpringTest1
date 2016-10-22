package com.pc.blog.publish.domain;

/**
 * BlogBean
 * Created by switch on 16/10/22.
 */
public class Blog {
    private Integer blogId;
    private String blogTitle;
    private String blogContent;

    public Blog() {

    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent;
    }
}
