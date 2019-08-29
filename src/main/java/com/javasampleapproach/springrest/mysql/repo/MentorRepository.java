
package com.javasampleapproach.springrest.mysql.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import
org.springframework.data.jpa.repository.Query;
import
org.springframework.data.repository.CrudRepository;
import
org.springframework.transaction.annotation.Transactional;

import com.javasampleapproach.springrest.mysql.model.Mentor;
import com.javasampleapproach.springrest.mysql.model.MentorSkill;

public interface MentorRepository extends CrudRepository<Mentor,Long> {

	/*
	 * String findBySkillIdAndDateRange = "SELECT * FROM Mentor_Skill ms " +
	 * "WHERE ms.skill_id=?1 AND ms.mentor_id NOT IN (" +
	 * "  SELECT DISTINCT mc.mentor_id FROM Mentor_Calendar mc " +
	 * "    WHERE (mc.start_date BETWEEN ?2 AND ?3 AND mc.end_date BETWEEN ?2 AND ?3) AND "
	 * +
	 * "          (mc.start_time BETWEEN ?4 AND ?5 AND mc.end_time BETWEEN ?4 AND ?5) "
	 * + ")";
	 * 
	 * @Transactional
	 * 
	 * @Query(value = findBySkillIdAndDateRange, nativeQuery = true)
	 * Page<MentorSkill> findBySkillIdDateRange(Long skillId, String startDate,
	 * String endDate, String startTime, String endTime,Pageable pageable);
	 * 
	 * @Transactional
	 * 
	 * @Query(value =
	 * "SELECT ms FROM Mentor_Skill ms WHERE ms.mentor_id=?1",nativeQuery=true)
	 * Page<MentorSkill> findByMentorId(Long mentor_id,Pageable pageable);
	 * 
	 * @Transactional
	 * 
	 * @Query(value
	 * ="SELECT ms FROM MentorSkills ms WHERE ms.mentorId=?1 AND ms.skillId=?2"
	 * ,nativeQuery=true) MentorSkill findByMentorIdSkillId(Long mentorId, Long
	 * skillId);
	 */	 
}
