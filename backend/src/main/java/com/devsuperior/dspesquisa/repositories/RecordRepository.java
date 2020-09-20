package com.devsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dspesquisa.entities.Record;
//JPARepository é uma interface pré pronta do SpringBoot
public interface RecordRepository extends JpaRepository<Record, Long> {

}
