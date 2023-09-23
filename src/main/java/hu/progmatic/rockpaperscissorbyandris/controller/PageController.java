package hu.progmatic.rockpaperscissorbyandris.controller;

import hu.progmatic.rockpaperscissorbyandris.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

    private GameService gameService;

    @Autowired
    public PageController(GameService gameService){
        this.gameService= gameService;
    }
    @GetMapping({"/home", "", "/"})
    public String getHome(){
        return "home";
    }

    @PostMapping("/play")
    public String getInput(@RequestParam("input") String choice){
        gameService.userInput(choice);
        return "redirect:/end";
    }

    @GetMapping("/end")
    public String getEnd(Model model){
        model.addAttribute("game", gameService.getGame());
        return "end";
    }


}
