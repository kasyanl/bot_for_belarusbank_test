package by.kasyan.belarusbankBotTest.commands.headmenu;

import by.kasyan.belarusbankBotTest.commands.CommandProcessor;

public class NotSupported extends CommandProcessor {
    @Override
    public String getResponse() {
        return "Команда не поддерживается." +
                "\n Возврат в меню /menu";
    }
}
