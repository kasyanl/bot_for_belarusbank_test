package by.kasyan.belarusbankBotTest.commands.headmenu;

import by.kasyan.belarusbankBotTest.commands.CommandProcessor;

public class MusicOnline extends CommandProcessor {
    @Override
    public String getResponse() {
        return "Послушать музыку онлайн:" +
                "\n - zaycev.net" +
                "\n - zvuch.com" +
                "\n - z1.fm" +
                "\n - music.yandex.by" +
                "\nВозврат в общее меню /menu";
    }
}
