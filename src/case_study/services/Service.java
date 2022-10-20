package case_study.services;

import case_study.models.Person;

public interface Service {
    void displayList();

    void addNew();

    void edit();

    Person findPersonById();

}
