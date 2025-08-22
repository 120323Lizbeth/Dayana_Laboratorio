package Dayana_20240394.Dayana_20240394.Repository;

import Dayana_20240394.Dayana_20240394.Entity.LibrosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrosRepository extends JpaRepository<LibrosEntity, Long> {
}
