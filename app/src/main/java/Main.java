import jp.ac.uryukyu.ie.e205760.*;

public class Main {
    public static void main(String[] args){
        TodoList list = new TodoList();
        Todo td = new Todo("いっこめのたすく", 2022, 02, 18, "しょうさい");
        Todo td2 = new Todo("にこめのたすく", 2022, 02, 18, "しょうさい");
        list.addTodo(td);
        list.addTodo(td2);
        list.printTodoList();
    }
}
