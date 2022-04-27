package com.sample.springbootsample.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Table(name = "SANHA_IT")
@Entity
public class SanhaIt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "YANOLJA_ID")
    private Yanolja yanolja;

    @Builder
    public SanhaIt(String name) {
        this.name = name;
    }
}
