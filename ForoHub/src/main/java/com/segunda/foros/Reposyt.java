package segunda;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Reposyt extends JpaRepository<Foro, Long>{
    Page<Foro> findByEstadoTrue(Pageable paginacion);
}

