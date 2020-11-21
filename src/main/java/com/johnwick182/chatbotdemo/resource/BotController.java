package com.johnwick182.chatbotdemo.resource;

import com.johnwick182.chatbotdemo.model.Bot;
import com.johnwick182.chatbotdemo.service.BotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="/bot")
public class BotController {

    @Autowired
    private BotService botService;

    @PostMapping(path="/")
    public @ResponseBody String addBot(@RequestBody Bot bot) {
        botService.save(bot);
        return "Saved";
    }

    @GetMapping("/all")
    public List<Bot> getBots() {
        return (List<Bot>) botService.findAll();
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Optional<Bot>  getById(@PathVariable(value="id") String id) {
        return botService.findById(id);
    }

    /*
    [GET]    /bot/all - retorna todos os bots criados - DONE
    [GET]    /bot/:id - busca bot por id - DONE
    [POST]   /bot/    - cria um novo bot - DONE
    [DELETE] /bot/:id - deleta o bot por id - DONE
    [PUT]    /bot/:id - altera o bot
     */

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public String deleteBot(@PathVariable String id){
        if (botService.findById(id).isPresent()){
            botService.deleteById(id);
            return "Deleted";
        } else {
            return "Not Found";
        }
    }

    @PutMapping(path="/")
    public @ResponseBody String updateBot(@RequestBody Bot bot) {
        if (botService.findById(bot.getId()).isPresent()) {
            botService.save(bot);
            return "Bot updated";
        } else {
            return "Not found";
        }
    }



}
