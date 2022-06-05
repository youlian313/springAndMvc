package com.example.service;

import com.example.config.SpringConfig;
import com.example.pojo.Hero;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class HeroServiceTest {

    @Autowired
    private HeroService heroService;
    @Test
    public void getAllTest(){
        List<Hero> all = heroService.getAll();
        System.out.println(all);
    }
    @Test
    public void getByIdTest(){
        Hero hero=heroService.getById(1);
        System.out.println(hero);
    }
}
