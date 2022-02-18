package jp.ac.uryukyu.ie.e205760;

public class Todo {
    private String title;
    private int year;
    private int month;
    private int day;
    private String detail;

    public Todo(String _title, int _year, int _month, int _day, String _detail){
        setTitle(_title);
        setYear(_year);
        setMonth(_month);
        setDay(_day);
        setDetail(_detail);
    }

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

    public String getTitle(){
        return this.title;
    }
    public int getYear(){
        return this.year;
    }
    public int getMonth(){
        return this.month;
    }
    public int getDay(){
        return this.day;
    }
    public String getDetail(){
        return this.detail;
    }

    public void setTitle(String _title){
        this.title = _title;
    }
    public void setYear(int _year){
        this.year = _year;
    }
    public void setMonth(int _month){
        this.month = _month;
    }
    public void setDay(int _day){
        this.day = _day;
    }
    public void setDetail(String _detail){
        this.detail = _detail;
    }
}
