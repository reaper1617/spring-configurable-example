package com.gerasimchuk.springconfigurablelearn;

import org.springframework.stereotype.Service;

@Service
public class ServiceForInjection {
  public String getMsg(){
    return "Message from injected service" + this.getClass().getName();
  }
}
