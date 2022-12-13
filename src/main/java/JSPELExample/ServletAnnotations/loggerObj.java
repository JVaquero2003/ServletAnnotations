package JSPELExample.ServletAnnotations;

public class loggerObj {

	private Integer Id = 0;
	private String Name = "";

	public loggerObj(Integer id, String name) {
		Id = id;
		Name = name;
	}

	public loggerObj() {
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public static void debug(String nombre) {
		System.out.println(nombre);
	}

}
