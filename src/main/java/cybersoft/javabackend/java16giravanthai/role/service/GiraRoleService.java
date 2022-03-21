package cybersoft.javabackend.java16giravanthai.role.service;

import java.util.List;

import cybersoft.javabackend.java16giravanthai.role.dto.GiraRoleDto;
import cybersoft.javabackend.java16giravanthai.role.model.*;

public interface GiraRoleService {
	
	List<GiraRole> findAllEntity();
	
	GiraRole save(GiraRoleDto dto);
}
