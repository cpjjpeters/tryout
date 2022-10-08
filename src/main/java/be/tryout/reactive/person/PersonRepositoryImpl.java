package be.tryout.reactive.person;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/* carlpeters created on 07/10/2022 inside the package - be.tryout.reactive.person */
public class PersonRepositoryImpl implements PersonRepository {

    Person michael = new Person(1,"Michael", "Weston");
    Person fiona = new Person(2,"Fiona", "Glenanne");
    Person sam = new Person(3,"Sam", "Axe");
    Person jesse = new Person(4,"Michael", "Porter");

    @Override
    public Mono<Person> getById(Integer id) {
        return Mono.just(michael);
    }

    @Override
    public Flux<Person> findAll() {

        return Flux.just(michael,fiona,sam,jesse);
    }
}
