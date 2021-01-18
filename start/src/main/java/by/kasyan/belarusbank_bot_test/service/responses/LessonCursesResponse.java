package by.kasyan.belarusbank_bot_test.service.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import exapmle.models.LessonType;
import lombok.Data;

import java.util.List;

@Data
public class LessonCursesResponse {

    @JsonProperty("USD_in")
    private double USD_in;

    @JsonProperty("USD_out")
    private double USD_out;

    @JsonProperty("EUR_in")
    private double EUR_in;

    @JsonProperty("EUR_out")
    private double EUR_out;

    @JsonProperty("RUB_in")
    private double RUB_in;

    @JsonProperty("filial_id")
    private int filial_id;

    @JsonProperty("filials_text")
    private String filials_text;

    @JsonProperty("name_type")
    private String name_type;

    @JsonProperty("name")
    private String name;

    @JsonProperty("street_type")
    private String street_type;

    @JsonProperty("street")
    private String street;

    @JsonProperty("home_number")
    private int home_number;
}
