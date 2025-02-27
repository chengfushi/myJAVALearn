import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;

public class Gobang extends JFrame {
    private final int BOARD_SIZE = 15;
    private final int CELL_SIZE = 40;
    private final int BOARD_PADDING = 30;

    private int[][] board = new int[BOARD_SIZE][BOARD_SIZE]; // 0-空 1-黑 2-白
    private boolean isBlackTurn = true;
    private boolean gameOver = false;
    private Point hoverPoint = null;

    public Gobang() {
        setTitle("Java五子棋");
        setSize(BOARD_PADDING*2 + CELL_SIZE*(BOARD_SIZE-1),
                BOARD_PADDING*2 + CELL_SIZE*(BOARD_SIZE-1));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel gamePanel = new GamePanel();
        gamePanel.addMouseMotionListener(new HoverListener());
        gamePanel.addMouseListener(new ClickListener());
        add(gamePanel);
    }

    class GamePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            // 绘制棋盘背景
            g2d.setColor(new Color(222, 184, 135));
            g2d.fillRect(0, 0, getWidth(), getHeight());

            // 绘制网格
            g2d.setColor(Color.BLACK);
            for (int i = 0; i < BOARD_SIZE; i++) {
                int pos = BOARD_PADDING + i * CELL_SIZE;
                g2d.drawLine(BOARD_PADDING, pos,
                        BOARD_PADDING + (BOARD_SIZE-1)*CELL_SIZE, pos);
                g2d.drawLine(pos, BOARD_PADDING,
                        pos, BOARD_PADDING + (BOARD_SIZE-1)*CELL_SIZE);
            }

            // 绘制棋子
            for (int i = 0; i < BOARD_SIZE; i++) {
                for (int j = 0; j < BOARD_SIZE; j++) {
                    if (board[i][j] != 0) {
                        drawStone(g2d, i, j, board[i][j] == 1);
                    }
                }
            }

            // 绘制悬停提示
            if (!gameOver && hoverPoint != null) {
                g2d.setColor(isBlackTurn ?
                        new Color(0, 0, 0, 100) : new Color(255, 255, 255, 100));
                drawStone(g2d, hoverPoint.x, hoverPoint.y, isBlackTurn);
            }
        }

        private void drawStone(Graphics2D g2d, int x, int y, boolean isBlack) {
            int cx = BOARD_PADDING + x * CELL_SIZE;
            int cy = BOARD_PADDING + y * CELL_SIZE;

            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);

            if (isBlack) {
                g2d.setColor(Color.BLACK);
            } else {
                g2d.setColor(Color.WHITE);
            }
            g2d.fill(new Ellipse2D.Float(cx-15, cy-15, 30, 30));

            // 绘制棋子边框
            g2d.setColor(isBlack ? Color.WHITE : Color.BLACK);
            g2d.setStroke(new BasicStroke(2));
            g2d.drawOval(cx-15, cy-15, 30, 30);
        }
    }

    class HoverListener extends MouseMotionAdapter {
        @Override
        public void mouseMoved(MouseEvent e) {
            if (gameOver) return;

            Point p = convertPoint(e.getPoint());
            if (p != null && board[p.x][p.y] == 0) {
                hoverPoint = p;
            } else {
                hoverPoint = null;
            }
            repaint();
        }
    }

    class ClickListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (gameOver) return;

            Point p = convertPoint(e.getPoint());
            if (p != null && board[p.x][p.y] == 0) {
                board[p.x][p.y] = isBlackTurn ? 1 : 2;
                if (checkWin(p.x, p.y)) {
                    gameOver = true;
                    JOptionPane.showMessageDialog(null,
                            (isBlackTurn ? "黑方" : "白方") + "获胜！");
                }
                isBlackTurn = !isBlackTurn;
                repaint();
            }
        }
    }

    private Point convertPoint(Point mousePoint) {
        int x = Math.round((mousePoint.x - BOARD_PADDING) / (float)CELL_SIZE);
        int y = Math.round((mousePoint.y - BOARD_PADDING) / (float)CELL_SIZE);

        if (x < 0 || x >= BOARD_SIZE || y < 0 || y >= BOARD_SIZE) {
            return null;
        }
        return new Point(x, y);
    }

    private boolean checkWin(int x, int y) {
        int color = board[x][y];
        int[][] directions = {{1,0}, {0,1}, {1,1}, {1,-1}};

        for (int[] dir : directions) {
            int count = 1;
            // 正向检查
            for (int i = 1; i <= 4; i++) {
                int nx = x + dir[0] * i;
                int ny = y + dir[1] * i;
                if (nx < 0 || nx >= BOARD_SIZE || ny < 0 || ny >= BOARD_SIZE) break;
                if (board[nx][ny] == color) count++;
                else break;
            }
            // 反向检查
            for (int i = 1; i <= 4; i++) {
                int nx = x - dir[0] * i;
                int ny = y - dir[1] * i;
                if (nx < 0 || nx >= BOARD_SIZE || ny < 0 || ny >= BOARD_SIZE) break;
                if (board[nx][ny] == color) count++;
                else break;
            }
            if (count >= 5) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Gobang().setVisible(true));
    }
}
