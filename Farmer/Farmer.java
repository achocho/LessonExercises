package Farmer;
import java.util.*;
public class Farmer {
String name;
ArrayList<String> tools=new ArrayList<>();
Farmer(String name,ArrayList<String> tools)
{
	this.name=name;
	this.tools=tools;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public ArrayList<String> getTools() {
	return tools;
}
public void setTools(ArrayList<String> tools) {
	this.tools = tools;
}


}
