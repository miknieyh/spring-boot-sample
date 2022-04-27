package com.sample.springbootsample;

import com.sample.springbootsample.domain.SanhaIt;
import com.sample.springbootsample.domain.SanhaItRepository;
import com.sample.springbootsample.domain.Yanolja;
import com.sample.springbootsample.domain.YanoljaRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringBootSampleApplicationTests {

     @LocalServerPort
     private int port;

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

          String url = "http://localhost"+port+"/api/v1/posts";

          //when

          //then
     }

}
