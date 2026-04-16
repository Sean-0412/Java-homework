//Torbert, e-mail: smtorbert@fcps.edu
//version 4.16.2003

    public class Lab15
   {
       public static void main(String[] args)
      {
         Dancer weismuller = new Dancer1(2,1,1,0);
         Dancer fraser = new Dancer2(3,2,2,0);
         Dancer spitz = new Dancer3(4,3,3,0);
         Thread t1 = new Thread( weismuller );
         Thread t2 = new Thread( fraser );
         Thread t3 = new Thread( spitz );
         //Thread t4 = new Thread( phelps );
         t1.start();
         t2.start();
         t3.start();
         //t4.start();
      }
   }