package demojparelacions.controladors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demojparelacions.entitats.Course;
import demojparelacions.entitats.Student;
import demojparelacions.repositoris.CourseRepositori;
import demojparelacions.repositoris.StudentRepositori;


@RestController
@RequestMapping("api")
public class ManyController {

	@Autowired
	CourseRepositori courseRep;
	
	@Autowired
	StudentRepositori studRep;
	
	@GetMapping("course")
	public Iterable<Course> getCourse() {
		return courseRep.findAll();
	}
	
	@GetMapping("course/{id}")
	public Course getCourse(@PathVariable long id) {
		Course course = courseRep.findById(id).get();
		return course;
	}
	
	@GetMapping("student")
	public Iterable<Student> getCourseMat() {
		return studRep.findAll();
	}
	
	@GetMapping("coursemat/{id}")
	public Student getStudent(@PathVariable long id) {
		Student student = studRep.findById(id).get();
		return student;
	}
	
	@DeleteMapping("course/delete/{id}")
	public void deleteCourse (@PathVariable long id) {
		courseRep.deleteById(id);
	}
	
}
