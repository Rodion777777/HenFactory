package src;
import static src.SomeClass.*;
/*
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
        System.out.println(hen.getDescription());
        System.out.println(getString1());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код
            if (country.equals(Country.UKRAINE)){
                return new UkrainianHen();
            }
            if (country.equals(Country.RUSSIA)){
                return new RussianHen();
            }
            if (country.equals(Country.MOLDOVA)){
                return new MoldovanHen();
            }
            if (country.equals(Country.BELARUS)){
                return new BelarusianHen();
            }
            return hen;
            
        }
    }
    
    

}
