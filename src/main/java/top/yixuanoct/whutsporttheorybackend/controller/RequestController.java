package top.yixuanoct.whutsporttheorybackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.yixuanoct.whutsporttheorybackend.pojo.Question;
import top.yixuanoct.whutsporttheorybackend.pojo.Request;
import top.yixuanoct.whutsporttheorybackend.service.IRequestService;

import java.util.List;

@CrossOrigin()
@RestController
@RequestMapping("/sporttheory")
public class RequestController {
    @Autowired
    private IRequestService questionService;

    @PostMapping()
    public List<Question> search(@RequestBody Request request) {
        return questionService.search(request);
    }
}
