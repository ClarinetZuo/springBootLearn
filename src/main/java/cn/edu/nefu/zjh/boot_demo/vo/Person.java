package cn.edu.nefu.zjh.boot_demo.vo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

/**
 * author:Zuo Junhao
 * NEFU
 */
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    String name;
    int age;
    Date birth;
    String[] hobbies;
    Map<String, Integer> score;

    public Person(){

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", score=" + score +
                '}';
    }

    public Person(String name, int age, Date birth, String[] hobbies, Map<String, Integer> map) {
        this.name = name;
        this.age = age;
        this.birth = birth;
        this.hobbies = hobbies;
        this.score = map;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public Map<String, Integer> getScore() {
        return score;
    }

    public void setScore(Map<String, Integer> map) {
        this.score = map;
    }
}
