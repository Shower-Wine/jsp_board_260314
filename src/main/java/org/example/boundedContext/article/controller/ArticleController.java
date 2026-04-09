package org.example.boundedContext.article.controller;

import org.example.boundedContext.article.dto.Article;
import org.example.boundedContext.global.base.Rq;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;

public class ArticleController {
    private List<Article> articleList;

    public ArticleController() {
        articleList = new ArrayList<>();

        makeTestData();
    }

    void makeTestData() {
        LongStream.rangeClosed(1, 5)
                .forEach(i -> articleList.add(new Article(i, "제목" + i, "내용" + i)));
    }

    public void showList(Rq rq) {
        List<Article> articles = articleList;

        rq.setAttr("articles", articles);

        rq.view("usr/article/list");
    }
}
