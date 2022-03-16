package com.gerasimchuk.springconfigurablelearn;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Data
@Configurable(autowire = Autowire.BY_TYPE, preConstruction = true)
public class NotASpringBean {

  @Autowired
  private ServiceForInjection serviceForInjection;

  private final String message = serviceForInjection.getMsg();


}
