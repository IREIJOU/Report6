package jp.ac.uryukyu.ie.e205760;

/**
 * Todoのクラス。タイトルや期限などの情報をもつ。
 */
public class Todo {
    private String title;
    private int year;
    private int month;
    private int day;
    private String detail;

    /**
     * コンストラクタ。引数で受け取った情報をフィールドに代入する。
     * @param _title Todoのタイトル
     * @param _year 期限の年
     * @param _month 期限の月
     * @param _day 期限の日
     * @param _detail Todoの詳細
     */
    public Todo(String _title, int _year, int _month, int _day, String _detail){
        setTitle(_title);
        setYear(_year);
        setMonth(_month);
        setDay(_day);
        setDetail(_detail);
    }

    /**
     * Todoのインスタンスがもつ情報をプリントするメソッド。
     */
    public void printInfo(){
        System.out.print(this.title);
        System.out.print("  期限:");
        System.out.print(this.year);
        System.out.print("年");
        System.out.print(this.month);
        System.out.print("月");
        System.out.print(this.day);
        System.out.println("日");
        System.out.print("詳細:");
        System.out.println(this.detail);
        System.out.println("");

    }

    /**
     * Todoのタイトルのゲッター
     * @return Todoのタイトル
     */
    public String getTitle(){
        return this.title;
    }
    /**
     * 期限の年のゲッター
     * @return 期限の年
     */
    public int getYear(){
        return this.year;
    }
    /**
     * 期限の月のゲッター
     * @return 期限の月
     */
    public int getMonth(){
        return this.month;
    }
    /**
     * 期限の日のゲッター
     * @return 期限の日
     */
    public int getDay(){
        return this.day;
    }
    /**
     * Todoの詳細のゲッター
     * @return Todoの詳細
     */
    public String getDetail(){
        return this.detail;
    }

    /**
     * Todoのタイトルのセッター
     * @param _title Todoのタイトル
     */
    public void setTitle(String _title){
        this.title = _title;
    }
    /**
     * 期限の年のセッター
     * @param _year 期限の年
     */
    public void setYear(int _year){
        this.year = _year;
    }
    /**
     * 期限の月のセッター
     * @param _month 期限の月
     */
    public void setMonth(int _month){
        this.month = _month;
    }
    /**
     * 期限の日のセッター
     * @param _day 期限の日
     */
    public void setDay(int _day){
        this.day = _day;
    }
    /**
     * Todoの詳細のセッター
     * @param _detail Todoの詳細
     */
    public void setDetail(String _detail){
        this.detail = _detail;
    }
}
