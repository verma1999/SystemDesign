package org.example.designPattern.builderDesign;

public class Director {
    StudentBuilder studentBuilder;
    Director( StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){
        if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineeringStudent();
        }
        if(studentBuilder instanceof MBAStudentBuilder){
            return createMbaStudent();
        }
        return null;
    }


    private Student createEngineeringStudent(){
        return studentBuilder.setRollNumber(1).setAge(25).setName("Aditya").setSubjects().build();
    }

    private Student createMbaStudent(){
        return studentBuilder.setRollNumber(10).setAge(24).setName("Sam").setFatherName("Ramji").setSubjects().build();
    }

}
