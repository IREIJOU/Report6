import jp.ac.uryukyu.ie.e205760.*;
import java.util.Scanner;

/**
 * メインクラス。このファイルを実行することで、Todoリストのアプリが起動する。
 */
public class Main {
/**
 * mainメソッド。ユーザーから入力された番号に応じて、Todoアプリの機能を動かす。
 * 使える機能はタスクの追加、タスクの確認、タスクの削除の3つ。
 * それぞれ機能選択時に1、2、3を入力すると利用できる。
 * 機能選択時に0を入力するとアプリを終了できる。
 * @param args お決まりの引数
 */
    public static void main(String[] args){
        TodoList list = new TodoList();
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        int action = 0;
        while(!exit){
            System.out.println("何をしますか？番号を入力してください");
            System.out.println("1:タスクの追加");
            System.out.println("2:タスクの確認");
            System.out.println("3:タスクの削除");
            System.out.println("0:終了");
            action = scan.nextInt();
            String nom = scan.nextLine(); //1行上のエンターで次の入力が潰れないように
            if (action == 1){
                System.out.println("タスクの追加を行います");
                System.out.println("タスクのタイトルを入力してください");
                String title = scan.nextLine();
                System.out.println("タスクの詳細を入力してください");
                String detail = scan.nextLine();
                System.out.println("期限の年を入力してください");
                int year = scan.nextInt();
                System.out.println("期限の月を入力してください");
                int month = scan.nextInt();
                System.out.println("期限の日を入力してください");
                int day = scan.nextInt();
                System.out.println("入力が完了しました");
                Todo td = new Todo(title, year, month, day, detail);
                list.addTodo(td);
            }
            else if (action == 2){
                System.out.println("タスクの確認を行います");
                list.printTodoList();
            }
            else if (action == 3){
                System.out.println("タスクの削除を行います");
                System.out.println("何番目のタスクを削除するか選んでください。先頭は1番です。");
                int i = scan.nextInt();
                System.out.println(i + "番目のタスク " + list.checkTitle(i - 1) +" を削除しました");
                list.deleteTodo(i - 1);
            }
            else if (action == 0){
                System.out.println("終了します");
                exit = true;
                scan.close();
            }
        }



    }
}
