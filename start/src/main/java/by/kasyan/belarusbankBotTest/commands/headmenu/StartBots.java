package by.kasyan.belarusbankBotTest.commands.headmenu;

import by.kasyan.belarusbankBotTest.commands.CommandProcessor;

public class StartBots extends CommandProcessor {
    @Override
    public String getResponse() {
        return "Давайте поприветствуем друг друга и начнем работу" +
                "\n/hello";
    }
}
