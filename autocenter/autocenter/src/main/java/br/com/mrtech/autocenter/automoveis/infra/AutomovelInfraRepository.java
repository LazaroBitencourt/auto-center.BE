package br.com.mrtech.autocenter.automoveis.infra;

import br.com.mrtech.autocenter.automoveis.application.repository.AutomovelRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class AutomovelInfraRepository implements AutomovelRepository {
    private final AutomovelSpringDataJpaRepository jpaRepository;
}
