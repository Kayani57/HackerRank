package HackerRank;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

class Student {
    private String name;
    private String id;
    private String email;

    // Constructor
    Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public Student() {
        
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Additional method
    public void anotherMethod() {
        // Implementation of additional method goes here
    }

    // Override toString() method for better string representation
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
public class JavaReflection {

     public static void main(String[] args){
            Student s=new Student();
            @SuppressWarnings("rawtypes")
            Class student = s.getClass();
            Method[] methods = student.getDeclaredMethods();

            ArrayList<String> methodList = new ArrayList<>();
            for(int i=0;i<methods.length;i++){
                methodList.add(methods[i].getName());
            }
            Collections.sort(methodList);
            for(String name: methodList){
                System.out.println(name);
            }
        }
}