package org.example.boundedContext.base;

import org.example.boundedContext.article.controller.ArticleController;
import org.example.boundedContext.member.controller.MemberController;

public class Container {
    public static MemberController memberController;

    public static ArticleController articleController;

    static {
        memberController = new MemberController();
        articleController = new ArticleController();
    }
}
