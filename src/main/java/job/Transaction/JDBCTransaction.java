package job.Transaction;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class JDBCTransaction {

    public static void main(String[] args) {

    }
    private static class student{

        String name;
        String password;

        public student(String name,String password){
            this.name= name;
            this.password = password;
        }
    }
}
