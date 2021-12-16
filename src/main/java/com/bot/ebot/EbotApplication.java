package com.bot.ebot;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.security.auth.login.LoginException;

@SpringBootApplication
public class EbotApplication {
    @ Value("${Discord.token}")
    public static String Token;

    public static void main(String[] args) throws LoginException {
        SpringApplication.run(EbotApplication.class, args);

        JDABuilder jdaBuilder = JDABuilder.createDefault("OTE5MjMxMjQyMTMyNjg0ODAw.YbSyzg.im-y5DuagDMBqLHtP3SEtff5C5s");
        jdaBuilder.setActivity(Activity.playing("with your mind"));
        jdaBuilder.setStatus(OnlineStatus.ONLINE);
        jdaBuilder.addEventListeners(new Commands());
        jdaBuilder.build();

    }

}
