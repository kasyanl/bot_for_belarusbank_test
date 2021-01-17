package by.kasyan.belarusbankBotTest.commands.headmenu;

import by.kasyan.belarusbankBotTest.commands.CommandProcessor;

public class GamesOnline extends CommandProcessor {
    @Override
    public String getResponse() {
        return "Поиграть в онлайн-игры:" +
                "\n - WOW ofitial blizzard.com" +
                "\n - WOW пиратка wowcircle.net" +
                "\n - танчики worldoftanks.ru" +
                "\n - кораблики worldofwarships.ru" +
                "\n - самолетики warthunder.ru" +
                "\nВозврат в общее меню /menu";
    }
}
