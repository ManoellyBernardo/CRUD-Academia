package services;

import domain.PersonalTreiner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.PersonalTreinerRepository;

@Service
public class PopulateService {

    @Autowired
    private PersonalTreinerRepository personalTreinerRepository;

    public void populate() {
        PersonalTreiner personal1 = new PersonalTreiner(null, "Raimunda Carla Andrea Ferreira", "189.228.885-04", "685416", 33, "81945612370", "raimunda-ferreira98@email.com.br", "712", "Rua Barros Cassal", "Boa Viagem", "Recife", 2500.00);
        PersonalTreiner personal2 = new PersonalTreiner(null, "Raimunda Carla Andrea Ferreira", "189.228.885-04", "685416", 33, "81945612370", "raimunda-ferreira98@email.com.br", "712", "Rua Barros Cassal", "Boa Viagem", "Recife", 2500.00);
        PersonalTreiner personal3 = new PersonalTreiner(null, "Raimunda Carla Andrea Ferreira", "189.228.885-04", "685416", 33, "81945612370", "raimunda-ferreira98@email.com.br", "712", "Rua Barros Cassal", "Boa Viagem", "Recife", 2500.00);

        this.personalTreinerRepository.save(personal1);
        this.personalTreinerRepository.save(personal1);
        this.personalTreinerRepository.save(personal1);
    }
}
