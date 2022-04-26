package com.sample.springbootsample.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class SanhaIt {

     @Id
     @GeneratedValue
     private Long id;

     private String name;

     @ManyToOne
     @JoinColumn(name="YANOLJA_ID")
     private Yanolja yanolja;
}
