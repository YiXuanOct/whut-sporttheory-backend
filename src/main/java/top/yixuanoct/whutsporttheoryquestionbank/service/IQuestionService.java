package top.yixuanoct.whutsporttheoryquestionbank.service;

import top.yixuanoct.whutsporttheoryquestionbank.pojo.Question;
import top.yixuanoct.whutsporttheoryquestionbank.pojo.Request;

import java.util.List;

public interface IQuestionService {
    List<Question> search(Request request);
}
