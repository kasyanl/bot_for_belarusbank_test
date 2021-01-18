package by.kasyan.belarusbank_bot_test.commands.headmenu;

import by.kasyan.belarusbank_bot_test.commands.BotCommand;
import by.kasyan.belarusbank_bot_test.commands.CommandProcessor;

public class MenuBot extends CommandProcessor {
    @Override
    public String getResponse() {
        return printInformation();
    }

    public String printInformation() {
        BotCommand[] commands = BotCommand.values();
        StringBuilder description = new StringBuilder();

        for (BotCommand command : commands) {
            description.append(String.format("%n%s - %s", command.getCommand(), command.getDescription()));
        }

        return String.format("Выберите одну из %s команд: %s",
                commands.length,
                description);
    }
}
