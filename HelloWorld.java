class HelloWorld {
    public static void main(String[] args) {
        int[] a={1,5,2,7,8,5,3};
        int temp;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                if(a[j]<a[i])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        // for(int x=0;x<a.length;x++){
        //      System.out.println(a[x]);
        // }
        
        int n=a.length-2;
       System.out.println("2nd largest element : "+a[n]);
         System.out.println("2nd smallest element : "+a[1]);
    }
}