import java.util.*;
class Box
{
	float width,height,depth;
	Box(float width,float height,float depth)
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	void calvolume()
	{
		System.out.println("Volume of box is "+(width*height*depth));
	}

}
class BoxWeight extends Box
{
	float boxweight;
	BoxWeight(float width,float height,float depth)
	{
		super(width,height,depth);
	}
	void calboxweight()
	{
			boxweight=(width*height*depth)/5000.0f;

	}


}
class Shipment extends BoxWeight
{
	float cost;
	Shipment(float width,float height,float depth)
	{
		super(width,height,depth);
	}
	void calcost()
	{
		cost=(boxweight*1000*100);
		System.out.println("Box weight is "+boxweight);
		System.out.println("Cost is "+cost+" Rs.");
	}
}
class seven
{
	public static void main(String arg[])
	{
			Scanner s=new Scanner(System.in);
			Shipment s1;
			while(true)
			{
				System.out.println("Enter width");
				float width=s.nextFloat();
				System.out.println("Enter height");
				float height=s.nextFloat();
				System.out.println("Enter depath");
				float depth=s.nextFloat();
				s1=new Shipment(width,height,depth);
				s1.calboxweight();
				if (s1.boxweight<=0.5f)
					break;
				else
					System.out.println("Box weight is more than 500 grams");
			}

			s1.calvolume();

			s1.calcost();

	}
}