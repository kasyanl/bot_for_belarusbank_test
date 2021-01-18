package by.kasyan.belarusbank_bot_test.service;

import by.kasyan.belarusbank_bot_test.requests.*;
import by.kasyan.belarusbank_bot_test.service.responses.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@FeignClient(name = "BELARUSBANK-PROXY", url = "https://belarusbank.by/api")
public interface CrmProxy {
    @PostMapping("/news_info")
    public SetNewsResponse authorization(@RequestBody AuthorizationRequest authorizationRequest);

    @PostMapping("/kursExchange")
    public LessonCursesResponse sendLessonType(@RequestHeader("X-ALFACRM-TOKEN") String authenticationToken,
                                                                         SendLessonCursesRequest sendLessonCursesRequest);


}
