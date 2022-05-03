package study.baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class test1 {
	public static void main(String[] args) {
		String s[] = {
				"photo.jpg, Warsaw, 2013-09-05 14:08:15",
				"john.png, London, 2015-06-20 15:13:22",
				"myFriends.png, Warsaw, 2013-09-05 14:07:13",
				"Eiffel.jpg, Paris, 2015-07-23 08:03:02",
				"pisatower.jpg, Paris, 2015-07-22 23:59:59",
				"BOB.jpg, London, 2015-08-05 00:02:03",
				"notredame.png, Paris, 2015-09-01 12:00:00",
				"me.jpg, Warsaw, 2013-09-06 15:40:22",
				"a.png, Warsaw, 2016-02-13 13:33:50",
				"b.jpg, Warsaw, 2016-01-02 15:12:22",
				"c.jpg, Warsaw, 2016-01-02 14:34:30",
				"d.jpg, Warsaw, 2016-01-02 15:15:01",
				"e.png, Warsaw, 2016-01-02 09:49:09",
				"f.png, Warsaw, 2016-01-02 10:55:32",
				"g.jpg, Warsaw, 2016-02-29 22:13:11"
		};
		solution(s);
	}
	
	public static String solution(String[] s) {

		ArrayList<String[]> lists = new ArrayList();
		
		for(int i=0; i<s.length; i++) {
			lists.add(s[i].split(", "));
		}

		String[] photoName = new String[s.length];
		String[] extension = new String[s.length];
		String[] cityName = new String[s.length];
		String[] dateTime = new String[s.length];
		
		String ans = "";
		String[] answer = new String[s.length];
		
		// 도시 카운트를 위해 hs 생성
		HashSet<String> hs = new HashSet();
		for(int i=0; i<lists.size(); i++) {
			hs.add(lists.get(i)[1]);
		}
		
		Iterator<String> iter = hs.iterator();

		String str = "";
		int temp = 0;
		
		for(int i=0; i<lists.size(); i++) {
			photoName[i] = lists.get(i)[0].split("\\.")[0];
			extension[i] = lists.get(i)[0].split("\\.")[1];
			cityName[i] = lists.get(i)[1];
			dateTime[i] = lists.get(i)[2];
			
		}
		while(iter.hasNext()) {
			str=iter.next();
			for(int i=0; i<lists.size(); i++) {
				if(cityName[i].equals(str)) {
					temp++;
					ans +=cityName[i]+String.format("%02d", temp)+"."+extension[i];
					answer[i] = ans;
				}
				ans="";
			}
			temp=0;
		}
		
		Arrays.sort(dateTime);
		for(String a:dateTime) {
			System.out.println(a);
		}
		
		
////
//		
//		
////		if(info[1])

		
		return "";
	}

}
