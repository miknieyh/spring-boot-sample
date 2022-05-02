package com.sample.springbootsample.controller.sanhaIt;

import com.sample.springbootsample.domain.SanhaItRepository;
import com.sample.springbootsample.dto.sanhaIt.SanhaItSaveRequestDto;
import com.sample.springbootsample.service.sanhaIt.SanhaItServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/v1")
public class SanhaItController {

    private final SanhaItRepository sanhaItRepository;
    private final SanhaItServiceImpl sanhaItService;

    @PostMapping("/sanhaIt")
    public Long save(@RequestBody SanhaItSaveRequestDto requestDto){
        return sanhaItService.save(requestDto);
    }

}
