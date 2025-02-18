package com.project.debito.services.data_glue;

import com.project.debito.entity.Debit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;


public interface IDebitDataService {

     Flux<List<Debit>> processInBatches();
}
