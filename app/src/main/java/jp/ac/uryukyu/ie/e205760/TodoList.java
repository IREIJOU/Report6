package jp.ac.uryukyu.ie.e205760;

import java.util.ArrayList;
import java.util.List;

/**
 * Todoのインスタンスを格納するリストの役割を担うクラス。
 */
public class TodoList {
    private List<Todo> list = new ArrayList<Todo>();

    /**
     * コンストラクタ。
     */
    public TodoList(){
        System.out.println("Todoリストを作成しました。");
    }

    /**
     * TodoをTodoリストに追加するメソッド。
     * @param _todo 追加するTodo
     */
    public void addTodo(Todo _todo){
        list.add(_todo);
    }

    /**
     * このTodoリストが持つ全てのTodoの情報をプリントするメソッド。
     */
    public void printTodoList(){
        for(Todo td : list){
            td.printInfo();
        }
    }

    /**
     * 引数で指定されたインデックスのTodoのタイトルを返すメソッド。
     * @param x タイトルが知りたいTodoのインデックス。
     * @return 指定されたTodoのタイトル。
     */
    public String checkTitle(int x){
        Todo xtodo = list.get(x);
        return xtodo.getTitle();
    }

    /**
     * 引数で指定されたインデックスのTodoを削除するメソッド。
     * @param i 削除したいTodoのインデックス。
     */
    public void deleteTodo(int i){
        list.remove(i);
    }

    /**
     * このTodoリストに格納されているTodoの数を返すメソッド
     * @return 格納されているTodoの数
     */
    public int listSize(){
        return list.size();
    }
}
