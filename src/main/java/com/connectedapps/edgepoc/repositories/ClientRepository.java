package com.connectedapps.edgepoc.repositories;

import com.connectedapps.edgepoc.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
