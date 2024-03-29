package ru.itapp.entity;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
import java.util.Set;


@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "products", schema = "public")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false)
    @JsonView(View.Product.class)
    private String name;

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
