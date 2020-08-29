import java.io.*;

class Test {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        
        int s1=(a * a);
        int s2=(b * b);
        int c1=(a * a * a);
        int c2=(b * b * b);
        int min=0;
        int max=0;
        
        if(s1<s2 && s1<c1&& s1<c2)
            min=s1;
        if(s2<s1 && s2<c1 && s2<c2)
            min=s2;
        if(c1<s1 && c1<s2 && c1<c2)
            min=c1;
        if(c2<s1 && c2<c1 && c2<s2)
            min=c2;
        
        if(s1>s2 && s1>c1&& s1>c2)
            max=s1;
        if(s2>s1 && s2>c1 && s2>c2)
            max=s2;
        if(c1>s1 && c1>s2 && c1>c2)
            max=c1;
        if(c2>s1 && c2>c1 && c2>s2)
            max=c2;

        int avg=(min+max)/2;
        
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(avg+" ");
                avg++;
            }
            System.out.println();
        }
        
    }
}