package com.example.compsdata.repo;

import com.example.compsdata.model.Comp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompRepo extends JpaRepository<Comp, Long> {
}
