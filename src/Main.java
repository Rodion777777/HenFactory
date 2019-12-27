/*
Куриная фабрика
*/

public class Main {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen("vfsdvxv");
        Hen hen1 = HenFactory.getHen(Country.BELARUS);
        Hen hen2 = HenFactory.getHen(Country.MOLDOVA);
        Hen hen3 = HenFactory.getHen(Country.RUSSIA);
        Hen hen4 = HenFactory.getHen(Country.UKRAINE);
//        hen.getCountOfEggsPerMonth();
        System.out.println(hen.getDescription());
        System.out.println(hen1.getDescription());
        System.out.println(hen2.getDescription());
        System.out.println(hen3.getDescription());
        System.out.println(hen4.getDescription());
    }


    
    

}
