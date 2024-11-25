package top.yixuanoct.whutsporttheorybackend.repositroy;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;
import top.yixuanoct.whutsporttheorybackend.pojo.Question;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Repository
public class RequestRepository {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final TypeReference<List<Question>> typeReference = new TypeReference<>() {
    };

    public List<Question> findBank(String bank) {
        ClassPathResource resource = new ClassPathResource("banks/" + bank + ".json");
        try (InputStream inputStream = resource.getInputStream()) {
            return objectMapper.readValue(inputStream, typeReference);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
