package Farmer;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of corps");
		int Count=scan.nextInt();
		ArrayList<String> NamesAndTypes=new ArrayList<>();
		System.out.println("Enter names and types");
		for(int i=0;i<=Count;i++) 
		{
			NamesAndTypes.add(scan.nextLine());
			
		}
		ArrayList<vegetables> vegs=new ArrayList<>();
		ArrayList<fruits> frs=new ArrayList<>();
		ArrayList<cactus> cacs=new ArrayList<>();
		ArrayList<String> tools=new ArrayList<>();
		String tool;
		System.out.println("Enter tools");
		while(true) 
		{
			tool=scan.nextLine();
			if(tool.equals("exit")) 
			{
				break;
				
			}
			tools.add(tool);
			
		}
		boolean Space=false;
		String type;
		String name;
		System.out.println("Enter farmer name");
		Farmer farmer=new Farmer(scan.nextLine(),tools);
		for(int i=0;i<NamesAndTypes.size();i++) 
		{
			Space=false;
			type="";
			name="";
			for(int j=0;j<NamesAndTypes.get(i).length();j++) 
			{
				if(Space) 
				{
					type+=NamesAndTypes.get(i).charAt(j);
				}else 
				{
					name+=NamesAndTypes.get(i).charAt(j);
				}
				if(NamesAndTypes.get(i).charAt(j)==' ') 
				{
					Space=true;
					
				}
				
			}
			if(type.equals("vegetable")) 
			{
				vegs.add(new vegetables(name,2,0,false,false));
				
			}else if(type.equals("fruit")) 
			{
				frs.add(new fruits(name,4,0,false,false));
				
			}
			else if(type.equals("cactus")) 
			{
				cacs.add(new cactus(name,3,0,false,false));
			}
			
	
			
		}
		boolean deadVegs=false;
		boolean deadFrs=false;
		boolean deadCacs=false;
		System.out.println("Enter days of work");
		int days=scan.nextInt();
		if(days<4) 
		{
			for(int i=0;i<vegs.size();i++) 
			{
				vegs.get(i).setDead(true);
				deadVegs=true;
			}
			
		}
		if(days<3) 
		{
			
			for(int i=0;i<cacs.size();i++) 
			{
				deadCacs=true;
				cacs.get(i).setDead(true);
				
			}
			
		}
		if(days<2) 
		{
		
			for(int i=0;i<frs.size();i++) 
			{
				deadFrs=true;
			   frs.get(i).setDead(true);
				
			}
			System.out.println("Everything is dead!!!");
			System.exit(0);
		}
		boolean dead=false;
		for(int i=0;i<farmer.tools.size();i++) 
		{
			if(!farmer.tools.get(i).equals("watering can")) 
			{
				dead=true;
				
				
			}else 
			{
				
				dead=false;
				break;
			}
			
		}
		for(int j=0;j<vegs.size();j++) 
		{
			deadVegs=dead;
			vegs.get(j).setDead(dead);
			
		}
	
		for(int j=0;j<frs.size();j++) 
		{
			deadFrs=dead;
		   frs.get(j).setDead(dead);
			
		}
		boolean hoe=false;
		boolean ladder=false;
		boolean gloves=false;
		boolean SVegs=false;
		boolean SFrs=false;
		boolean SCacs=false;
		for(int i=0;i<farmer.tools.size();i++) 
		{
			if(farmer.tools.get(i).equals("hoe")) 
			{
				hoe=true;
				break;
			}
			
		}
		for(int i=0;i<farmer.tools.size();i++) 
		{
			if(farmer.tools.get(i).equals("ladder")) 
			{
				ladder=true;
				break;
			}
			
		}
		for(int i=0;i<farmer.tools.size();i++) 
		{
			if(farmer.tools.get(i).equals("gloves")) 
			{
				gloves=true;
				break;
			}
			
		}
		for(int i=0;i<days;i++) 
		{
			if(!deadVegs&&i==3&&hoe) 
			{
				SVegs=true;
			   for(int j=0;j<vegs.size();j++) 
			   {
				   vegs.get(j).setSelected(true);
				   
			   }
					
			}
			if(!deadFrs&&i==4&&ladder) 
			{
				SFrs=true;
				  for(int j=0;j<frs.size();j++) 
				   {
					   frs.get(j).setSelected(true);
					   
				   }
				
			}
			if(!deadCacs&&i==3&&gloves) 
			{
				SCacs=true;
				 for(int j=0;j<cacs.size();j++) 
				   {
					   cacs.get(j).setSelected(true);
					   
				   }
				
			}
			
			
		}
		
if(deadVegs) 
{
	System.out.println("All vegetables are dead");
}
if(deadCacs) 
{
	System.out.println("All cactuses are dead");
}
if(deadFrs) 
{
	System.out.println("All fruits are dead");
}
if(SVegs) 
{
	System.out.println("All vegetables are selected");
}else 
{
	if(!deadVegs) {
System.out.println("None vegetables are selected");	
	}
}
if(SFrs) 
{
	System.out.println("All fruits are selected");
}else 
{
	if(!deadFrs) {
System.out.println("None fruits are selected");	
	}
}
if(SCacs) 
{
	System.out.println("All cactuses are selected");
}else 
{
	if(!deadCacs) {
System.out.println("None cactuses are selected");	
	}
	}
for(int i=0;i<vegs.size();i++) 
{
	System.out.println(vegs.get(i).getName());
}
for(int i=0;i<frs.size();i++) 
{
	System.out.println(frs.get(i).getName());
}
for(int i=0;i<cacs.size();i++) 
{
	System.out.println(cacs.get(i).getName());
}
	}

}
