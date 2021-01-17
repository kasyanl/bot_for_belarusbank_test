package by.kasyan.belarusbankBotTest.commands.headmenu;

import by.kasyan.belarusbankBotTest.commands.CommandProcessor;

public class ShowPogoda extends CommandProcessor {
    @Override
    public String getResponse() {
        return "Актуальный прогноз погоды:" +
                "\n - pogoda.yandex.by" +
                "\n - accuweather.com" +
                "\nВозврат в общее меню /menu";

    }
}


