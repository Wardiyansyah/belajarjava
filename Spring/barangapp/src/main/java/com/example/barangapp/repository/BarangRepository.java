package com.example.barangapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.barangapp.model.Barang;

public interface BarangRepository extends JpaRepository<Barang, Long> {
    
}
