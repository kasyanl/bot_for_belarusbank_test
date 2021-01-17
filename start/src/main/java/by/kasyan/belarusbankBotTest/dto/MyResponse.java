package by.kasyan.belarusbankBotTest.dto;

import by.kasyan.belarusbankBotTest.commands.CommandProcessor;

public class MyResponse {

    private Long chatId;
    private String response;

    public MyResponse() {
        this.chatId = null;
        this.response = null;
    }

    public MyResponse(Long chatId, CommandProcessor processor) {
        this.chatId = chatId;
        this.response = processor.getResponse();
    }

    public Long getChatId() { return chatId;
    }

    public String getResponse() {
        return response;
    }
}
