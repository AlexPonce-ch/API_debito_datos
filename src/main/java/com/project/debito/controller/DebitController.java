package com.project.debito.controller;

import com.project.debito.entity.Debit;
import com.project.debito.services.data_glue.IDebitDataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@RequestMapping("/api/v1/debit")
public class DebitController {

     private final IDebitDataService iDebitDataService;

        public DebitController(IDebitDataService iDebitDataService) {
            this.iDebitDataService = iDebitDataService;
        }

     @GetMapping("/batch")
     public Flux<List<Debit>> getDebitBatchRecords(){
          return iDebitDataService.processInBatches();
     }




}
