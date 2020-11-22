package com.johnwick182.chatbotdemo.resource;

import com.johnwick182.chatbotdemo.model.Bot;
import com.johnwick182.chatbotdemo.service.BotService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="/bot")
public class BotController {

    @Autowired
    private BotService botService;

    @PostMapping(path="/")
    public ResponseEntity<Bot> addBot(@RequestBody Bot bot) {
        return ResponseEntity.ok(botService.save(bot));
    }

    @GetMapping("/all")
    public List<Bot> getBots() {
        return botService.findAll();
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public ResponseEntity<Optional<Bot>> getById(@PathVariable(value="id") String id) {
        Optional<Bot> bot = botService.findById(id);
        if (bot.isPresent()) {
            return ResponseEntity.ok(bot);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<Bot> deleteBot(@PathVariable String id){
        if (botService.findById(id).isPresent()){
            botService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping(path="/")
    public ResponseEntity<Bot> updateBot(@RequestBody Bot bot) {
        if (botService.findById(bot.getId()).isPresent()) {
            return ResponseEntity.ok(botService.save(bot));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
