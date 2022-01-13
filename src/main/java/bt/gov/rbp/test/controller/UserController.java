package bt.gov.rbp.test.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.rbp.test.dto.UserRequest;
import bt.gov.rbp.test.entity.User;
import bt.gov.rbp.test.entity.Village;
import bt.gov.rbp.test.repository.UserRepository;
import bt.gov.rbp.test.repository.VillageRepository;

@RestController
@RequestMapping("/user")
@CrossOrigin(
   origins = {"http://localhost:4200"}
)
public class UserController {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private VillageRepository villageRepo;
	
	@GetMapping("/")
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public User getUser(@PathVariable("id") int id){
		return userRepo.findById(id).get();
	}
	
	@PostMapping("/")
	public User saveUser(@RequestBody UserRequest userRequest) {
		User user = new User();
//		user.setName(userRequest.getName());
//		user.setAge(userRequest.getAge());
//		user.setGender(userRequest.getGender());
		
		BeanUtils.copyProperties(userRequest, user);
		Village village = villageRepo.findById(userRequest.getVillageId()).get();
		user.setVillage(village);
		
		return userRepo.save(user);
	}
	
	@PutMapping("/")
	public User updateUser(@RequestBody UserRequest userRequest) {
		User user = new User();
		BeanUtils.copyProperties(userRequest, user);
		Village village = villageRepo.findById(userRequest.getVillageId()).get();
		user.setVillage(village);
		return userRepo.save(user);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") int id) {
		userRepo.deleteById(id);
	}
}