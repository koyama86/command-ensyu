import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                    BMI計算
                ----------------
                """);
        System.out.print("身長を単位mで入力してください >");
        double height = Double.parseDouble(sc.nextLine());
        System.out.print("\n");

        System.out.print("体重を単位kgで入力してください >");
        double weight = Double.parseDouble(sc.nextLine());

        Double bmi = weight/(height * height);
        bmi = (double)(int)(bmi * 100);
        bmi = bmi/100;




        System.out.println("結果");
        System.out.println("BMI：" + bmi);
        if(bmi >= 25.00 ){
            System.out.println("肥満度：肥満");
        } else if (bmi >=18.50) {
            System.out.println("肥満度：普通体重");
        }else System.out.println("肥満度：低体重");

    }
}
