import java.util.Scanner;

import Model.Layout;
import Model.Position;
import Model.Robot;

public class RobotApp {
    public static void main(String[] args){
        new RobotApp();
    }

    private Layout layout;
    private Robot robot;
    private Scanner scanner;
    public RobotApp() {        
        this.layout = new Layout(10, 10, '*');
        this.robot = new Robot('o', new Position(0, 0));
        this.scanner = new Scanner(System.in);
        String instruction = "";
        System.out.println("-------- Permainan Dimulai --------");
        do{
            draw();
            instruction = waitInstruction();
            if (!instruction.equals("x")) {
                executeInstruction(instruction);
            }
        }while(!instruction.equals("x"));
        System.out.println("-------- Permainan Selesai --------");
    }

    private String waitInstruction() {
        System.out.println("-------- Instruksi --------");
        System.out.println("Instruksi: {d=kanan/a=kiri/w=atas/s=bawah}{jumlah langkah}");
        System.out.println("Contoh: w3 berarti 'keatas 3 langkah'");
        System.out.print("Masukan instruksi: ");
        return scanner.nextLine();
    }

    private void draw() {
        System.out.println("------ Posisi Terbaru ------");
        char[][] area = layout.getArea();
        Position robotPosition = robot.getPosition();
    
        for (int i = 0; i < layout.getMaxX(); i++) {
            StringBuilder output = new StringBuilder();
            for (int j = 0; j < layout.getMaxY(); j++) {
                output.append((i == robotPosition.getX() && j == robotPosition.getY()) ? robot.getIcon() : area[i][j]);
            }
            System.out.println(output.toString());
        }
    }

    private void executeInstruction(String instruction) {
        char direction = instruction.charAt(0);
        int steps = Integer.parseInt(instruction.substring(1));
    
        int[] deltas = getDeltas(direction, steps);
        
        if (deltas != null) {
            int lineX = robot.getPosition().getX() + deltas[0];
            int lineY = robot.getPosition().getY() + deltas[1];
    
            if (isValidPosition(lineX, lineY)) {
                robot.getPosition().setX(lineX);
                robot.getPosition().setY(lineY);
            } else {
                System.out.println("Keluar dari area");
            }
        } else {
            System.out.println("Tidak valid");
        }
    }
    
    private int[] getDeltas(char direction, int steps) {
        int[] step = new int[2];
        
        switch (direction) {
            case 'w':
                step[0] = -steps;
                break;
            case 'a':
                step[1] = -steps;
                break;
            case 's':
                step[0] = steps;
                break;
            case 'd':
                step[1] = steps;
                break;
            default:
                return null;
        }
        
        return step;
    }
    
    private boolean isValidPosition(int x, int y) {
        int maxX = 10;
        int maxY = 10;
    
        return x >= 0 && x <= maxX && y >= 0 && y <= maxY;
    }
}
