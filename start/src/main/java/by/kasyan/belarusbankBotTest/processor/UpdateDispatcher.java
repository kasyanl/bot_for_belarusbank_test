package by.kasyan.belarusbankBotTest.processor;

import by.kasyan.belarusbankBotTest.commands.BotCommand;
import by.kasyan.belarusbankBotTest.commands.headmenu.*;
import by.kasyan.belarusbankBotTest.dto.MyResponse;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

public class UpdateDispatcher {

    public MyResponse dispatch(Update update) {
        if (update.hasMessage()) {
            return processMessage(update.getMessage());
        }
        return new MyResponse();

    }

    private MyResponse processMessage(Message message) {
        if (message.hasText()) {
            return processText(message.getChatId(), message.getText());
        }
        return new MyResponse();
    }

    private MyResponse processText(Long chatId, String text) {
        BotCommand command = BotCommand.toCommand(text);
        switch (command) {
            case START:
                return new MyResponse(chatId, new StartBots());
            case NEWS:
                return new MyResponse(chatId, new NewsAll());
                case NONE:
            default:
                return new MyResponse(chatId, new NotSupported());
        }
    }
}
