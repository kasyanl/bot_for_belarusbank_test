package by.kasyan.belarusbank_bot_test.customs;

public class ImportCursesMinsk extends ImportDataFromBank{
    String city(String city){
        return city;
    }
    double USDBuy(double USD_in){
        return USD_in;
    }
    double USDSell(double USD_out){
        return USD_out;
    }
    double EURBuy(double EUR_in){
        return EUR_in;
    }
    double EURSell(double EUR_out){
        return EUR_out;
    }
}
