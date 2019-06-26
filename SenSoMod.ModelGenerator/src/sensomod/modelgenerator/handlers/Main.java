package sensomod.modelgenerator.handlers;

import java.io.File;

import sensomod.modelgenerator.helpers.ExtractInfosFromJavaClasses;

//Just for local Tests, instead use Eclipse Menu
//put .sensomod File into Project Folder
//also create a folder with name "gen"
public class Main {

	public static void main(String[] args) {
		File projectDir = new File("C:\\Users\\Julian Dörndorfer\\Desktop\\Test\\GeneratedCode\\Example");
		ExtractInfosFromJavaClasses extractInfosFromJavaClasses = new ExtractInfosFromJavaClasses();
        extractInfosFromJavaClasses.listClasses(projectDir);

	}
}
