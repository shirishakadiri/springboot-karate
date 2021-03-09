package com.example.springbootkarate;

import com.intuit.karate.junit5.Karate;

public class APITest {

    //can specify feature file path in run() options
    @Karate.Test
    Karate runAll(){
        return Karate.run().relativeTo(getClass());
    }
}

