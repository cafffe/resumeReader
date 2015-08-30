package com.kmgh.fileutil;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Branch;

public class FileUtils {
	public void createFile(String path){
		File file=new File(path);
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public List<String> readFile(File file) throws IOException{
		List<String> list=new ArrayList<>();
		BufferedReader br=null;
		if(!file.exists()){
			return null;
		}
		try {
			br=new BufferedReader(new FileReader(file));
			String lineString;
			while((lineString=br.readLine())!=null){
				if(!list.contains(lineString)){
					list.add(lineString);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			br.close();
		}
		return list;
	}
	
	public boolean writeFile(List<String> list,File file){
		if(!file.exists()){
			return false;
		}
		return false;
	}
}
