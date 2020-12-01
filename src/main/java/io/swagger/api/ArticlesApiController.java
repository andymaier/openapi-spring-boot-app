package io.swagger.api;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.model.Article;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-01T13:09:57.424Z[GMT]")
@RestController
public class ArticlesApiController implements ArticlesApi {

    private static final Logger log = LoggerFactory.getLogger(ArticlesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ArticlesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> articlesAidDelete(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("aid") String aid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Article> articlesAidGet(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("aid") String aid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Article>(objectMapper.readValue("{\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}", Article.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Article>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Article>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Article> articlesAidPatch(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("aid") String aid,@Parameter(in = ParameterIn.DEFAULT, description = "Update Article attribute.", required=true, schema=@Schema()) @Valid @RequestBody String body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Article>(objectMapper.readValue("{\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}", Article.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Article>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Article>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Article> articlesAidPut(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("aid") String aid,@Parameter(in = ParameterIn.DEFAULT, description = "Update an existing article or create a new article.", required=true, schema=@Schema()) @Valid @RequestBody Article body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Article>(objectMapper.readValue("{\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}", Article.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Article>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Article>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Article>> articlesGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Article>>(objectMapper.readValue("[ {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}, {\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n} ]", List.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Article>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Article>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Article> articlesPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Article body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Article>(objectMapper.readValue("{\n  \"price\" : 0.99,\n  \"name\" : \"Friedrich\"\n}", Article.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Article>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Article>(HttpStatus.NOT_IMPLEMENTED);
    }

}
