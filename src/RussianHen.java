public class RussianHen extends Hen{
        @Override
        public String getCountOfEggsPerMonth(){
            return "5";
        }
        @Override
        public String getDescription(){
            return super.getDescription() + " Моя страна - " +
            Country.RUSSIA + ". Я несу " + this.getCountOfEggsPerMonth() +
            " яиц в месяц.";
        }
    }