package com.example.placementshedule;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PlacementsheduleController {
	@Autowired
	private PlacementSheduleService placementSheduleService;
	
	@GetMapping("/pms/getall")
	private List<EntityPlacementSchedule> getalldata() {
		return placementSheduleService.getalldata();
		
	}
	@GetMapping("/pms/getbyId/{id}")
	private EntityPlacementSchedule getdata(@PathVariable long id) {
		return placementSheduleService.getdata(id);
		
	}
	@PostMapping("/pms/addnew")
	private EntityPlacementSchedule savedata(@RequestBody EntityPlacementSchedule data) {
		return placementSheduleService.savedata(data);
		
	}
	@PutMapping("/pms/update/{id}")
	private ResponseEntity<EntityPlacementSchedule> updatedata(@RequestBody EntityPlacementSchedule data,@PathVariable long id) {
		return placementSheduleService.updatedata(data, id);
		
	}
	@DeleteMapping("/pms/deletebyId/{id}")
	private void deletedata(@PathVariable long id) {
		 placementSheduleService.deletedata(id);
		
	}
}
