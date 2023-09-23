package hu.progmatic.rockpaperscissorbyandris.service;

import hu.progmatic.rockpaperscissorbyandris.model.Game;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    private Game game;

    public GameService(Game game){
        this.game= game;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void userInput(String choice) {
        game.setPlayerChoice(choice);
    }
}
