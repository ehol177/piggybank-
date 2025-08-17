package com.piggybank.vault.dao;

import com.piggybank.vault.entites.Vault;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VaultRepo extends JpaRepository<Vault, Long> {

}
