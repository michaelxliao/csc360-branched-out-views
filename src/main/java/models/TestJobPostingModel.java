package models;

import java.util.ArrayList;

public class TestJobPostingModel
{
	public int id;
	public String title;
	public String type;
	public String desc;
	public String company;
	public String location;
	public String site;
	public int numApplicants;
	public String datePosted;

	public ArrayList<String> skillsRequired;

	public TestJobPostingModel(int id, String title, String type, String desc, String company, String location, String site,
			int numApplicants, String datePosted, String... skills)
	{
		this.id = id;
		this.title = title;
		this.type = type;
		this.desc = desc;
		this.company = company;
		this.location = location;
		this.site = site;
		this.numApplicants = numApplicants;
		this.datePosted = datePosted;

		skillsRequired = new ArrayList<>();
		for (String s : skills)
		{
			skillsRequired.add(s);
		}
		
	}
	
	public int getID() {
		return this.id;
	}
}
