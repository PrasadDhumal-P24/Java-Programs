import java.util.GregorianCalendar;
class GC{
    public static void main(String[] args){

        GregorianCalendar g = new GregorianCalendar();

        System.out.println(g.get(GregorianCalendar.DATE));
        System.out.println(g.get(GregorianCalendar.MONTH)+1);
    }
}