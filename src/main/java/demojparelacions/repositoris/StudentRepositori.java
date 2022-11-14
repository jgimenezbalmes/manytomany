package demojparelacions.repositoris;
import org.springframework.data.repository.CrudRepository;
import demojparelacions.entitats.Student;

public interface StudentRepositori extends CrudRepository<Student, Long> {

	
}