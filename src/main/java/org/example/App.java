package org.example;

import org.example.model.Principal;
import org.example.model.School;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().
                addAnnotatedClass(Principal.class).
                addAnnotatedClass(School.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

//            2. Get any principal and then get his school
//            Principal principal = session.get(Principal.class,1);
//            School school = principal.getSchool();
//            System.out.println(principal.getName()+"\n"+school.getSchool_number());

//            3. Get any school and then get its principal.
//            School school1 = session.get(School.class,4);
//            System.out.println(school1.getPrincipal().getName());

//            4. Create a new principal and a new school and link these entities
//            Principal newPrincipal = new Principal("new principal",55);
//            School newSchool = new School(1337);
//            newPrincipal.setSchool(newSchool);
//            session.save(newPrincipal);

//            5. Change the principal of an existing school
//            School school2 = session.get(School.class,3);
//            Principal newPrincipal2 = new Principal("new principal 2",47);
//            school2.setPrincipal(newPrincipal2);
//            session.save(newPrincipal2);

//            6. Try adding a second school for the existing principal and investigate the error that occurs.
//            Principal principal = session.get(Principal.class,4);
//            School newSchool = new School(228);
//            principal.setSchool(newSchool);
//            Output: ERROR: ERROR: A duplicate key value violates the uniqueness constraint "school_principal_id_key"
//                    Details: The key "(principal_id)=(4)" already exists.

            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }

    }
}
