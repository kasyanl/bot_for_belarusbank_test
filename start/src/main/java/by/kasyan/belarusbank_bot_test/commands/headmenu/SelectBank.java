package by.kasyan.belarusbank_bot_test.commands.headmenu;

import by.kasyan.belarusbank_bot_test.commands.CommandProcessor;

public class SelectBank extends CommandProcessor {

    @Override
    public String getResponse() {
        return "Какой город Вас интересует?" +
               "\nМинск /minskbank" +
                "\nВитебск /vitebskbank" +
                "\nГомель /gjmelbank";
    }
}
