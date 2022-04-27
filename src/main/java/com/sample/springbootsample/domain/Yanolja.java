package com.sample.springbootsample.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@Table(name = "YANOLJA")
@Entity
public class Yanolja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "YANOLJA_ID")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "yanolja", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<SanhaIt> sanhaItList = new ArrayList<>();

    @Builder
    public Yanolja(String name) {
        this.name = name;
    }

    public void addSanha(SanhaIt sanhaIt) {
        if (this.sanhaItList == null) {
            this.sanhaItList = new ArrayList<>();
        }
        this.sanhaItList.add(sanhaIt);
    }


}
