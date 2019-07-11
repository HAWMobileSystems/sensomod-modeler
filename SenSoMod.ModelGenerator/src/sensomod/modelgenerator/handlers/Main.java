package sensomod.modelgenerator.handlers;

import java.io.File;

import sensomod.modelgenerator.helpers.ExtractInfosFromJavaClasses;

/**
 * Test class for testing purposes instead of using the GUI execution.
 * 
 * @author Julian Dörndorfer
 *
 */
public class Main {

	public static void main(String[] args) {
		File projectDir = new File("C:\\Users\\Julian Dörndorfer\\Desktop\\Test\\GeneratedCode\\Example");
		ExtractInfosFromJavaClasses extractInfosFromJavaClasses = new ExtractInfosFromJavaClasses();
        extractInfosFromJavaClasses.analyzeClassesAndGenerateModel(projectDir,new File("C:\\Users\\Julian Dörndorfer\\Workspace\\SenSoMod Dev\\SenSoMod.ModelGenerator\\generatedTestFiles"));

	}
}
