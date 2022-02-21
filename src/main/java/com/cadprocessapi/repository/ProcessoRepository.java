package com.cadprocessapi.repository;

import com.cadprocessapi.model.Processos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcessoRepository extends JpaRepository <Processos, Long> {
}
