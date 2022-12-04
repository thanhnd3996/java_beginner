package exercise2;

public class HomeWork {
    private int id;
    private String content;

    public HomeWork(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public HomeWork() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }
}
