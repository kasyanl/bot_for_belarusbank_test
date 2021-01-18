package by.kasyan.belarusbank_bot_test.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class News {

    @JsonProperty("name_ru")
    private String name_ru;

    @JsonProperty("name_be")
    private String name_be;

    @JsonProperty("html_ru")
    private String html_ru;

    @JsonProperty("html_be")
    private String html_be;

    @JsonProperty("img")
    private String img;

    @JsonProperty("start_date")
    private String start_date;

    @Override
    public String toString() {
        return "News{" +
                "name_ru=" + name_ru +
                ", name_be='" + name_be + '\'' +
                ", html_ru='" + html_ru + '\'' +
                ", html_be='" + html_be + '\'' +
                ", img='" + img + '\'' +
                ", start_date='" + start_date + '\'' +
                '}';
    }
}
