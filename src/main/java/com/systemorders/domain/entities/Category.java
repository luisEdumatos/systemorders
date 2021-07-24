package com.systemorders.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "tb_category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Category(String name) {
        this.name = name;
    }

    @JsonIgnore
    @ManyToMany(
            mappedBy = "categories"
    )
    private Set<Product> products = new HashSet<>();
}
