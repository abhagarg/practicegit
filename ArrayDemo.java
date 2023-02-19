public class ArrayDemo
{ 
    public static void main(String args[])
    {
      int a[];
      int d[]=new int[5];
       
      int g[];
      int[] h,k,m;

      int arr[]={11,22,33,44,55};
      for(int i=0;i<arr.length;i++)
      {
       System.out.println(arr[i]);
      }
      System.out.println("------------");
     
       for(int x:arr)
      {
       System.out.println(x);
      } 
      
      System.out.println("------------");

       for(int i=0;i<args.length;i++)
      {
       System.out.println(args[i]);
      }

      System.out.println("------------");

    }
}