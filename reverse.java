public class reverse{
public static void main(String[] args){
int rev;
int rem;
int a=12345;
int i;
for(i=0;i<=a;i++){
rem= a%10;
rev=rev+rem;
a=a/10;
}
System.out.println("REVERSE="+rev);
}
}
