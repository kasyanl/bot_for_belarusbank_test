package by.kasyan.belarusbank_bot_test.commands.headmenu;

import by.kasyan.belarusbank_bot_test.commands.CommandProcessor;

public class CursesVitebsk extends CommandProcessor{

    @Override
    public String getResponse() {
        return "https://belarusbank.by/api/kursExchange";
    }
}
