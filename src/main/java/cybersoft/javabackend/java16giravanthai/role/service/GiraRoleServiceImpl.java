package cybersoft.javabackend.java16giravanthai.role.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cybersoft.javabackend.java16giravanthai.role.dto.GiraRoleDto;
import cybersoft.javabackend.java16giravanthai.role.mapper.GiraRoleMapper;
import cybersoft.javabackend.java16giravanthai.role.model.GiraRole;
import cybersoft.javabackend.java16giravanthai.role.repository.GiraRoleRepository;

@Service
public class GiraRoleServiceImpl implements GiraRoleService{
	
	@Autowired
	private GiraRoleRepository rep;
	
	@Override
	public List<GiraRole> findAllEntity(){
		return rep.findAll();
	}
	
	@Override
	public GiraRole save(GiraRoleDto dto){
		// map dto to entity
		GiraRole role =  GiraRoleMapper.INSTANCE.mapToEntity(dto);
		
		return rep.save(role);
	}

}
