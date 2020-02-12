package com.hj.spring;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("!prod & test")
public class TestBookRepostory implements BookRepository{

}
