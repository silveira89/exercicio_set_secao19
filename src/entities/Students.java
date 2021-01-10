package entities;

public class Students {
	
	private Integer codeStudents;

	public Students(Integer codeStudents) {
		this.codeStudents = codeStudents;
	}

	public Integer getCodeStudents() {
		return codeStudents;
	}

	public void setCodeStudents(Integer codeStudents) {
		this.codeStudents = codeStudents;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codeStudents == null) ? 0 : codeStudents.hashCode());
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
		Students other = (Students) obj;
		if (codeStudents == null) {
			if (other.codeStudents != null)
				return false;
		} else if (!codeStudents.equals(other.codeStudents))
			return false;
		return true;
	}
	
	

}
