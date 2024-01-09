package br.com.mrtech.autocenter.automoveis.infra;

import br.com.mrtech.autocenter.automoveis.domain.Automovel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutomovelSpringDataJpaRepository extends JpaRepository<Automovel,Long> {
}
