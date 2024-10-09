package Map.HashMap.StudentManage;


import Map.HashMap.StudentManage.StudentInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentController {
    //定义一个Map, 键值对键用来存学号，Student对象用来存学生信息
    Map<Integer, StudentInfo> map = null;//初始化空数组

    public StudentController(){//构造方法
        map = new HashMap<>();//向下转型
    }

    //添加一个学生对象
    public boolean add(StudentInfo studentInfo){
        Integer id = studentInfo.getId(); //获取整型学号
        if(map.containsKey(id)){ //如果键已经存在
            return false;
        }
        else{
            return true;
        }
    }

    //删除一个指定key学生对象并返回对象值
    public StudentInfo delete(Integer id){
        return map.remove(id);
    }

    //另外一种方法
    public StudentInfo delete(StudentInfo studentInfo){
        return map.remove(studentInfo.getId());
    }


    //修改学生信息，如果修改id,推荐使用
    public void update(Integer id, StudentInfo studentInfo){
        map.remove(id);//首先删除原有键
        map.put(studentInfo.getId(), studentInfo);//然后把参数插入到指定id
    }

    public void update(StudentInfo studentInfo){
        map.put(studentInfo.getId(), studentInfo);
    }

    public StudentInfo query(Integer id){ //查找一个学生ID
        if(map.containsKey(id)){
            return map.get(id);
        }
        else{
            return null;
        }
    }

    //得到所有修改保存的信息
    public List<StudentInfo> getAllModify(){
        List<StudentInfo> list = new ArrayList<>(); //用列表来存studentInfo对象，set集合来存键组

        Set<Integer> set = map.keySet();

        for(Integer i : set){
            list.add(map.get(i));
        }
        return list;
    }
}
