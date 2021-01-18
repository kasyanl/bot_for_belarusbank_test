package by.kasyan.belarusbank_bot_test.commands.headmenu;

import by.kasyan.belarusbank_bot_test.commands.CommandProcessor;


public class NewsAll extends CommandProcessor {
    @Override
    public String getResponse() {

        return "Последние новости Беларусбанка" +
                "\nhttps://belarusbank.by/ru/33139/press/bank_news";

    }
}
