package Recursion;

public class Labyrinth {
    public static void main(String[] args) {

    }
}
class Mouse {
    public boolean findWay(int[][] map,int x,int y, int targetX,int targetY){
        //超出边界或遇到墙
        if (x < 0 || x >= map.length || y < 0 || y >= map[0].length || map[x][y] == 1) return false;

        //到达终点
        if (targetX == x && targetY == y) return true;

        //标记当前路被访问
        map[x][y] = 1;

        //尝试四个方向
        if (findWay(map, x + 1, y, targetX, targetY)) return true;
        if (findWay(map, x, y + 1, targetX, targetY)) return true;
        if (findWay(map, x - 1, y, targetX, targetY)) return true;
        if (findWay(map, x, y - 1, targetX, targetY)) return true;

        //回溯
        map[x][y] = 0;

        return false;
    }
}
