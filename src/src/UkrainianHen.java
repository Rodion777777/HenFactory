package src;

public class UkrainianHen extends Hen{
        @Override
        public int getCountOfEggsPerMonth(){
            return 6;
        }
        @Override
        public String getDescription(){
            return super.getDescription() + " Моя страна - " +
            Country.UKRAINE + ". Я несу " + this.getCountOfEggsPerMonth() +
            " яиц в месяц.";
        }
    }