package com.sada.Javaspringbootlambok.model;

import lombok.Data;

public class EntityWithOutLombok {
    @Data(staticConstructor="of")
    public class Company {
        private final Person founder;
        private String name;
        private List<Person> employees;
    }
}
