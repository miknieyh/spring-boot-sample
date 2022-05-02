package com.sample.springbootsample.controller.yanolja;

import com.sample.springbootsample.domain.YanoljaRepository;
import com.sample.springbootsample.dto.yanolja.YanoljaSaveRequestDto;
import com.sample.springbootsample.service.yanolja.YanoljaServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/v1")
public class YanoljaController {

    private final YanoljaRepository yanoljaRepository;
    private final YanoljaServiceImpl yanoljaService;

    @PostMapping (value = "/yanolja")
    public Long save(@RequestBody YanoljaSaveRequestDto requestDto){
        return yanoljaService.save(requestDto);
    }

}
