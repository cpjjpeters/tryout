package be.tryout.persistence.jpa;

/* carlpeters created on 04/10/2022 inside the package - be.tryout.persistence.jpa */


import be.tryout.persistence.jpa.entity.CityJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CityJpaRepository extends JpaRepository<CityJpaEntity, Long> {


}
