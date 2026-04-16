   //Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 4.16.2003
	//updated 5.13.2009 mlbillington@fcps.edu

   public abstract class MazeEscaper extends Athlete
   {
      public MazeEscaper()
      {
         super();
      }

      public MazeEscaper(int x, int y, int dir, int beepers)
      {
         super(x, y, dir, beepers);
      }

      public abstract void walkDownCurrentSegment();
      public abstract void turnToTheNextSegment();
   }