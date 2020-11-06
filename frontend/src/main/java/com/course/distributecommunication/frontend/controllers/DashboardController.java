package com.course.distributecommunication.frontend.controllers;

import com.course.distributecommunication.frontend.RestService;
import com.course.distributecommunication.frontend.model.AuthorDto;
import com.course.distributecommunication.frontend.model.AuthorsAndBooksDto;
import com.course.distributecommunication.frontend.model.BookDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DashboardController {

    private static final Logger logger = LoggerFactory.getLogger(DashboardController.class);
  private @Autowired RestTemplate restTemplate;
  private @Autowired RestService restService;

  //  @Autowired RestService service;

  //TODO implement Get mapping
    @GetMapping("/v1/dashboard")
  private AuthorsAndBooksDto getAuthors()
  {
    final String uriAuthors = "http://authors:8080/api/v1/authors";
    final String uriBooks = "http://books:8080/api/v1/books";
//    WebClient client1 = WebClient.create("http://localhost:8091/api/v1/authors");
//    return client1.get().retrieve().bodyToMono(AuthorDto.class);
//    return restService.getAuthorsCall();

    HttpHeaders headers = new HttpHeaders();
    headers.add(HttpHeaders.CONTENT_TYPE, "text/json");
    ResponseEntity<List<AuthorDto>> authorsResponseEntity = restTemplate.exchange(
        uriAuthors,
        HttpMethod.GET,
        new HttpEntity<>(headers),
        new ParameterizedTypeReference<List<AuthorDto>>() {
        });
    List<AuthorDto> authorDtoList = authorsResponseEntity.getBody();

    HttpHeaders headers2 = new HttpHeaders();
    headers.add(HttpHeaders.CONTENT_TYPE, "text/json");
    ResponseEntity<List<BookDto>> booksResponseEntity = restTemplate.exchange(
        uriBooks,
        HttpMethod.GET,
        new HttpEntity<>(headers2),
        new ParameterizedTypeReference<List<BookDto>>() {
        });
    List<BookDto> bookDtoList = booksResponseEntity.getBody();

    return new AuthorsAndBooksDto(authorDtoList, bookDtoList);

//    return clientResponse;
//    AuthorDtoList result = restTemplate.getForObject(uri, AuthorDtoList.class);

//    String result = restTemplate.getForObject(uri, String.class);

//    return String.valueOf(client1.get());
  }

}
