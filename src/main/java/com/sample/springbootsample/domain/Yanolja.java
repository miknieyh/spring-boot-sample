package com.sample.springbootsample.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
public class Yanolja {

     @Id
     @GeneratedValue
     @Column(name = "YANOLJA_ID")
     private Long id;

     private String name;

     @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
     private List<SanhaIt> sanhaItList = new ArrayList<>();

     public void addSanha(SanhaIt sanhaIt){
          sanhaItList.add(sanhaIt);
          sanhaIt.setYanolja(this);
     }
}
