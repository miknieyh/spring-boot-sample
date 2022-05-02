package com.sample.springbootsample;

import com.sample.springbootsample.domain.SanhaIt;
import com.sample.springbootsample.domain.SanhaItRepository;
import com.sample.springbootsample.domain.Yanolja;
import com.sample.springbootsample.domain.YanoljaRepository;
import com.sample.springbootsample.dto.sanhaIt.SanhaItSaveRequestDto;
import com.sample.springbootsample.dto.yanolja.YanoljaSaveRequestDto;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringBootSampleApplicationTests {

     @LocalServerPort
     private int port;

     @Autowired
     private TestRestTemplate restTemplate;

     @Autowired
     private SanhaItRepository sanhaItRepository;

     @Autowired
     private YanoljaRepository yanoljaRepository;

     @AfterEach
     public void tearDown() throws Exception {
          sanhaItRepository.deleteAll();
          yanoljaRepository.deleteAll();
     }

     @Test
     void Yanolja_save() {
          //given
          String yanoljaName = "야놀자1";
          String sanhaItName = "산하1";

          String yanoljaSaveUrl = "http://localhost:"+port+"/v1/yanolja";
          String sanhaItSaveUrl = "http://localhost:"+port+"/v1/sanhaIt";

          YanoljaSaveRequestDto yanoljaSaveRequestDto = YanoljaSaveRequestDto.builder()
                  .name(yanoljaName)
                  .build();

          SanhaItSaveRequestDto sanhaItSaveRequestDto = SanhaItSaveRequestDto.builder()
                  .name(sanhaItName)
                  .build();
          //when
          ResponseEntity<Long> yanoljaResponseEntity = restTemplate.postForEntity(yanoljaSaveUrl,yanoljaSaveRequestDto,Long.class);
          ResponseEntity<Long> sanhaItResponseEntity = restTemplate.postForEntity(sanhaItSaveUrl,sanhaItSaveRequestDto,Long.class);

          //then
          assertThat(yanoljaResponseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
          assertThat(yanoljaResponseEntity.getBody()).isGreaterThan(0L);
          assertThat(sanhaItResponseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
          assertThat(sanhaItResponseEntity.getBody()).isGreaterThan(0L);
     }

}
