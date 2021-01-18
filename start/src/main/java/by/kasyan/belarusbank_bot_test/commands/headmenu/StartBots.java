package by.kasyan.belarusbank_bot_test.commands.headmenu;

import by.kasyan.belarusbank_bot_test.commands.CommandProcessor;

public class StartBots extends CommandProcessor {
    @Override
    public String getResponse() {
        return "\"Здравствуйте!" +
        "\nДля выбора актуальных новостей банка или курса валют выберите соответствующую кнопку ниже";
    }
}
