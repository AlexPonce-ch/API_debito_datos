package com.project.debito.repository;
import com.project.debito.entity.Debit;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DebitRepository extends ReactiveCrudRepository<Debit,Long> {
}
