package top.yixuanoct.whutsporttheoryquestionbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.yixuanoct.whutsporttheoryquestionbank.pojo.Question;
import top.yixuanoct.whutsporttheoryquestionbank.pojo.Request;
import top.yixuanoct.whutsporttheoryquestionbank.service.IQuestionService;

import java.util.List;

@RestController
@RequestMapping("/api/search")
public class QuestionController {
    @Autowired
    private IQuestionService questionService;

    @PostMapping()
    public List<Question> search(@RequestBody Request request) {
        return questionService.search(request);
    }
}
