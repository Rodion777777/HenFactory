package src;

public class BelarusianHen extends Hen{
        @Override
        public int getCountOfEggsPerMonth(){
            return 8;
        }
        @Override
        public String getDescription(){
            return super.getDescription() + " Моя страна - " +
            Country.BELARUS + ". Я несу " + this.getCountOfEggsPerMonth() +
            " яиц в месяц.";
        }
    }