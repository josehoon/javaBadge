package com.familysearch;

public class EnumTypeSample {

    public enum FamilyMembers {
        FATHER, MOTHER, SON_1, SON_2, SON_3, DAUGHTER_1, SON_4
    }

    public static void main(String[] args) {
        EnumTypeSample enumFamily = new EnumTypeSample();
        enumFamily.tellMeTheFamily(FamilyMembers.FATHER);
        enumFamily.tellMeTheFamily(FamilyMembers.MOTHER);
        enumFamily.tellMeTheFamily(FamilyMembers.SON_1);
        enumFamily.tellMeTheFamily(FamilyMembers.SON_2);
        enumFamily.tellMeTheFamily(FamilyMembers.SON_3);
        enumFamily.tellMeTheFamily(FamilyMembers.DAUGHTER_1);
        enumFamily.tellMeTheFamily(FamilyMembers.SON_4);
    }

    public void tellMeTheFamily(FamilyMembers familyMember) {
        switch(familyMember) {
            case FATHER:
                System.out.println("You are the father.");
                break;
            case MOTHER:
                System.out.println("You are the mother.");
                break;
            case SON_1:
                System.out.println("You are Dane.");
                break;
            case SON_2:
                System.out.println("You are Eugene.");
                break;
            case SON_3:
                System.out.println("You are Young.");
                break;
            case DAUGHTER_1:
                System.out.println("You are Suzie.");
                break;
            case SON_4:
                System.out.println("You are Joseph.");
                break;
        }
    }

//    Day day;
//
//    public enum Day {
//        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
//    }
//
//    public EnumTypeSample(Day day){
//        this.day = day;
//    }
//
//    public static void main(String[] args) {
//        EnumTypeSample sunday = new EnumTypeSample(Day.SUNDAY);
//        sunday.tellMeTheDay();
//        EnumTypeSample monday = new EnumTypeSample(Day.MONDAY);
//        monday.tellMeTheDay();
//        EnumTypeSample tuesday = new EnumTypeSample(Day.TUESDAY);
//        tuesday.tellMeTheDay();
//        EnumTypeSample wednesday = new EnumTypeSample(Day.WEDNESDAY);
//        wednesday.tellMeTheDay();
//        EnumTypeSample thursday = new EnumTypeSample(Day.THURSDAY);
//        thursday.tellMeTheDay();
//        EnumTypeSample friday = new EnumTypeSample(Day.FRIDAY);
//        friday.tellMeTheDay();
//        EnumTypeSample saturday = new EnumTypeSample(Day.SATURDAY);
//        saturday.tellMeTheDay();
//    }
//
//    public void tellMeTheDay() {
//        switch(day) {
//            case SUNDAY:
//                System.out.println("It is Sunday!");
//                break;
//            case MONDAY:
//                System.out.println("It is Monday!");
//                break;
//            case TUESDAY:
//                System.out.println("It is Tuesday!");
//                break;
//            case WEDNESDAY:
//                System.out.println("It is Wednesday!");
//                break;
//            case THURSDAY:
//                System.out.println("It is Thursday!");
//                break;
//            case FRIDAY:
//                System.out.println("It is Friday!");
//                break;
//            case SATURDAY:
//                System.out.println("It is Saturday!");
//                break;
//        }
//    }
}
