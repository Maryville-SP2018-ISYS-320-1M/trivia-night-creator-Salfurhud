package edu.maryville.isys320.TriviaNight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class QuestionsManager {
	public ArrayList<String> categories = new ArrayList<String>();
	public ArrayList<String> questions = new ArrayList<String>();;
	public ArrayList<String> answers = new ArrayList<String>();;
	
	public QuestionsManager(String categoryFolder) {
		File fldr = new File(categoryFolder);
		String[] files = fldr.list();
		
		//sort files by name
		Arrays.sort(files);
		
		Collections.addAll(categories,files);
		Collections.sort(categories);
				
		for (String fileName : categories) {
			File f = new File(categoryFolder + "/" + fileName);
			
			try {
				Scanner fs = new Scanner(f);
				int x = 0;
				while(fs.hasNextLine()) { // Assume Q, A, Blank Line triplets 
					x++;
					questions.add(fs.nextLine());
					answers.add(fs.nextLine());
					fs.nextLine();
				}
				fs.close();
				
				if(x != 10) {
					System.out.println("One of the categories has an incorrect number of questions");
					return;
				}

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				String message = e.getMessage();
				System.out.print(message);
			}
			
			
		}
	}
	
	public String[] getCategories() {
		return categories.toArray(new String[categories.size()]);
	}
	
	public String[] getQuestions() {
		return questions.toArray(new String[questions.size()]);
	}
	
	public String[] getAnswers() {
		return answers.toArray(new String[answers.size()]);
	}

}
