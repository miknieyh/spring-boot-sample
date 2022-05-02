package com.sample.springbootsample.service.sanhaIt;

import com.sample.springbootsample.domain.SanhaItRepository;
import com.sample.springbootsample.dto.sanhaIt.SanhaItSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
public class SanhaItServiceImpl implements SanhaItService{

    private final SanhaItRepository sanhaItRepository;

    @Override
    public Long save(SanhaItSaveRequestDto requestDto) {
        return sanhaItRepository.save(requestDto.toEntity()).getId();
    }
}
