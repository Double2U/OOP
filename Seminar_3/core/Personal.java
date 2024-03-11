package core;


public abstract class Personal {
    protected String name;
    protected String surname; 
    protected String qualification;
    protected int age;
    protected int experience;

    public Personal(String name, String surname, String qualification, int age, int experience) {
        this.name = name;
        this.surname = surname;
        this.qualification = qualification;
        this.age = age;
        this.experience = experience;
    }

    public String getType(){
        return getClass().getSimpleName();
   }

   public String getName() {
       return name;
   }
   
   public String getSurname() {
       return surname;
   }

   public String getQualification() {
       return qualification;
   }

    public int getAge() {
        return age;
    }

    public int getExperience() {
        return experience;
    }

    public String toString(){

        return String.format("name = %s, surname = %s, qualification= %s, age = %s,  experience = %s",
                name, surname, qualification, age, experience);
    }

}
