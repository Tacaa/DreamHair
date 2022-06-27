package sbnz.integracija.example.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbnz.integracija.example.dto.DiarySendDTO;
import sbnz.integracija.example.facts.Diary;
import sbnz.integracija.example.facts.RegisteredUser;
import sbnz.integracija.example.facts.User;
import sbnz.integracija.example.repositories.DiaryRepository;
import sbnz.integracija.example.repositories.UserRepository;

@Service
public class DiaryService {
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	DiaryRepository diaryRepository;
	
	public Diary getDiary(User user) {
		RegisteredUser ru = userRepository.findRegisteredUser(user.getId());
		Diary d = ru.getDiary();
		
		if(d == null) {
			d = new Diary();
			diaryRepository.save(d);
			ru.setDiary(d);
			userRepository.save(ru);
		}
		return ru.getDiary();
	}
	
	
	public Diary inputInDiary(User user, DiarySendDTO dto) {
		RegisteredUser ru = userRepository.findRegisteredUser(user.getId());
		Diary d = ru.getDiary();
		
		if(d == null) {
			d = new Diary();
			diaryRepository.save(d);
			ru.setDiary(d);
			userRepository.save(ru);
		}
		
		if(dto.getHairWash() != null) {
			if(!dto.getHairWash().equals("")) {
				List<String>list = new ArrayList<String>();
				for(int i = 0; i<d.getHairWash().size(); i++) {
					list.add(d.getHairWash().get(i));
				}
				list.add(dto.getHairWash());
				d.setHairWash(list);
			}
		}
		
		
		if(dto.getHairGrowth() != null) {
			if(!dto.getHairGrowth().equals("")) {
				List<String>list = new ArrayList<String>();
				for(int i = 0; i<d.getHairGrowth().size(); i++) {
					list.add(d.getHairGrowth().get(i));
				}
				list.add(dto.getHairGrowth());
				d.setHairGrowth(list);
			}
		}
		
		
		if(dto.getHairState() != null) {
			if(!dto.getHairState().equals("")) {
				List<String>list = new ArrayList<String>();
				for(int i = 0; i<d.getHairState().size(); i++) {
					list.add(d.getHairState().get(i));
				}
				list.add(dto.getHairState());
				d.setHairState(list);
			}
			
		}
		
		if(dto.getComment() != null) {
			if(!dto.getComment().equals("")) {
				List<String>list = new ArrayList<String>();
				for(int i = 0; i<d.getComments().size(); i++) {
					list.add(d.getComments().get(i));
				}
				list.add(dto.getComment());
				d.setComments(list);
			}
		}
		
		
		ru.setDiary(d);
		userRepository.save(ru);
		
		return ru.getDiary();
		
	}
}
