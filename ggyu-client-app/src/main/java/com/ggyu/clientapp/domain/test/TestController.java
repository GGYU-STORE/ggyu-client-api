package com.ggyu.clientapp.domain.test;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Tag(name = "테스트 API")
@Slf4j
public class TestController {

    @Operation(description = "GET 요청")
    @GetMapping(value = "/{id}")
    public ResponseEntity<String> getRequest(@Parameter @PathVariable String id) {
        return ResponseEntity.ok(id);
    }

    @Operation(description = "POST 요청")
    @PostMapping(value = "/")
    public ResponseEntity<TestDto> postRequest(@Parameter @RequestBody TestDto dto) {
        return ResponseEntity.ok(dto);
    }
}
