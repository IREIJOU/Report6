package jp.ac.uryukyu.ie.e205760;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<Todo> list = new ArrayList<Todo>();

    public TodoList(){
        System.out.println("Todoリストを作成しました。");
    }

    public void addTodo(Todo _todo){
        list.add(_todo);
    }

    public void printTodoList(){
        for(Todo td : list){
            td.printInfo();
        }
    }
}
