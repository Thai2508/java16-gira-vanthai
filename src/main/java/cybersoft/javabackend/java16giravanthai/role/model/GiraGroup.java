package cybersoft.javabackend.java16giravanthai.role.model;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;

import cybersoft.javabackend.java16giravanthai.common.model.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name="gira_group")
public class GiraGroup extends BaseEntity{
	
	@Size(min = 5, max = 5)
	private String code;
	
	@NotBlank
	private String decription;
	
	@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(
			name = "gira-group-role",
			joinColumns = @JoinColumn(name = "group-id"),
			inverseJoinColumns = @JoinColumn(name = "role-id")
			)
	Set<GiraRole> roles = new LinkedHashSet();

}
