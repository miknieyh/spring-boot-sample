package com.sample.springbootsample.dto.sanhaIt;

import com.sample.springbootsample.domain.SanhaIt;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SanhaItSaveRequestDto {
    private String name;

    @Builder
    public SanhaItSaveRequestDto(String name){
        this.name = name;
    }

    public SanhaIt toEntity() {
        return SanhaIt.builder()
                .name(name)
                .build();
    }
}
