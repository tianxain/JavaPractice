package disanzhang;

public class Student {
private double score;
private String name;
public void setScore(double score)
{
	this.score=score;
}
public  double getScore()
{
	return score;
}
public void setName(String name)
{
	this.name=name;
} 
public String getName()
{
	return name;
}
public Student() {
	
}
public Student(double score,String name) {
	this.score=score;
	this.name=name;
}
}
