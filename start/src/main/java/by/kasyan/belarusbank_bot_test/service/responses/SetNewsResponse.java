package by.kasyan.belarusbank_bot_test.service.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import exapmle.service.Status;
import lombok.Data;

@Data
public class SetNewsResponse {
    @JsonProperty("name_ru")
    private Status name_ru;

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
}
