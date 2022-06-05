package com.example.controller;
import com.example.pojo.Hero;
import com.example.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/heros")
public class HeroController {
    @Autowired
    private HeroService heroService;

@PostMapping
    public boolean save(@RequestBody Hero hero) {
        heroService.save(hero);
        return true;
    }

@PutMapping
    public boolean update(@RequestBody  Hero hero) {
        heroService.save(hero);
        return true;
    }

@DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        heroService.delete(id);
        return true;
    }

    @GetMapping("/{id}")
    public Hero getById(@PathVariable Integer id) {

    return  heroService.getById(id);
    }

    @GetMapping
    public List<Hero> getAll() {

        return heroService.getAll();
    }
}
