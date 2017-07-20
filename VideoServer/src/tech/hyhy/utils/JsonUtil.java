package tech.hyhy.utils;

import java.util.List;

import com.google.gson.Gson;

import tech.hyhy.bean.Student;
import tech.hyhy.dao.UserDao;

public class JsonUtil {

	public static void main(String[] args) {
		 Gson gson = new Gson();
		 String p1 = gson.toJson(1);
		 System.out.println(p1);
		// System.out.println(gson.toJson("abcd"));
		// System.out.println(new Long(10));
		// int[] values = { 1 };
		// System.out.println(gson.toJson(values));
		//
		// int one = gson.fromJson("1", int.class);
		//
		// BagOfPrimitives obj = new BagOfPrimitives();
		// System.out.println(gson.toJson(obj));

//		List<Student> sList = new UserDao().queryUser();
//		Gson gson = new Gson();
//		String sb = gson.toJson(sList, List.class);
//		System.out.println(sb);

	}
}

class BagOfPrimitives {
	private int value1 = 1;
	private String value2 = "abc";
	private transient int vlaue3 = 3;

	BagOfPrimitives() {
	}
}
