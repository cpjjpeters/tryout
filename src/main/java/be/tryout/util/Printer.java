package be.tryout.util;

import lombok.extern.slf4j.Slf4j;

/* carlpeters created on 07/10/2022 inside the package - be.tryout.util */
@Slf4j
public class Printer<T> {

    T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        log.debug(thingToPrint.toString());
    }

}
