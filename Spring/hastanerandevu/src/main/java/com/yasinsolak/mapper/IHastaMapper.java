package com.yasinsolak.mapper;

import com.yasinsolak.dto.request.HastaSaveRequestDto;
import com.yasinsolak.repository.entity.Hasta;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IHastaMapper {
    IHastaMapper INSTANCE = Mappers.getMapper(IHastaMapper.class);

    Hasta fromSaveDto(HastaSaveRequestDto dto);
}
