package com.ggyu.clientapp.global;

import com.ggyu.base.global.util.JsonUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class UtilTest {

    @Test
    void convertTestDtoToJson() {
        Src src = Src.builder()
                .title("AAA")
                .cnt(123)
                .build();

        // log.info(JsonUtil.toJson(src));
        log.info(JsonUtil.GSON.toJson(src));
    }

    @AllArgsConstructor
    @Builder
    static class Src {
        private String title;
        private Integer cnt;
    }
}
