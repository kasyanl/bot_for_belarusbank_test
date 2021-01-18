package by.kasyan.belarusbank_bot_test.dto;

import by.kasyan.belarusbank_bot_test.commands.CommandProcessor;

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
