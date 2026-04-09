package org.example.boundedContext.article.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Article {
    private final long id;
    private String subject;
    private String content;
}
