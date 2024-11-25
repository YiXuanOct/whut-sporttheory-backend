package top.yixuanoct.whutsporttheorybackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.yixuanoct.whutsporttheorybackend.pojo.Question;
import top.yixuanoct.whutsporttheorybackend.pojo.Request;
import top.yixuanoct.whutsporttheorybackend.repositroy.RequestRepository;

import java.util.List;

@Service
public class RequestService implements IRequestService {
    @Autowired
    private RequestRepository requestRepository;

    @Override
    public List<Question> search(Request request) {
        String bank = request.getBank();
        String keyword = request.getKeyword();
        List<Question> questions = requestRepository.findBank(bank);
        if (keyword == null || keyword.isEmpty()) {
            return questions;
        } else {
            return questions.stream().filter(question -> question.getContent().contains(keyword)).toList();
        }
    }
}
