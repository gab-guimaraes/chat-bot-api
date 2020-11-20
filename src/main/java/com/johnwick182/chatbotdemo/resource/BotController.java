package com.johnwick182.chatbotdemo.resource;

import com.johnwick182.chatbotdemo.model.Bot;
import com.johnwick182.chatbotdemo.repository.BotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(path="/bot")
public class BotController {

    @Autowired
    private BotRepository repository;

    @PostMapping(path="/")
    public @ResponseBody
    String addBot(@RequestParam Long id, @RequestParam String nome) {
        Bot bot = new Bot();
        bot.setIdBot(id);
        bot.setName(nome);
        repository.save(bot);
        return "Saved";
    }

    @GetMapping("/all")
    public List<Bot> getBots() {
        return (List<Bot>) repository.findAll();
    }

    //@GetMapping("/all")
    //public Iterable<Bot> getBot(@PathVariable int id) {
    //    return repository.findAllById(Collections.singleton(id));
   // }

    @DeleteMapping("/delete")
    public String deleteBook(@PathVariable int id) {
        repository.deleteById(id);
        return "bot deleted with ifd" + id;
    }



}
