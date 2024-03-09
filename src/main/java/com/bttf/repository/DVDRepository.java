package com.bttf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bttf.model.DVD;

/**
author : Wassim MNASSER
*/
@Repository
public interface DVDRepository extends JpaRepository<DVD, Long> {

}
