package services;

import domain.PersonalTreiner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.PersonalTreinerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PersonalTreinerService {

    @Autowired
    private PersonalTreinerRepository personalTreinerRepository;

    public List<PersonalTreiner> listar(){
        return this.personalTreinerRepository.findAll();
    }

    public PersonalTreiner getPersonal(Integer idPersonalTrainer){
        Optional<PersonalTreiner> personalTreiner = this.personalTreinerRepository.findById(idPersonalTrainer);

        if(personalTreiner.isEmpty()) {
            throw new RuntimeException("O personal não foi encontrado!");
        } else {
            return personalTreiner.get();
        }
    }





}
