package top.yixuanoct.whutsporttheoryquestionbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.yixuanoct.whutsporttheoryquestionbank.pojo.Question;
import top.yixuanoct.whutsporttheoryquestionbank.pojo.Request;
import top.yixuanoct.whutsporttheoryquestionbank.repositroy.QuestionRepository;

import java.util.List;

@Service
public class QuestionService implements IQuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public List<Question> search(Request request) {
        String bank = request.getBank();
        String keyword = request.getKeyword();
        List<Question> questions = questionRepository.findBank(bank);
        if (keyword == null || keyword.isEmpty()) {
            return questions;
        } else {
            return questions.stream().filter(question -> question.getContent().contains(keyword)).toList();
        }
    }
}
