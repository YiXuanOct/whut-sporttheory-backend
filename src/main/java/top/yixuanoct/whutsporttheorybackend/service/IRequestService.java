package top.yixuanoct.whutsporttheorybackend.service;

import top.yixuanoct.whutsporttheorybackend.pojo.Question;
import top.yixuanoct.whutsporttheorybackend.pojo.Request;

import java.util.List;

public interface IRequestService {
    List<Question> search(Request request);
}
