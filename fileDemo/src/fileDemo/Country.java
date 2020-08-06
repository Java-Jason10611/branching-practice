package fileDemo;

public class Country {
	private String name;

	private int population;

	public Country() {

	}

	public Country(String name, int population) {
		super();
		this.name = name;
		this.population = population;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setJersey(int Population) {
		this.population = Population;
	}

	@Override
	public String toString() {
		return " [name=" + name + ", Population=" + population + "] ";

	}

}