package br.com.mrtech.autocenter.automoveis.infra;

import br.com.mrtech.autocenter.automoveis.application.repository.AutomovelRepository;
import br.com.mrtech.autocenter.automoveis.domain.Automovel;
import br.com.mrtech.autocenter.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

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

    @Override
    public List<Automovel> buscaTodosVeiculos() {
        log.info("[inicia] AutomovelInfraRepository - buscaTodosVeiculos");
        var listaTodos = jpaRepository.findAll();
        log.info("[finaliza] AutomovelInfraRepository - buscaTodosVeiculos");
        return listaTodos;
    }

    @Override
    public Automovel buscaAutomovelId(UUID idAutomovel) {
        log.info("[inicia] AutomovelInfraRepository - buscaAutomovelId");
        var buscaAutomovel = jpaRepository.findById(idAutomovel).orElseThrow(()
                -> APIException.build(HttpStatus.NOT_FOUND, "AUTOMOVEL NAO ENCONTRADO OU "
                        + "NAO EXISTE! \n !INSIRA UM ID VALIDO OU INFORME AO ADM DO SISTEMA!"
                ));
        log.info("[finaliza] AutomovelInfraRepository - buscaAutomovelId");
        return buscaAutomovel;
    }

    @Override
    public void deletaAutomovelPorId(UUID idAutomovel) {
        log.info("[inicia] AutomovelInfraRepository - deletaAutomovelPorId");
        jpaRepository.deleteById(idAutomovel);
        log.info("[finaliza] AutomovelInfraRepository - deletaAutomovelPorId");
    }
    
}
