package com.example.service.impl;

import com.example.dao.HeroDao;
import com.example.pojo.Hero;
import com.example.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HeroServiceImpl implements HeroService {
    @Autowired
    private HeroDao heroDao;
    @Override
    public boolean save(Hero hero) {
        heroDao.save(hero);
        return true;
    }

    @Override
    public boolean update(Hero hero) {
        heroDao.save(hero);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        heroDao.delete(id);
        return true;
    }

    @Override
    public Hero getById(Integer id) {
        return  heroDao.getById(id);
    }

    @Override
    public List<Hero> getAll() {

        return heroDao.getAll();
    }
}
