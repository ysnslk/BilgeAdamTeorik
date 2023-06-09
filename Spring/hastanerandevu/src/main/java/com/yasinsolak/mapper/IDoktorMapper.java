package com.yasinsolak.mapper;

import com.yasinsolak.dto.request.DoktorSaveRequestDto;
import com.yasinsolak.dto.request.HastaSaveRequestDto;
import com.yasinsolak.repository.entity.Doktor;
import com.yasinsolak.repository.entity.Hasta;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IDoktorMapper {

    IDoktorMapper INSTANCE = Mappers.getMapper(IDoktorMapper.class);

    Doktor fromSaveDto(DoktorSaveRequestDto dto);
}
