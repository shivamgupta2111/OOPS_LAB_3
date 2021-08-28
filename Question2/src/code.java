public class code {

        public static void main(String args[]) {
            int a[];
            int sum=0;
            a=new int[10];
            for(int i=0;i<10;i++)
            {
                a[i]=Integer.parseInt(args[i]);
                a[i]=a[i]*a[i];
                sum=sum+a[i];
            }
            System.out.println(sum);




        }


}
