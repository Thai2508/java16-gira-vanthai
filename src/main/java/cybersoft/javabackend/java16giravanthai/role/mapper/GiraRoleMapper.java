package cybersoft.javabackend.java16giravanthai.role.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import cybersoft.javabackend.java16giravanthai.role.dto.GiraRoleDto;
import cybersoft.javabackend.java16giravanthai.role.model.GiraRole;

@Mapper
public interface GiraRoleMapper {
	
	GiraRoleMapper INSTANCE = Mappers.getMapper(GiraRoleMapper.class);
	
	GiraRole mapToEntity(GiraRoleDto dto);
}
