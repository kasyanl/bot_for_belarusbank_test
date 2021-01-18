package by.kasyan.belarusbank_bot_test.commands.headmenu;

import by.kasyan.belarusbank_bot_test.commands.CommandProcessor;

public class NotSupported extends CommandProcessor {
    @Override
    public String getResponse() {
        return "Команда не поддерживается." +
                "\n Возврат в меню /menu";
    }
}
