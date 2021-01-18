package by.kasyan.belarusbank_bot_test.requests;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LessonNewsRequest {

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

}
