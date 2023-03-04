package com.ggyu.clientapp.domain.test;

import com.ggyu.base.global.util.JsonUtil;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class TestDto {
    @Schema(description = "문자열 타입" , example = "ABC")
    private String str;
    @Schema(description = "숫자 타입" , example = "100")
    private Integer integer;
    @Schema(description = "날짜 및 시간 타입" , example = "2020-09-23T18:34:24.458")
    private LocalDateTime dateTime;
}
