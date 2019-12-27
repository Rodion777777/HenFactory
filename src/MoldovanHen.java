public class MoldovanHen extends Hen{
      @Override
      public String getCountOfEggsPerMonth(){
          return "7";
      }
      @Override
      public String getDescription(){
          return super.getDescription() + " Моя страна - " +
          Country.MOLDOVA + ". Я несу " + this.getCountOfEggsPerMonth() +
          " яиц в месяц.";
      }
  }