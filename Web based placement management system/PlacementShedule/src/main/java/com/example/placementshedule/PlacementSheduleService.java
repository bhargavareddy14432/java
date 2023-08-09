package com.example.placementshedule;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface PlacementSheduleService {
	List<EntityPlacementSchedule> getalldata();
	EntityPlacementSchedule savedata(EntityPlacementSchedule data);
	ResponseEntity<EntityPlacementSchedule> updatedata(EntityPlacementSchedule data,long id);
	void deletedata(long id);
	EntityPlacementSchedule getdata(long id);

}
