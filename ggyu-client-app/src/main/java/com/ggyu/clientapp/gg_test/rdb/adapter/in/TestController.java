package com.ggyu.clientapp.gg_test.rdb.adapter.in;

import com.ggyu.base.gg_test.rdb.adapter.in.form.TestForm;
import com.ggyu.base.gg_test.rdb.adapter.out.persistence.TestMapper;
import com.ggyu.base.gg_test.rdb.application.service.TestService;
import com.ggyu.base.gg_test.rdb.domain.Test;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
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
@RequiredArgsConstructor
@Tag(name = "테스트 API")
@Slf4j
public class TestController {

    private final TestService testService;

    @Operation(description = "GET 요청")
    @GetMapping(value = "/{id}")
    public ResponseEntity<Test> getRequest(@Parameter @PathVariable Long id) {
        return ResponseEntity.ok(testService.getOne(id));
    }

    @Operation(description = "POST 요청")
    @PostMapping(value = "/")
    public ResponseEntity<Test> postRequest(@Parameter @RequestBody TestForm dto) {
        return ResponseEntity.ok(testService.create(dto));
    }
}
