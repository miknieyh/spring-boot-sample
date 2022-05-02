package com.sample.springbootsample.dto.yanolja;

import com.sample.springbootsample.domain.Yanolja;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class YanoljaSaveRequestDto {
    String name;

    @Builder
    public YanoljaSaveRequestDto(String name){
        this.name = name;
    }

    public Yanolja toEntity(){
        return Yanolja.builder()
                .name(name)
                .build();
    }
}
