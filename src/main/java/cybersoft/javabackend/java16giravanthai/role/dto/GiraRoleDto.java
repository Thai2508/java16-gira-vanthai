package cybersoft.javabackend.java16giravanthai.role.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GiraRoleDto {

	@Size(min = 5, max = 5 ,message = "Code must be 5 character")
	private String code;
	
	@NotBlank(message = "Description not blank")
	private String description;
}
