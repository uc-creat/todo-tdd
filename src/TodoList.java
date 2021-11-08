import java.util.ArrayList;

public class TodoList {

    private ArrayList<Todo> todoList = new ArrayList<>();

    public String add(Todo task) {
        this.todoList.add(task);
        return "success";
    }

    public void show() {
        for(Todo todo: todoList){
            System.out.println(todo);
        }
    }

    public String remove(int id) {
        this.todoList.removeIf(todo -> todo.getId() == id);
        return "success";
    }
}
