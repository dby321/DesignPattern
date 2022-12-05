package com.binyu.designModel.$13proxy.$01staticProxy;

public class TeacherDaoProxy implements ITeacherDao{
    private ITeacherDao teacherDao;
    public TeacherDaoProxy(ITeacherDao teacherDao) {
        this.teacherDao=teacherDao;
    }

    @Override
    public void teach() {
        System.out.println("代理开始...");
        teacherDao.teach();
        System.out.println("代理结束...");
    }
}
