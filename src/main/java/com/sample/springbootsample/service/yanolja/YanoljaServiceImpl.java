package com.sample.springbootsample.service.yanolja;

import com.sample.springbootsample.domain.YanoljaRepository;
import com.sample.springbootsample.dto.yanolja.YanoljaSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
public class YanoljaServiceImpl implements YanoljaService{

    private final YanoljaRepository yanoljaRepository;

    @Override
    public Long save(YanoljaSaveRequestDto requestDto) {
        return yanoljaRepository.save(requestDto.toEntity()).getId();
    }
}
