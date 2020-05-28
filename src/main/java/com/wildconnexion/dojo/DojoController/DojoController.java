package com.wildconnexion.dojo.DojoController;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.wildconnexion.dojo.Dojo.Dojo;
import com.wildconnexion.dojo.DojoRepository.DojoRepository;

@RestController
@CrossOrigin
public class DojoController {
    private DojoRepository repository = new DojoRepository();

    @GetMapping("/dojos")
    public List<Dojo> getAll() {
        return repository.findAll();
    }
}