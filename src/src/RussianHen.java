package src;

public class RussianHen extends Hen{
        @Override
        public int getCountOfEggsPerMonth(){
            return 5;
        }
        @Override
        public String getDescription(){
            return super.getDescription() + " Моя страна - " +
            Country.RUSSIA + ". Я несу " + this.getCountOfEggsPerMonth() +
            " яиц в месяц.";
        }
    }