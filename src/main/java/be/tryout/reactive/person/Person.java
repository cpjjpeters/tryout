package be.tryout.reactive.person;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/* carlpeters created on 07/10/2022 inside the package - be.tryout.reactive.person */
@Slf4j
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    Integer id;
    String firstName;
    String lastName;
}
