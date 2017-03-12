public class Line {
    //поля
    private double k;
    private double b;

    //конструкторы
    Line(){
        this.k=0;
        this.b=0;
    }
    Line(double k, double b){
        this.k=k;
        this.b=b;
    }
    Line(Point a,Point b){
        this.k=(a.getY()-b.getY())/(a.getX()-b.getX());
        this.b=a.getY()-this.k*a.getX();
    }

    //метод возвращает отношения прямой и точки
    int RelationPoint(Point p){
        int v;
        if(p.getY()>this.k*p.getX()+b){
            v=1;
        }else{
            if(p.getY()<this.k*p.getX()+b){
                v=-1;
            }else{
                v=0;
            }
        }
        return v;
    }

    @Override
    public String toString() {
        if (this.b>0){
        return "y="+this.k+"x+"+this.b;
        }else{
            if (this.b==0) {
                return "y=" + this.k + "x";
            }else{
                return "y="+this.k+"x"+this.b;
            }
        }
    }
}
