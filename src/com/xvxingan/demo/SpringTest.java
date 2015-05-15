package com.xvxingan.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xvxingan.demo.entity.City;
import com.xvxingan.demo.entity.User;
 

 

public class SpringTest {
	private static Logger loger = Logger.getLogger(SpringTest.class);
	public static void main(String[] args) throws IOException {
//		ApplicationContext ctx =  new ClassPathXmlApplicationContext( "beans.xml" );
//	 	User user = (User) ctx.getBean("user");
//	 	City city = (City) ctx.getBean("city");
//		 System.out.println(user);
//		 System.out.println(city);
//		 city.works();
//		 loger.debug("hello");
		 
			loger.info("hello");
			loger.warn("warn");
			loger.error("error");
 	 
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

} 