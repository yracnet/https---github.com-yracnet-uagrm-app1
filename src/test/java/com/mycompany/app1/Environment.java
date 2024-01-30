package com.mycompany.app1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.jupiter.api.BeforeAll;


public class Environment {
    
    public static EntityManager em;
     
    @BeforeAll
    public static void setUpClass() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("app-store-test");
        em = emf.createEntityManager();
    }
    
}
