package sensomod.javasourcecodegen.handlers;

//Just for local Tests, instead use Eclipse Menu
//put .sensomod File into Project Folder
//also create a folder with name "gen"
public class Main {

	public static void main(String[] args) {
		//XMLParser xmlparser = new XMLParser();
		XMLParser xmlparser = new XMLParser();
		String xmlFileName = "My.sensomod";
		try {
//			xmlparser.transform(xmlFileName);
			xmlparser.parseXML(xmlFileName, "gen");
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.toString());
		}

	}

}
