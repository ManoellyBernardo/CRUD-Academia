package grupodasfadinhas.academia.controllers;

import domain.PersonalTreiner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import services.PersonalTreinerService;

import java.util.List;

@RestController
public class PersonalTreinerController {

    @Autowired
    PersonalTreinerService perosonalTreinerService;

    @GetMapping("/personais")
    public List<PersonalTreiner> listar(){
        return this.perosonalTreinerService.listar();
    }

    @GetMapping("/personal/{idPersonal}")
    public PersonalTreiner getPersonal(@PathVariable Integer idPersonal){
        return this.perosonalTreinerService.getPersonal(idPersonal);
    }
}
