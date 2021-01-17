package by.kasyan.belarusbankBotTest.commands.headmenu;

import by.kasyan.belarusbankBotTest.commands.CommandProcessor;

public class StartBots extends CommandProcessor {
    @Override
    public String getResponse() {
        return "\"Здравствуйте!" +
        "\nДля выбора актуальных новостей банка или курса валют выберите соответствующую кнопку ниже";
    }
}
