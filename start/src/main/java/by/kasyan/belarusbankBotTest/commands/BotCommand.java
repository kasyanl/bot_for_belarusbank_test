package by.kasyan.belarusbankBotTest.commands;

public enum BotCommand {

    START("/start", "Старт"),
    HELLO("/hello", "Приветствие"),
   // MENU("/menu", "Вывести меню"),
    NEWS("/news", "Новости"),
    CURSES("/curses", "Актуальные курсы валют"),
//    SHOW_POGODA("/pogoda", "Прогноз на неделю"),
//    VIDEO("/video","осмотреть видосики"),
//    MUSIC("/music", "Послушать музыку"),
//    GAMES("/games", "Поиграть в игры"),
//    BYE("/bye", "Прощанье"),
    NONE("", "");

    final String command;
    final String description;

    BotCommand(String command, String description) {
        this.command = command;
        this.description = description;
    }

    public String getCommand() {
        return command;
    }

    public String getDescription() {
        return description;
    }

    public static BotCommand toCommand(String command) {
        switch (command) {
            case "/start":
                return START;
            case "/hello":
                return HELLO;
            case "/news":
                return NEWS;
            default:
                return NONE;
        }
    }
}
