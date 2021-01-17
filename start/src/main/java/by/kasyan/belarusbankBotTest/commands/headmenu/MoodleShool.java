package by.kasyan.belarusbankBotTest.commands.headmenu;

import by.kasyan.belarusbankBotTest.commands.CommandProcessor;

public class MoodleShool extends CommandProcessor {
    @Override
    public String getResponse() {
        return "Возврат в меню /menu" +
                "\nЧтобы стать JAVA-програмистом пройди по ссылке" +
                "\nhttps://moodle.jrr.by";
    }
}
