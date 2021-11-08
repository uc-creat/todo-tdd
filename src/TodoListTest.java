import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TodoListTest {

    static TodoList todoList;
    String expectedResult = "success";

    @BeforeAll
    static void prerequisites(){
        todoList = new TodoList();
        Todo task = new Todo(1,"do homework");
        Todo task2 = new Todo(2,"laundry");

        todoList.add(task);
        todoList.add(task2);
        todoList.show();
        System.out.println("Prerequisites are done \n");
    }

    @Test
    void testAddFunctionality(){
        Todo todo = new Todo(3,"watch documentary");

        String actualResult = todoList.add(todo);
        todoList.show();

        assertEquals(expectedResult,actualResult);
    }

    @Test
    void testRemoveFunctionality(){
        String actualResult = todoList.remove(1);

        todoList.show();
        assertEquals(expectedResult,actualResult);
    }
}