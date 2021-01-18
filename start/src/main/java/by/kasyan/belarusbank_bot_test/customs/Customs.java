package by.kasyan.belarusbank_bot_test.customs;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Customs {

    @JsonProperty("city")
    private String city;

    @JsonProperty("USD_in")
    private double USD_in;

    @JsonProperty("USD_out")
    private double USD_out;

    @JsonProperty("EUR_in")
    private double EUR_in;

    @JsonProperty("EUR_out")
    private double EUR_out;

    @JsonProperty("name")
    private String name;

    @JsonProperty("filial_id")
    private int filial_id;

//    {"filial_id":"2041","sap_id":"50010665","street_type":"ул.",
//            "street":"70 год Великой Перамоги","filials_text":"Отделение 726\/7061",
//            "home_number":"1а","name":"Шклов","name_type":"г."}

    @Override
    public String toString() {
        return "Customs{" +
                "city='" + city + '\'' +
                ", USD_in=" + USD_in +
                ", USD_out=" + USD_out +
                ", EUR_in=" + EUR_in +
                ", EUR_out=" + EUR_out +
                ", name='" + name + '\'' +
                ", filial_id=" + filial_id +
                '}';
    }
}
