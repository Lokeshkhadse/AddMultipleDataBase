package com.example.AddMultipleDB.Controller;

import com.example.AddMultipleDB.Service.MultiDbService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MultiDbController {

    private final MultiDbService multiDbService;

    public MultiDbController(MultiDbService multiDbService) {
        this.multiDbService = multiDbService;
    }

    // Endpoint to insert into Database 1
    @PostMapping("/db1")
    public String insertIntoDb1(@RequestParam String name) {
        multiDbService.insertIntoDb1(name);
        return "Inserted into Database 1 successfully!";
    }

    // Endpoint to insert into Database 2
    @PostMapping("/db2")
    public String insertIntoDb2(@RequestParam String name) {
        multiDbService.insertIntoDb2(name);
        return "Inserted into Database 2 successfully!";
    }
}

