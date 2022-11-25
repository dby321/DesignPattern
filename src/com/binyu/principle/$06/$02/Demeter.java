package com.binyu.principle.$06.$02;
import java.util.ArrayList;
import java.util.List;

/**
 * 客户端
 */
public class Demeter {
    public static void main(String[] args) {
        CollegeManager collegeManager = new CollegeManager();
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllStudentCouncilMember(collegeManager);
    }
}

/**
 * 学校管理者
 */
class SchoolManager{

    /**
     * SchoolStudentCouncilMember是这个方法的返回值
     * 所以SchoolStudentCouncilMember是SchoolManager的直接朋友
     */
    public List<SchoolStudentCouncilMember> getAllSchoolStudentCouncilMember() {
        List<SchoolStudentCouncilMember> list;
        list = new ArrayList<>();
        for(int i=1;i<=10;i++){
            list.add(new SchoolStudentCouncilMember(i+""));
        }
        return list;
    }

    /**
     * 打印所有学生会成员
     */
    public void printAllStudentCouncilMember(CollegeManager collegeManager){
        System.out.println("---------校学生会----------");
        List<SchoolStudentCouncilMember> list1 = getAllSchoolStudentCouncilMember();
        for(SchoolStudentCouncilMember s : list1){
            System.out.println("校学生会："+s.getId());
        }

        //打印院学生会
        collegeManager.printCollegeStudentCouncilMembel();
    }
}

/**
 * 学院管理者
 */
class CollegeManager{
    public List<CollegeStudentCouncilMember> getAllCollegeStudentCouncilMember() {
        List<CollegeStudentCouncilMember> collegeStudentCouncilMemberList;
        collegeStudentCouncilMemberList = new ArrayList<>();
        for(int i=11;i<=20;i++){
            collegeStudentCouncilMemberList.add(new CollegeStudentCouncilMember(i+""));
        }
        return collegeStudentCouncilMemberList;
    }

    /**
     * 打印院学生会
     */
    public void printCollegeStudentCouncilMembel(){
        List<CollegeStudentCouncilMember> list =  getAllCollegeStudentCouncilMember();
        System.out.println("----------院学生会-----------");
        for(CollegeStudentCouncilMember c : list){
            System.out.println("院学生会："+c.getId());
        }
    }
}


/**
 * 校学生会成员
 */
class SchoolStudentCouncilMember{
    private String id;

    public SchoolStudentCouncilMember(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

/**
 * 院学生会成员
 */
class CollegeStudentCouncilMember{
    private String id;

    public CollegeStudentCouncilMember(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}