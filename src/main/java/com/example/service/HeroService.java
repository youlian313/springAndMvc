package com.example.service;

import com.example.pojo.Hero;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface HeroService {
    public boolean save(Hero hero);
    public boolean update(Hero hero);
    public boolean delete(Integer id);
    public Hero getById(Integer id);
    public List<Hero> getAll();
}
