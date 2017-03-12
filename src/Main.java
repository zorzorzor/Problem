import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Сколько будет точек?");
        int n=sc.nextInt();//кол-во точек
        int min=n;//минимум разницы на данный момент
        int abs=0;
        int a=0,b=1;//для запоминания коэффицентов

        Point[] arr=new Point[n];//наши объекты

        for(int i=0;i<n;i++){//цикл по заполнению массива объектов
            arr[i]=new Point(sc.nextDouble(), sc.nextDouble());//считали точку
            System.out.println(i+1+") "+arr[i]);
        }

        Line ln=new Line();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                ln=new Line(arr[i],arr[j]);//рассматриваемая прямая
                for (int k=0;k<n;k++){//рассматриваем остальные точки
                    if (k!=i&&k!=j){
                        abs+=ln.RelationPoint(arr[k]);//нашли разницу
                    }
                }
                abs=Math.abs(abs);//взяли модуль от нее
                if (abs<min){//если это новая подходящая прямая (меньше разница)
                    min=abs;//то теперь минимум= ее минимуму
                    a=i;//запоминаем индексы точек, от которых она создана
                    b=j;
                }
                abs=0;//обнуляем счетчик
            }
        }

        ln=new Line(arr[a],arr[b]);//вывод ппрямой искомой
        System.out.println(ln);
        System.out.println(min);
    }
}
