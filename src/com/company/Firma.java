package firma;
import java.util.Scanner;
class Sotrudnik{
    String fam, im, otch, doljnost;
    int oklad;
    int kolDet;
    Rebenok[] reb= null;
}
class Rebenok{
    String imR;
    int vozrast;
}
public class Firma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество сотрудников");
        int kol = sc.nextInt();
        sc.nextLine();
        Sotrudnik[] sotr = new Sotrudnik[kol];
        System.out.println("Введите информацию о каждом сотруднике");
        for (int i = 0; i < sotr.length; i++) {
            sotr[i] = new Sotrudnik();
            System.out.println("Введите фамилию "+(i + 1)+" сотрудника");
            sotr[i].fam = sc.nextLine();
            System.out.println("Введите имя");
            sotr[i].im = sc.nextLine();
            System.out.println("Введите отчество");
            sotr[i].otch = sc.nextLine();
            System.out.println("Введите должность");
            sotr[i].doljnost = sc.nextLine();
            System.out.println("Введите оклад");
            sotr[i].oklad = sc.nextInt();
            System.out.println("Введите количество детей");
            sotr[i].kolDet = sc.nextInt();
            sc.nextLine();
            if (sotr[i].kolDet!=0){
                sotr[i].reb = new Rebenok[sotr[i].kolDet];
                System.out.println("Дети");
                for (int j=0; j< sotr[i].reb.length; j++){
                    sotr[i].reb[j]= new Rebenok();
                    System.out.println("Введите имя "+(i+1)+" ребенка");
                    sotr[i].reb[j].imR = sc.nextLine();
                    System.out.println("Введите его возраст");
                    sotr[i].reb[j].vozrast = sc.nextInt();
                    sc.nextLine();
                }
            }
        }
        System.out.println("\n Сотрудник фирмы: \n фам \t имя \t отч\t должность \t оклад");
        for (Sotrudnik s: sotr) {
            System.out.println(s.fam + "\t" + s.im + "\t" + s.otch + "\t" + s.doljnost + "\t\t" + s.oklad);
            System.out.println("\n Дети: ");
            for (Rebenok r: s.reb)
                System.out.println("\t\t\t" + r.imR + "\t\t" + r.vozrast);
            System.out.println(" ");
        }
    }
}