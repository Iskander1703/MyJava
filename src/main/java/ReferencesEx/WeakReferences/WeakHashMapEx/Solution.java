package ReferencesEx.WeakReferences.WeakHashMapEx;

import java.util.WeakHashMap;

public class Solution {

    public static void main(String[] args) throws InterruptedException {


        //создаем объект для хранения дополнительной информации о пользователе
        WeakHashMap<User, StatisticInfo> userStatistics = new WeakHashMap<User, StatisticInfo>();

        //кладем информацию о пользователе в userStatistics
        User user= new User();
        userStatistics.put(user, new StatisticInfo());

        //получаем информацию о пользователе из userStatistics
        StatisticInfo statistics = userStatistics.get(user);

        //удаление любой информации о пользователе из userStatistics
        System.out.println(userStatistics.isEmpty());
        user =null;
        System.gc();
       Thread.sleep(1000);
        System.out.println(userStatistics.isEmpty());


    }
}
