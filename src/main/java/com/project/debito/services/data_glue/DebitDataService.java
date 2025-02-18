package com.project.debito.services.data_glue;


import com.project.debito.entity.Debit;
import com.project.debito.repository.DebitRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import java.util.List;

@Service

public class DebitDataService implements IDebitDataService {

    private final DebitRepository debitRepository;

    private static final Logger log = LoggerFactory.getLogger(DebitDataService.class);

    public DebitDataService(DebitRepository debitRepository) {
        this.debitRepository = debitRepository;
    }

    public Flux<List<Debit>> processInBatches(){
        return debitRepository.findAll()
                .buffer(100)
                .doOnNext(batch-> log.info("Procesando lote de {} registro ", batch.size()));
    }





}
