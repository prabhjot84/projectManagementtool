package PPMT.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import PPMT.domain.Backlog;

@Repository
public interface BacklogRepository extends CrudRepository<Backlog, Long> {

    Backlog findByProjectIdentifier(String Identifier);
}