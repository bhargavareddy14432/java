package com.example.placementshedule;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;

@Service
public class PlacementSheduleServiceImpl implements PlacementSheduleService {
	
	@Autowired
	private PlacementSheduleRepo placementshedulerepo;


	@Override
	public EntityPlacementSchedule savedata(EntityPlacementSchedule data) {
		return placementshedulerepo.save(data);
	}

	@Override
	public ResponseEntity<EntityPlacementSchedule> updatedata(EntityPlacementSchedule updateData,long id) {
//		
//		
//		}
//		
//		return placementSheduleRepo.save(existdata);
		Optional<EntityPlacementSchedule> existdata = placementshedulerepo.findById(id);
		if(existdata.isPresent()) {
			existdata.get().setDate(updateData.getDate());
			existdata.get().setQualification(updateData.getQualification());
			existdata.get().setYear(updateData.getYear());
			return new ResponseEntity<>(placementshedulerepo.save(existdata.get()),HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@Override
	public void deletedata(long id) {
		placementshedulerepo.deleteById(id);
	}

	@Override
	public List<EntityPlacementSchedule> getalldata() {
		return placementshedulerepo.findAll() ;
	}

	@Override
	public EntityPlacementSchedule getdata(long id) {
		return placementshedulerepo.findById(id).orElse(null);
	}

}
