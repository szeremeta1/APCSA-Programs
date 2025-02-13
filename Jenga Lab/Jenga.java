// Alexander Szeremeta
// 20250116
// APCSA
// Jenga Lab

public class Jenga {

   private int[][] tower;
   
   public Jenga(int initialLayers) {
      tower = new int[initialLayers + 1][3];
      for (int row = 1; row <= initialLayers; row++) {
         for (int col = 0; col < 3; col++) {
            tower[row][col] = 1;
         }
      }
   }
   
   public boolean moveBlock(int fromR, int fromC, int toC) {
      if (tower[fromR][fromC] == 0) {
         return false;
      }
      if (fromR == 0) {
         return false;
      }
      if (topLayerFull()) {
         addLayer();
         fromR++;
      }
      if (tower[0][toC] == 1) {
         return false;
      }
      tower[fromR][fromC] = 0;
      tower[0][toC] = 1;
      return true;
   }

   
   public int numLayers() {
      int total = 0;
      for (int i : tower[0]) {
         total += i;
      }
      if (total == 0) {
         return tower.length - 1;
      }
      return tower.length;
   }
   
   public void print() {
      for (int[] layer : tower) {
         for (int space : layer) {
            if (space == 1) {
               System.out.print("X ");
            } else {
               System.out.print("  ");
            }
         }
         System.out.println();
      }
   }
   
   public void cheat(int c) {
      tower[0][c] = 1;
   }
   
   public boolean isNorthSouth(int layerIndex) {
      return (tower.length - 1 - layerIndex) % 2 == 0;
   }
   
   public boolean topLayerFull() {
      if (tower == null || tower.length == 0) {
         return false;
      }
      int[] topLayer = tower[0];
      return topLayer[0] == 1 && topLayer[1] == 1 && topLayer[2] == 1;
   }
   
   public void addLayer() {
      int[][] newTower = new int[tower.length + 1][3];
      for (int row = 0; row < tower.length; row++) {
         for (int col = 0; col < 3; col++) {
            newTower[row + 1][col] = tower[row][col];
         }
      }
       
      newTower[0][0] = 0;
      newTower[0][1] = 0;
      newTower[0][2] = 0;
       
      tower = newTower;
   }
   
   public boolean isStable() {
      for (int row = 1; row < tower.length; row++) {
         int[] layer = tower[row];
         int blockCount = 0;
         for (int block : layer) {
            if (block == 1) {
               blockCount++;
            }
         }
         if (blockCount == 0) {
            return false;
         }
         if (blockCount == 1) {
            if (layer[0] == 1 || layer[2] == 1) {
               return false;
            }
         }
      }   
      return true;
   }
}