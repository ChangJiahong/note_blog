package com.cjh.note_blog.pojo.DO;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "article_tag")
public class ArticleTag implements Serializable {
    /**
     * 文章id
     */
    @Id
    private Integer aid;

    /**
     * 标签id
     */
    @Id
    private Integer tid;

    /**
     * 创建时间
     */
    private Date created;

    private static final long serialVersionUID = 1L;

    /**
     * 获取文章id
     *
     * @return aid - 文章id
     */
    public Integer getAid() {
        return aid;
    }

    /**
     * 设置文章id
     *
     * @param aid 文章id
     */
    public void setAid(Integer aid) {
        this.aid = aid;
    }

    /**
     * 获取标签id
     *
     * @return tid - 标签id
     */
    public Integer getTid() {
        return tid;
    }

    /**
     * 设置标签id
     *
     * @param tid 标签id
     */
    public void setTid(Integer tid) {
        this.tid = tid;
    }

    /**
     * 获取创建时间
     *
     * @return created - 创建时间
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置创建时间
     *
     * @param created 创建时间
     */
    public void setCreated(Date created) {
        this.created = created;
    }
}