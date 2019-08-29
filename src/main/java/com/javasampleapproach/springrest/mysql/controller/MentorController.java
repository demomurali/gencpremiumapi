
package com.javasampleapproach.springrest.mysql.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import
org.springframework.web.bind.annotation.CrossOrigin;
import
org.springframework.web.bind.annotation.GetMapping;
import
org.springframework.web.bind.annotation.RequestMapping;
import
org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.springrest.mysql.model.Mentor;
import com.javasampleapproach.springrest.mysql.model.MentorSkill;
import com.javasampleapproach.springrest.mysql.repo.MentorRepository;

@CrossOrigin(origins = "*")

@RestController

@RequestMapping("/api") public class MentorController {

	@Autowired MentorRepository mentorRepository;
	//@Autowired MentorCalendarRepository mentorCalendarRepository;

	
	@GetMapping(value="/mentor/getAllMentors",headers="Accept=application/json")
	public List<Mentor> findAllTechnologies() {

		Mentor mentor=new Mentor("ramesh","url","pass",(long) 123,"sdfs","df");
		
		MentorSkill mentorskill =new MentorSkill((double)34, 14, 50, "spring",
				"java", "toc", "", "");
		
		Set<MentorSkill> mentorSkills=new HashSet<MentorSkill>();
		mentorSkills.add(mentorskill);
		mentor.setMentorskills(mentorSkills);
		
		
		Set<Mentor> mentors=new HashSet<Mentor>();
		mentors.add(mentor);
		mentorskill.setMentors(mentors);
		mentorRepository.save(mentor);
		
		
		
		List<Mentor> listmentors=(List)mentorRepository.findAll();
		
		return listmentors;		
		
		

	}
	
	
	/*
	 * @GetMapping(
	 * "/mentor/getDetails/{skill_id}/{start_date}/{end_date}/{start_time}/{end_time}")
	 * Page<MentorSkill> getBySkillIdDateRange(@PathVariable("skill_id") Long
	 * skill_id,@PathVariable("start_date") String
	 * start_date,@PathVariable("end_date") String
	 * end_date,@PathVariable("start_time") String
	 * start_time,@PathVariable("end_time") String end_time,Pageable pageable) {
	 * Page<MentorSkill>
	 * results=mentorSkillRepository.findBySkillIdDateRange(skill_id, start_date,
	 * end_date, start_time, end_time,pageable ); return results;
	 * 
	 * }
	 * 
	 * @GetMapping("/mentor/getDetailsByMentorId/{mentor_id}") Page<MentorSkill>
	 * getByMentorId(@PathVariable("mentor_id") Long mentor_id,Pageable pageable) {
	 * Page<MentorSkill>
	 * results=mentorSkillRepository.findByMentorId(mentor_id,pageable); return
	 * results;
	 * 
	 * }
	 * 
	 * @GetMapping("/mentor/getDetailsByMentorIdSkillId/{mentor_id}/{skill_id}")
	 * MentorSkill getByMentorIdSkillId(@PathVariable("mentor_id") Long
	 * mentor_id, @PathVariable("skill_id") Long skill_id) { MentorSkill
	 * ms=mentorSkillRepository.findByMentorIdSkillId(mentor_id, skill_id); return
	 * ms;
	 * 
	 * }
	 */
	
	/*
	 * @GetMapping(
	 * "/mentor/getMentorCalendarByMentorId/{mentor_id}/{start_date}/{end_date}")
	 * List<MentorCalendar> getMentorCalendarByMentorId(@PathVariable("mentor_id")
	 * Long mentor_id, @PathVariable("start_date") String
	 * start_date, @PathVariable("end_date") String end_date) { List<MentorCalendar>
	 * mc=mentorCalendarRepository.findMentorCalendarByMentorId(mentor_id,
	 * start_date, end_date); return mc;
	 * 
	 * }
	 * 
	 * @GetMapping(
	 * "/mentor/getCalendarEntry/{mentor_id},{start_date},{end_date},{start_time},{end_time}")
	 * List<MentorCalendar> getCalendarEntry(@PathVariable("mentor_id") Long
	 * mentor_id, @PathVariable("start_date") String
	 * start_date, @PathVariable("end_date") String
	 * end_date, @PathVariable("start_time") String
	 * start_time, @PathVariable("end_time") String end_time) { List<MentorCalendar>
	 * mc=mentorCalendarRepository.findCalendarEntry(mentor_id, start_date,
	 * end_date, start_time, end_time); return mc; }
	 */
	
	/*
	 * @GetMapping("/mentor/getMentorDetails/{name}/{start_time}/{end_time}")
	 * List<Object[]> getMentorDetails(@PathVariable("name") String
	 * name, @PathVariable("start_time") String
	 * start_time, @PathVariable("end_time") String end_time) { List<Object[]>
	 * obj=mentorCalendarRepository.findMentorDetails(name,start_time,end_time);
	 * return null; }
	 */
}