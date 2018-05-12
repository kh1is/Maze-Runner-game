package Gui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

import javax.xml.transform.Templates;

public class SaveAndLoad {

	public static ArrayList<String> names = new ArrayList<String>();
	public static ArrayList<Integer> scores = new ArrayList<Integer>();
	
	Formatter x;
	Formatter y;
	
	Scanner s;
	Scanner s1;
	
	
	
	public void setInfromation(String name, int score){
		File f1 = new File("names.txt");
		File f2 = new File("scores.txt");
		if(f1.exists() && f2.exists()){
			loadInformantion();
		}
		
		if(scores.size()>0){

			for(int i=0;i<names.size();i++){
				if(name.equalsIgnoreCase(names.get(i))){
					score += scores.get(i);
					scores.remove(i);
					names.remove(i);
					break;
				}
			}
			
			addAndSort(name, score);
		
		}
		else{
			scores.add(score);
			names.add(name);
		}
		
		saveInformantion();
		
	}
	
	private void saveInformantion(){
		
		try {
			x = new Formatter(new File("names.txt"));
			for(int i=0 ; i<names.size() ; i++){
				x.format("%s", names.get(i));
				x.format(",");
			}
			x.close();
			
			y = new Formatter(new File("scores.txt"));
			for(int i=0 ; i<scores.size() ; i++){
				y.format("%s", scores.get(i));
				y.format(",");
			}
			y.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void loadInformantion(){
		names.clear();
		scores.clear();
		
		String[] tmp = null;
		String[] tmp1 = null;
		
		try {
			s = new Scanner(new File("names.txt"));
			String op;
			op = s.nextLine();
			tmp = op.split(",");
			s.close();
			
			s1 = new Scanner(new File("scores.txt"));
			String op1;
			op1 = s1.nextLine();
			tmp1 = op1.split(",");
			s1.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<tmp.length;i++){
			names.add(tmp[i]);
			scores.add(Integer.parseInt(tmp1[i]));
		}
		
	}

	private void addAndSort(String name, int score){
		if(scores.size()>0){
			for(int i=0;i<scores.size();i++){
				if(score>scores.get(i)){
					scores.add(i, score);
					names.add(i, name);
					break;
				}
				if(i == scores.size()-1){
					scores.add(score);
					names.add(name);
					i++;
				}
			}
		}
		else{
			scores.add(score);
			names.add(name);
		}
	}
	
	public String getResults(){
		
		File f1 = new File("names.txt");
		File f2 = new File("scores.txt");
		if(f1.exists() && f2.exists()){
			loadInformantion();
		}
		
		StringBuilder result = new StringBuilder();
		result.append("name");
		result.append("          ");
		
		int z = result.length()+1;
		
		result.append("score");
		
		result.append("\n");
		int x=result.length();
		int y;
		
		for(int i=0;i<scores.size();i++){
			result.append(names.get(i));
			y=result.length()-1;
			x=x+z;
			for(int j=y;j<x;j++){
				result.append(" ");
			}
			result.append(scores.get(i));
			result.append("\n");
			x = result.length();
			
		}
		
		return result.toString();
	}
	
}
