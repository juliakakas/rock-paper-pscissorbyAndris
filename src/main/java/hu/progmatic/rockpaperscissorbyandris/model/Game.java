package hu.progmatic.rockpaperscissorbyandris.model;

public class Game {
    private String playerChoice;
    private String computerChoice;
    private String winner;

    public Game(){}

    /*public Game (String computerChoice){
        this.computerChoice = computerChoice;
    }*/

    public String getPlayerChoice() {
        return playerChoice;
    }

    public void setPlayerChoice(String playerChoice) {
        this.playerChoice = playerChoice;
    }

    public String getComputerChoice() {
        return computerChoice;
    }

    public void setComputerChoice(String computerChoice) {
        this.computerChoice = computerChoice;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }
}
