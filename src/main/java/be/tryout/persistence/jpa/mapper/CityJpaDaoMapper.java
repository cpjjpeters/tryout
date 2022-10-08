package be.tryout.persistence.jpa.mapper;

import be.tryout.model.City;
import be.tryout.persistence.jpa.entity.CityJpaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @author tersc
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.WARN)
public interface CityJpaDaoMapper {
    CityJpaEntity modelToJpaEntity(City city);

    City jpaEntityToModel(CityJpaEntity cityJpaEntity);
}
