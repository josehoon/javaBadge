package com.familysearch.sharedComponent;

/**
 * Shows good and bad encapsulation examples
 */

public class EncapsulationSample {

    public static class GoodEncapsulationExample {
        private String studentName;
        private String studentGender;
        private int studentGrade = 6;

        public GoodEncapsulationExample(String name, String gender) {
            this.studentName = name;
            this.studentGender = gender;
            //this.studentGrade = 6;
        }

        // getters
        public String getStudentName() {
            return this.studentName;
        }

        public String getStudentGender() {
            return this.studentGender;
        }

        public int getStudentGrade() {
            return this.studentGrade;
        }

        // setters
        public void setStudentName(String name) {
            this.studentName = name;
        }

        public void setStudentGender(String gender) {
            this.studentGender = gender;
        }
    }

    public static class BadEncapsulationExample {
        public String studentName = "Eve Smith";
        public String studentGender = "F";
        public int studentGrade = 6;
    }

    public static void main(String[] args) {
        // good encapsulation
        GoodEncapsulationExample goodEncapsulationExample = new GoodEncapsulationExample("Joseph Jo", "F");
        goodEncapsulationExample.setStudentGender("M");
        goodEncapsulationExample.setStudentName("Young Jo");
        System.out.println(goodEncapsulationExample.studentName);
        System.out.println("Good Student Info: " + goodEncapsulationExample.getStudentName() + ", "
                + goodEncapsulationExample.getStudentGender() + ", "
                + goodEncapsulationExample.getStudentGrade());

        // bad encapsulation
        BadEncapsulationExample badEncapsulationExample = new BadEncapsulationExample();
        badEncapsulationExample.studentName = "Adam Smith";
        badEncapsulationExample.studentGender = "M";
        badEncapsulationExample.studentGrade = 12;
        System.out.println("Badd Student Info: " + badEncapsulationExample.studentName + ", "
                + badEncapsulationExample.studentGender + ", "
                + badEncapsulationExample.studentGrade);
    }
}
