package com.example.demo.Grzyb.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;
import java.util.UUID;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "grzyby")
public class Grzyb {
    @Id
    @Column(name = "UUID")
    private UUID identifier;
    @Column(name = "Nazwa")
    private String name;
    @Column(name = "Opis")
    private String description;
    @Column(name = "Zdjęcie")
    private String imageURL;
    @Column(name = "Zdjęcie2")
    private String imageURL2;
    @Column(name = "Zdjęcie3")
    private String imageURL3;
    @Column(name = "CzyJadalne")
    private Boolean edible;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Grzyb Grzyb = (Grzyb) o;
        return Objects.equals(name, Grzyb.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Grzyb{" +
                "identifier=" + identifier +
                ", name='" + name;
    }
}
