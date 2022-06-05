package com.example.dao;

import com.example.pojo.Hero;

import java.util.List;

public interface HeroDao {
    public void save(Hero hero);
    public void update(Hero hero);
    public void delete(Integer id);
    public Hero getById(Integer id);
    public List<Hero> getAll();
}
