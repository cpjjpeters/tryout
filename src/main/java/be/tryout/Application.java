package be.tryout;

import be.tryout.util.Printer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/* carlpeters created on 12/09/2022 inside the package - PACKAGE_NAME */
@SpringBootApplication
public class Application
{
    public static void main(String[] args) {

        Printer<Integer> printer = new Printer<>(23) ; //not Springboot !!
        printer.print();
        SpringApplication.run(Application.class,args);

    }
}
