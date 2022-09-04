package katarzyna.dbrepo.dbservice.repository;

import katarzyna.dbrepo.dbservice.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Integer>{
        public Role findByRole(String role);
}
