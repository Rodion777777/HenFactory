public class DefaultHen extends Hen {
    private String country;
    public DefaultHen(String str){
        this.country = str;
    }
    @Override
    public String getDescription(){
        return "Я - какая-то курица." + " Моя страна - " + country + ". Я несу " + super.getCountOfEggsPerMonth() +
                " яиц в месяц.";
    }
}
