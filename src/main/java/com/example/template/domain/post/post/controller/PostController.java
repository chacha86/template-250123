package com.example.template.domain.post.post.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/posts")
public class PostController {

    @GetMapping("/write")
    @ResponseBody
    public String showWrite() {
        return """
                <form method="post">
                  <input type="text" name="title" placeholder="제목" />
                  <textarea name="content"></textarea>
                  <input type="submit" value="등록" />
                </form>
                """;
    }

    @PostMapping("/write")
    @ResponseBody
    public String doWrite(String title, String content) {

        return """
                <h1>게시물 조회</h1>
                <div>%s</div>
                <div>%s</div>
                """.formatted(title, content);
    }

}
