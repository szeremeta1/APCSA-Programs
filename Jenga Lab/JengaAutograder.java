// Samuel J. Brannon, Ph.D.
// AP Computer Science A
// 20250114
// Autograder class for Jenga Lab

public class JengaAutograder {

   public static void main(String[] args) {
      Jenga j1 = new Jenga(3);
      Jenga j2 = new Jenga(6);

      // Testing constructor
      System.out.println("Testing constructor");
      System.out.println(j1.numLayers());
      // 3
      j1.print();
      /*
      
      X X X
      X X X
      X X X
      */

      System.out.println(j2.numLayers());
      // 6
      j2.print();
      /*
      
      X X X
      X X X
      X X X
      X X X
      X X X
      X X X
      */
      
      // Testing isNorthSouth()
      System.out.println("Testing north/south");
      System.out.println(j1.isNorthSouth(0));
      // false
      System.out.println(j1.isNorthSouth(3));
      // true
      System.out.println(j2.isNorthSouth(0));
      // true
      System.out.println(j2.isNorthSouth(3));
      // false
      
      // Testing topLayerFull()
      System.out.println("Testing top layer full");
      j2.print();
      // (top layer empty)
      System.out.println(j2.topLayerFull());
      // false
      j2.cheat(1);
      j2.print();
      // (top layer has block in middle)
      System.out.println(j2.topLayerFull());
      // false
      j2.cheat(0);
      j2.print();
      // (top layer has two block on left)
      System.out.println(j2.topLayerFull());
      // false
      j2.cheat(2);
      j2.print();
      // (top layer has three blocks)
      System.out.println(j2.topLayerFull());
      // true
      
      // Testing addLayer()
      System.out.println("Testing add layer");
      j2.addLayer();
      j2.print();
      // (top layer empty; 7 full layers)
      
      // Testing moveBlock()
      System.out.println("Testing moving blocks");
      j1.moveBlock(3, 1, 1);
      j1.print();
      /*
        X
      X X X
      X X X
      X   X
      */
      j1.moveBlock(2, 0, 1);
      // Already a block at column 1 of topmost layer
      j1.moveBlock(2, 0, 2);
      j1.print();
      /*
        X X
      X X X
        X X
      X   X
      */
      j1.moveBlock(0, 1, 2);
      // Cannot remove block from topmost layer
      j1.moveBlock(2, 0, 0);
      // No block at (2, 0)
      j1.moveBlock(1, 1, 0);
      j1.print();
      /*
      X X X
      X   X
        X X
      X   X
      */
      j1.moveBlock(2, 2, 1);
      j1.print();
      /*
        X
      X X X
      X   X
        X
      X   X
      */
      
      // Testing isStable()
      System.out.println("Testing stability");
      Jenga j3 = new Jenga(2);
      j3.moveBlock(2, 1, 1);
      j3.print();
      /*
        X
      X X X
      X   X
      */
      System.out.println(j3.isStable());
      // true
      j3.moveBlock(2, 2, 2);
      j3.print();
      /*
        X X
      X X X
      X
      */
      System.out.println(j3.isStable());
      // false
      j3 = new Jenga(3);
      j3.moveBlock(2, 0, 0);
      j3.print();
      /*
      X
      X X X
        X X
      X X X
      */
      System.out.println(j3.isStable());
      // true
      j3.moveBlock(2, 1, 1);
      j3.print();
      /*
      X X
      X X X
          X
      X X X
      */
      System.out.println(j3.isStable());
      j3.moveBlock(2, 2, 2);
      j3.print();
      /*
      X X X
      X X X
      
      X X X
      */
      System.out.println(j3.isStable());
      // false
   }

}