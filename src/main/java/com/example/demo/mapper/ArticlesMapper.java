package com.example.demo.mapper;

import com.example.demo.pojo.Articles;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * Created by Administrator on 2017/7/16.
 */
public interface ArticlesMapper {
    @Select("select * from articles where id = #{id}")
    Articles getArticles(Long id);

    @Select("select * from articles")
    List<Articles> getArticlesList();
}
