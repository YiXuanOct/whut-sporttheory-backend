package top.yixuanoct.whutsporttheoryquestionbank.pojo;

public class Request {
    private String bank;
    private String keyword;

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return "Request{" +
                "bank='" + bank + '\'' +
                ", keyword='" + keyword + '\'' +
                '}';
    }
}
