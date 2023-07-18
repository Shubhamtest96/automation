
//sensitive data is hidden from users 
// declare varaible as private 
// use get & set to get and update

public class Encaps {
	private String name ;
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}

	public static void main(String[] args) {
		Encaps obj = new Encaps();
		obj.setName("jishu");
		System.out.println(obj.getName());
		// TODO Auto-generated method stub

	}

}


