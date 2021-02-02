package com.suftz.bean;



import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Description:
 *
 * @author zhangchengy
 * @version 1.0
 * @date 2021/1/22 14:02
 */
public class Student {
    private String[] courses;
    private List<String> list;
    private Set<String> set;
    private Map<String,String> map;

    private List<Course> courseLisst;

    public List<Course> getCourseLisst() {
        return courseLisst;
    }

    public void setCourseLisst(List<Course> courseLisst) {
        this.courseLisst = courseLisst;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Student{" +
                "courses=" + Arrays.toString(courses) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", courseLisst=" + courseLisst +
                '}';
    }
}
