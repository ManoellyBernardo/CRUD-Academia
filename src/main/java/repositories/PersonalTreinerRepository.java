package repositories;

import domain.PersonalTreiner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalTreinerRepository extends JpaRepository<PersonalTreiner, Integer> {
}
