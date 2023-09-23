package hu.progmatic.rockpaperscissorbyandris.config;

import hu.progmatic.rockpaperscissorbyandris.model.Game;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class GameConfig {
    @Bean
    public Game gameBean(String computerChoice){
        return new Game(computerChoice);
    }

    @Bean
    public String choiceBean(){
        switch (new Random().nextInt(3)){
            case 0 -> {return "rock";}
            case 1 -> {return  "paper";}
            default -> {return "scissor";}
        }

    }
}
