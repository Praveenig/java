class ElecrtonicsDevicesUtil{

public static void main(String s[]){

Grinder grd=new Grinder();
grd.id=5;
grd.price= 66;
grd.cepacity="5 littre";
grd.type="fiber";
grd.reducermenpower();

System.out.println(grd.id+"\n"+grd.price+"\n"+grd.cepacity+"\n"+grd.type);
}
}