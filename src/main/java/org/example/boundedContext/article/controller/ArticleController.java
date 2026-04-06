package org.example.boundedContext.article.controller;

import org.example.boundedContext.global.base.Rq;

public class ArticleController {
    public void showList(Rq rq) {
        rq.appendBody("게시물 리스트");
    }
}
