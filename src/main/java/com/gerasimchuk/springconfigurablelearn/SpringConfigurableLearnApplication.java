package com.gerasimchuk.springconfigurablelearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

@EnableSpringConfigured
@SpringBootApplication
public class SpringConfigurableLearnApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringConfigurableLearnApplication.class, args);

    NotASpringBean notASpringBean = new NotASpringBean();

    System.out.println(notASpringBean.getMessage());
  }

}
