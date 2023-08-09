package com.example.placementshedule;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlacementSheduleRepo extends JpaRepository<EntityPlacementSchedule, Long> {

}
