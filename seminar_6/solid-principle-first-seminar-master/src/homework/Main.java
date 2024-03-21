package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        ReportUser reportUser = new ReportUser(user);
        Persister persister = new Persister(user);
        reportUser.report();
        persister.save();
    }
}