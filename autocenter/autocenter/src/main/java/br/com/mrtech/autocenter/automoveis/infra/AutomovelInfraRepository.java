package br.com.mrtech.autocenter.automoveis.infra;

import br.com.mrtech.autocenter.automoveis.application.repository.AutomovelRepository;
import br.com.mrtech.autocenter.automoveis.domain.Automovel;
import br.com.mrtech.autocenter.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class AutomovelInfraRepository implements AutomovelRepository {

    private final AutomovelSpringDataJpaRepository jpaRepository;

    @Override
    public Automovel salva(Automovel automovel) {
        log.info("[inicia] AutomovelInfraRepository - salva");
        try{
            jpaRepository.save(automovel);
        }catch (DataIntegrityViolationException e){
            throw APIException.build(HttpStatus.BAD_REQUEST,"EXISTE DADOS DUPLICADOS", e);
        }
        log.info("[finaliza] AutomovelInfraRepository - salva");
        return automovel;
    }
}
