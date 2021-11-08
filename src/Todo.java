public class Todo {
    private String title;
    private int id;

    public Todo(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "title='" + title + '\'' +
                ", id=" + id +
                '}';
    }

    public int getId() {
        return this.id;
    }
}
