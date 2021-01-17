package by.kasyan.belarusbankBotTest.commands.headmenu;

import by.kasyan.belarusbankBotTest.commands.CommandProcessor;

public class ByeBye extends CommandProcessor {

    @Override
    public String getResponse() {
        return "До встречи!" +
               "\nВозврат в меню /menu";
    }
}
