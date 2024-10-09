package Map.HashMap;
//任务二：
//任务描述
//使用HashMap存放国家名称信息并打印，创建Main类，在其main方法中一个HashMap对象ht，
// 将数个国家的信息加入其中，加入国家信息时，以国家英文缩写(字符串类型)为key，
// 国家中文名称(字符串类型)为value
//资料：
//CA-加拿大(CANADA)
//CF-中非(CENTRAL AFRICA)
//CG-刚果(CONGO)
//CH-瑞士(SWITZERLAND)
//CL-智利(CHILE)
//CM-喀麦隆(CAMEROON)
//CN-中国(CHINA)
//CO-哥伦比亚(COLOMBIA)
//CR-哥斯达黎加(COSTA RICA)
//CS-捷克(CZECH REPUBIC)
//CU-古巴(CUBA)
//CY-塞浦路斯(CYPRUS)
//CN-中国(CHINA)
//D字头
//DE-德 国(GERMANY)
//DK-丹麦(DENMARK)
//DO-多米尼加共和国(DOMINICAN REPUBLIC)
//DZ-阿尔及利亚(ALGERIA)
//任务要求
//1.查询CA国家信息，如果存在并打印其信息，不存在则提示“无此国家”。
//2.显示集合中一共有多少个国家；
//3.输出所有国家简称
//4.输出所有国家值

import java.util.HashMap;
import java.util.Map;

public class CountryMap {
    public static void main(String[] args) {
        Map<String, String> ht = new HashMap<>();

        ht.put("CA", "加拿大");
        ht.put("CF", "中非");
        ht.put("CN", "中国");
        ht.forEach((k,v)->{System.out.println(k+"-"+v);});
//		System.out.println(ht.get("BB"));
        if (ht.get("CA").equals("加拿大")) {
            System.out.println(ht.get("CA"));
        }
        System.out.println(ht.size());
        ht.keySet().forEach(System.out::println);
        ht.values().forEach(System.out::println);
    }
}