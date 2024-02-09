package com.program;

import net.datafaker.Faker;

public class Faku {

    public static void main(String[] args) {

        Faker faker=new Faker();

        System.out.println(faker.name().firstName());
        System.out.println(faker.name().lastName());
        System.out.println(faker.address().country());
        System.out.println(faker.phoneNumber().cellPhone());
        System.out.println(faker.animal().name());

        System.out.println(faker.letterify("??abcd"));
        System.out.println(faker.numerify("##abc#d"));
        
    }
}
