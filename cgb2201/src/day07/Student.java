package day07;

public class Student {
        private String name;
        private int age;
        public String getName(){
            return this.name;
        }
        public void setName(String name){
            this.name = name;
        }
        public int getAge(){
            return this.age;
        }
        public void setAge(int age){
            this.age= age;
        }
        public void print(){
            if(this.age < 16){
                System.out.println("姓名:" + this.name + "年龄不符合规定");
            }
            else{
                System.out.println("姓名" + this.name + " 年龄: " + this.age);
            }
        }
    }

