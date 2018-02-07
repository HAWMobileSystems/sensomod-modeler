package sensomod.generated;

//Use IDE to generate Constructor, Getters, Setters and toString methods

public class Printer {

    private String id;
    private State state;

    public static enum State {

        normal, cartridgeempty, paperempty
    }

	public String getId() {
		return id;
	}

	public Printer(String id, State state) {
		super();
		this.id = id;
		this.state = state;
	}

	public void setId(String id) {
		this.id = id;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Printer [id=" + id + ", state=" + state + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Printer other = (Printer) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

	
    
    
}

