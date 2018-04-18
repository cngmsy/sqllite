package cn.hnshangyu.testgreendao.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Keep;

@Entity(generateConstructors = false)
public class Student {
    @Id
    private Long id;
    private String name;
    private int age;
    private String num;
    private String sex;
    private int grade;


    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", num=" + num + ", sex=" + sex +",grade=" +grade +
                '}';
    }

    public Student() {
    }


    @Keep
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public Student(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;

    }

    @Keep
    public Long getId() {
        return id;
    }

    @Keep
    public void setId(Long id) {
        this.id = id;
    }

    @Keep
    public String getName() {
        return name;
    }


    @Keep
    public void setName(String name) {
        this.name = name;
    }

    @Keep
    public int getAge() {
        return age;
    }

    @Keep
    public void setAge(int age) {
        this.age = age;
    }

    @Keep
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        return name.equals(student.name);

    }

    @Keep
    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

}