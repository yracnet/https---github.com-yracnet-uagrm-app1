package com.mycompany.app1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class Environment {

    public static EntityManager em;
    public static EntityTransaction tx;

    @BeforeAll
    public static void setUpClass() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("app-store-test");
        em = emf.createEntityManager();
        tx = em.getTransaction();
    }

    @BeforeEach
    public void setUp() {
        System.out.println("BEGIN");
        tx.begin();
    }

    @AfterEach
    public void tearDown() {
        tx.commit();
        System.out.println("COMMIT");
    }

}
