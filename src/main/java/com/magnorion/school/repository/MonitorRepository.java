package com.magnorion.school.repository;

import com.magnorion.school.models.domain.Monitor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonitorRepository extends CrudRepository<Monitor, Long> {
}
