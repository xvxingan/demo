package com.xvxingan.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;

  

 

public class SpringTest {
	private static Logger loger = Logger.getLogger(SpringTest.class);
	public static void main(String[] args) throws IOException {
//		ApplicationContext ctx =  new ClassPathXmlApplicationContext( "beans.xml" );
//	 	User user = (User) ctx.getBean("user");
//	 	City city = (City) ctx.getBean("city");
//		 System.out.println(user);
//		 System.out.println(city);
//		 city.works();
//		 UserDao userDao = (UserDao) ctx.getBean("userDao");
//		 userDao.addUser(user);
//		JdbcTemplate jdbc;
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 Date dt1,dt2;
		try {
			dt1 = format.parse("2015-07-04 13:18:16");
			dt2 = format.parse("2015-07-05 12:13:10");
			System.out.println(dt1.toLocaleString());
			System.out.println(dt2.toLocaleString());
			Calendar c1 = Calendar.getInstance();
			c1.setTime(dt1);
			Calendar c2 =Calendar.getInstance();
			c2.setTime(dt2);
			 long time = dt2.getTime()-dt1.getTime();
			long s= time/1000;
			long m= time/1000/60;
			long h= time/1000/60/60;
			long d= time/1000/60/60/24;
			long M= time/1000/60/60/24/30;
			System.out.println(M+"-"+d+" "+d+":"+m+":"+s);
			ParsePosition pos;
//			System.out.println(c.get(Calendar.YEAR));
//			System.out.println(c.get(Calendar.MONTH+1));
//			System.out.println(c.get(Calendar.DAY_OF_MONTH));
//			System.out.println(c.get(Calendar.HOUR_OF_DAY));
//			System.out.println(c.get(Calendar.MINUTE));
//			System.out.println(c.get(Calendar.SECOND));
 		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		 loger.debug("hello");
		 
//			loger.info("hello");
//			loger.warn("warn");
//			loger.error("error");
 	 
 	}
	public static void copy(File src,File dest) throws IOException{
		if(!dest.exists())dest.mkdirs();
		for(File file : src.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				 if(name.contains(".db"))
				return false;
				 return true;
			}
		})){
			if(file.isFile()){
				System.out.println(file.getName());
				File tofile = new File(dest,file.getName());
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(tofile));
				byte[] buff = new byte[1024];
				while(bis.read(buff)!=-1){
					bos.write(buff);
				}
				bos.flush();
				bos.close();
				bis.close();
			}else{
				copy(file,dest);
			}
		}
	}
	
	public void test(){
		
	}
} 