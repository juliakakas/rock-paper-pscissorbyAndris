package hu.progmatic.rockpaperscissorbyandris.service;

import hu.progmatic.rockpaperscissorbyandris.model.Game;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class GameService {
    private Game game;

    public GameService(Game game){
        this.game= game;
    }

    private String computerChoice(){
        switch (new Random().nextInt(3)){
            case 0 -> {return "rock";}
            case 1 -> {return  "paper";}
            default -> {return "scissor";}
        }
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void userInput(String choice) {
        game.setComputerChoice(computerChoice());
        game.setPlayerChoice(choice);
        game.setWinner(winner(game.getComputerChoice(), game.getPlayerChoice()));
    }

    private String winner(String computer, String player){
        if (computer.equals(player)){
            return "draw";
        }
        if(computer.equals("rock") && player.equals("paper") ||
        computer.equals("paper") && player.equals("scissor") ||
        computer.equals("scissor")&& player.equals("rock")){
            return "player win";
        }
        return "computer win";
    }


}
