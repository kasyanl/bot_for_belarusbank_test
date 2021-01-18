package by.kasyan.belarusbank_bot_test.processor;


import by.kasyan.belarusbank_bot_test.dto.MyResponse;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import java.util.ArrayList;
import java.util.List;

@Component
public class BelarusbankBot extends TelegramLongPollingBot {

    UpdateDispatcher updateDispatcher = new UpdateDispatcher();

    @Override
    public String getBotUsername() {
        return "belarusbank_test_bot";
    }

    @Override
    public String getBotToken() {
        return "1543227726:AAGB96a_XlLFc3ju6VrE5MTBWcq4f8sDHVk";
    }


    @Override
    public void onUpdateReceived(Update update) {
        MyResponse response = updateDispatcher.dispatch(update);
        sendMesg(response);

    }

    public void sendMesg(MyResponse response) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(response.getChatId());
        sendMessage.setText(response.getResponse());

        // Создаем клавиуатуру
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        // Создаем список строк клавиатуры
        List<KeyboardRow> keyboard = new ArrayList<>();

        // Первая строчка клавиатуры
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        // Добавляем кнопки в первую строчку клавиатуры
        keyboardFirstRow.add("/news");
        keyboardFirstRow.add("/curses");

        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardFirstRow);
        // и устанваливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}



