public class Point {

    //поля координат точки
    private double x;
    private double y;

    //сетеры
    void setX(double x){
        this.x=x;
    }
    void setY(double y){
        this.y=y;
    }

    //гетеры
    double getX(){
        return this.x;
    }
    double getY(){
        return this.y;
    }

    //конструкторы
    Point(){
        this.x=0;
        this.y=0;
    }
    Point(double x, double y){
        this.x=x;
        this.y=y;
    }

    //формат вывода
    @Override
    public String toString(){
        return "("+this.x+";"+this.y+")";
    }



}