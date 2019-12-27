 class HenFactory {

    static Hen getHen(String country) {
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
        return new DefaultHen(country);
    }
}