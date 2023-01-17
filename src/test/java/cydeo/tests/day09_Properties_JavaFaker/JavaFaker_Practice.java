package cydeo.tests.day09_Properties_JavaFaker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFaker_Practice {
    @Test
    public void  test1(){
        // Creating object to reach methods
       // Faker faker= new Faker(new Locale("tr"));
        Faker faker= new Faker();
        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());
        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        String randomNumber= faker.numerify("#-###-###-####");
        System.out.println("randomNumber = " + randomNumber);
        System.out.println("faker.numerify(\"0256-###-####\") = " + faker.numerify("0256-###-####"));
        //letify() can create random letter combination you need for your task
        System.out.println("faker.letterify(\"????-????\") = " + faker.letterify("????-????"));
        //bothify() is alfanumeric you put # for digits and ? for letters
        System.out.println("faker.bothify(\"###?-???#-####\") = " + faker.bothify("###?-???#-####"));
        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());
        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());

    }
}
