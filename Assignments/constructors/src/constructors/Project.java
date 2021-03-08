package constructors;

public class Project {
	
		private int id;
		private String projectName;
		private String clientName;
		
	public Project(int id, String projectName, String clientName) {
		this.id = id;
		this.projectName = projectName;
		this.clientName = clientName;
		
	}
		
	@Override
	public String toString() {
		return "Project [ID = " + id + ", Project Name = " + projectName + ", Client Name = " + clientName + "]";
	}
}