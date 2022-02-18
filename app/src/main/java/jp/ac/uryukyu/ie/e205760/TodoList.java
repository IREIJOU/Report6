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

    public String checkTitle(int x){
        Todo xtodo = list.get(x);
        return xtodo.getTitle();
    }

    public void deleteTodo(int i){
        list.remove(i);
    }

    public int listSize(){
        return list.size();
    }
}
