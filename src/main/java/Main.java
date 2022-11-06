import org.hibernate.Session;
import org.hibernate.Transaction;
import java.sql.*;

public class Main {
  public static void main(String[] args) {
    User user = new User();
    user.setName("Ivan");

    Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
    Transaction tx1 = session.beginTransaction();

    session.save(user);
    tx1.commit();
    session.close();
  }
}
