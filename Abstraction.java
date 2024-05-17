abstract class Vagetables
{
int rate_of_v;
abstract void m();

}

 class Garlic extends Vagetables
{
int rate_of_v=34;
void m(){
System.out.println(rate_of_v);
}
}
class Tomato extends Vagetables{
int rate_of_v=38;
void m(){
System.out.println(rate_of_v);
}


public static void main(String[] args)
{
Garlic g=new Garlic();
g.m();
Tomato t=new Tomato();
t.m();
}

}
