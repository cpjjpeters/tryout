package be.tryout.persistence.jpa.entity;

/* carlpeters created on 04/10/2022 inside the package - be.tryout.persistence.jpa.entity */

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
@Table(name = "CITY")
@Entity
@EntityListeners(AuditingEntityListener.class)
public class CityJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;
    @Column(name="POPULATION")
    private int population;

    public CityJpaEntity(String brugge, int i) {
    }

    public CityJpaEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "CityJpaEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", population=" + population +
                '}';
    }
}


