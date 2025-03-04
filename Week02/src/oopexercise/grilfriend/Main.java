package oopexercise.grilfriend;
/*定义数组存储4个女朋友的对象

​ 女朋友的属性：姓名、年龄、性别、爱好

​ 要求1：计算出四女朋友的平均年龄

​ 要求2：统计年龄比平均值低的女朋友有几个？并把她们的所有信息打印出来。

题
*/
public class Main {
    public static void main(String[] args) {
        GrilFriend[] grilFriends = new GrilFriend[4];

        grilFriends[0] = new GrilFriend("Alice", 18, 'F', "Reading");
        grilFriends[1] = new GrilFriend("Bob", 19, 'M', "Swimming");
        grilFriends[2] = new GrilFriend("Charlie", 20, 'F', "Painting");
        grilFriends[3] = new GrilFriend("David", 21, 'M', "Dancing");

        int totalAge = 0;
        for (GrilFriend grilFriend : grilFriends) {
            totalAge += grilFriend.getAge();
        }

        totalAge /= 4;

        for (GrilFriend grilFriend : grilFriends){
            if (grilFriend.getAge() < totalAge){
                grilFriend.showInfo();
            }
        }
    }
}
