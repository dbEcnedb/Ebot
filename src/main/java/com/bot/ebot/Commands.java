package com.bot.ebot;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Locale;

public class Commands extends ListenerAdapter {


    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split(" ");

        switch (args[0].toLowerCase(Locale.ROOT)) {
            case "echo":
                String[] argsQ = new String[args.length - 1];
                System.arraycopy(args, 1, argsQ, 0, args.length - 1);
                event.getMessage().reply(String.join(" ",argsQ)).queue();
                break;
            case "email":
        }


    }


}
