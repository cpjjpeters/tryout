package be.tryout.service;

/* carlpeters created on 04/10/2022 inside the package - be.tryout.service */
import be.tryout.model.City;
import be.tryout.persistence.jpa.CityJpaRepository;
import be.tryout.persistence.jpa.entity.CityJpaEntity;
import be.tryout.persistence.jpa.mapper.CityJpaDaoMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class CityJpaPersistenceService {

    private final CityJpaRepository cityJpaRepository;
    private final CityJpaDaoMapper cityJpaDaoMapper;


    public CityJpaPersistenceService(CityJpaRepository cityJpaRepository, CityJpaDaoMapper cityJpaDaoMapper) {
        this.cityJpaRepository = cityJpaRepository;
        this.cityJpaDaoMapper = cityJpaDaoMapper;
    }

    public List<City> findAll() {
        return this.cityJpaRepository.findAll()
                .stream()
                .map(this.cityJpaDaoMapper::jpaEntityToModel).collect(Collectors.toList());
    }

    public City save(City city) {
        final CityJpaEntity model = this.cityJpaDaoMapper.modelToJpaEntity(city);
        log.debug("City JPA = {}", model);
        final CityJpaEntity cityJpaEntity = this.cityJpaRepository.save(model);
        this.cityJpaRepository.flush();
        return this.cityJpaDaoMapper.jpaEntityToModel(cityJpaEntity);
    }

    public void deleteAll() {
        this.cityJpaRepository.deleteAll();
    }
}