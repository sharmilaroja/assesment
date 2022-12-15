import java.util.*;
class Assessment1 //2 departments and 2 students each with 3 subject marks//
{
	public static void main(String... args)
{
		int arr[][][]= {
				{{35,45,55},{65,75,85}},
				{{75,88,95},{55,65,35}}
				};
			int sum=0;
    		for(int i=0;i<arr.length;i++)  
                {
		System.out.println("Department No. "+(i+1));
                for(int j=0;j<arr[i].length;j++)
                {
		System.out.println("Student No. "+(j+1));
		for (int k=0; k<arr[i][j].length;k++)
		{
                System.out.print(arr[i][j][k]+"\t"); 
		sum+=arr[i][j][k];
                
                }
System.out.println();
                }System.out.println(sum);
                }
}
}
                

		