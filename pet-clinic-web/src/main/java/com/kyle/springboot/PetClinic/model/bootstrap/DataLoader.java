package com.kyle.springboot.PetClinic.model.bootstrap;

import com.kyle.springboot.PetClinic.model.Owner;
import com.kyle.springboot.PetClinic.model.Vet;
import com.kyle.springboot.PetClinic.services.OwnerService;
import com.kyle.springboot.PetClinic.services.VetService;
import com.kyle.springboot.PetClinic.services.map.OwnerServiceMap;
import com.kyle.springboot.PetClinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {


    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();

    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Jojo");
        owner1.setLastName("Johnson");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Tom");
        owner2.setLastName("Thingville");

        ownerService.save(owner2);

        System.out.println("Loaded Owners");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Mark");
        vet1.setLastName("Morning");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Marty");
        vet2.setLastName("Smith");

        vetService.save(vet2);

        System.out.println("Vets Loaded");



    }
}
