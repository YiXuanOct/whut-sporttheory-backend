package top.yixuanoct.whutsporttheoryquestionbank.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Question {
    private String content;
    private int type;
    @JsonProperty("right_answers")
    private String rightAnswer;
    private List<Option> options;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return "Question{" +
                "content='" + content + '\'' +
                ", type=" + type +
                ", rightAnswer='" + rightAnswer + '\'' +
                ", options=" + options +
                '}';
    }

    public static class Option {
        private String name;
        private String content;
        @JsonProperty("is_right")
        private int isRight;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public int getIsRight() {
            return isRight;
        }

        public void setIsRight(int isRight) {
            this.isRight = isRight;
        }

        @Override
        public String toString() {
            return "Option{" +
                    "name='" + name + '\'' +
                    ", content='" + content + '\'' +
                    ", isRight=" + isRight +
                    '}';
        }
    }
}
