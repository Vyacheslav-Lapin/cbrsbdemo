package com.example.demo.config;

import com.example.demo.dao.CatRepository;
import com.example.demo.model.Cat;
import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Initer implements ApplicationRunner {

  CatRepository catRepository;

  @Override
  public void run(ApplicationArguments __) {
    Stream.of("Барсик", "Мурзик", "Васька")
        .map(Cat::new)
        .forEach(catRepository::save);
  }
}
