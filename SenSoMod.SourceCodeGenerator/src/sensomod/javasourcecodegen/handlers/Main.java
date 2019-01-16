package sensomod.javasourcecodegen.handlers;

//Just for local Tests, instead use Eclipse Menu
//put .sensomod File into Project Folder
//also create a folder with name "gen"
public class Main {

	public static void main(String[] args) {
		//XMLParser xmlparser = new XMLParser();
		SenSoMod2Java senSoMod2Java = new SenSoMod2Java();
		String xmlFileName = "My.sensomod";
		try {
			senSoMod2Java.transform(xmlFileName, "gen", true, true);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.toString());
		}

	}
//	public static void main(String[] args) {
//		CompilationUnit cu = new CompilationUnit();
//        cu.setPackageDeclaration("test");
//        ClassOrInterfaceDeclaration type = cu.addClass("MeineKlasse");
//        MethodDeclaration main = type.addMethod("main", Modifier.PUBLIC, Modifier.STATIC);
//        main.addAndGetParameter(String.class, "args").setVarArgs(true);
//        System.out.println(cu.toString());
//	}
}
