package com.course.distributecommunication.frontend;

import com.course.distributecommunication.frontend.model.AuthorDtoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Service
public class RestService {

  @Autowired
  private RestTemplate restTemplate;



  public AuthorDtoList getAuthorsCall() {
    ResponseEntity<AuthorDtoList> authorDtoList = restTemplate.getForEntity(
        "http://authors:8080/api/v1/authors", AuthorDtoList.class);;


    return authorDtoList.getBody();
  }
}
