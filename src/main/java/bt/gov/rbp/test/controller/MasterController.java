package bt.gov.rbp.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.rbp.test.entity.Dzongkhag;
import bt.gov.rbp.test.entity.Gewog;
import bt.gov.rbp.test.entity.Village;
import bt.gov.rbp.test.repository.DzongkhagRepository;
import bt.gov.rbp.test.repository.GewogRepository;
import bt.gov.rbp.test.repository.VillageRepository;

@RestController
@RequestMapping("/master")
@CrossOrigin(
   origins = {"http://localhost:4200"}
)
public class MasterController {

	@Autowired
	private DzongkhagRepository dzongkhagRepo;
	
	@Autowired
	private GewogRepository gewogRepo;
	
	@Autowired
	private VillageRepository villageRepo;
	
	@GetMapping("/dzongkhags")
	public List<Dzongkhag> getAllDzongkhags(){
		return dzongkhagRepo.findAll();
	}
	
	@GetMapping("/gewogs/{dzongkhagId}")
	public List<Gewog> getAllGewogs(@PathVariable("dzongkhagId") int dzongkhagId){
		return gewogRepo.getAllGewogByNativeQuery(dzongkhagId);
	}
	
	@GetMapping("/villages/{gewogId}")
	public List<Village> getAllVillages(@PathVariable("gewogId") int gewogId){
		return villageRepo.getAllVillageByNativeQuery(gewogId);
	}
}
