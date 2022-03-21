package cybersoft.javabackend.java16giravanthai.role.repository;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import cybersoft.javabackend.java16giravanthai.role.model.GiraRole;

@SpringBootTest
@Transactional
public class GiraRoleRepositoryTest {

	@Autowired
	private GiraRoleRepository rep; 
	
	@Test
	public void shouldNotInsertRole() {
		GiraRole role = GiraRole.builder()
						.code("HANOI")
						.decription("THAI")
						.build();
		assertDoesNotThrow(() -> rep.save(role));
	}
}
