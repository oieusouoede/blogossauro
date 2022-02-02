package com.generation.blogdoede.commons.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.generation.blogdoede.domain.model.Subject;
import com.generation.blogdoede.dto.SubjectDTO;

@Mapper
public interface SubjectMapper {
	
	SubjectMapper INSTANCE = Mappers.getMapper(SubjectMapper.class);
	
	SubjectDTO toDTO(Subject subject);
	Subject toModel(SubjectDTO subjectDto);

}