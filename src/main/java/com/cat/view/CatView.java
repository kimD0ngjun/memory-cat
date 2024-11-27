package com.cat.view;

public class CatView {

    public void displayFrame(String frame) {
        System.out.print(frame);
    }

    // 화면 전체를 지우고, 커서를 맨 위로 이동
    public void clearScreen() {
        StringBuilder clearCommand = new StringBuilder();
        clearCommand.append("\033[2J");  // 화면 전체를 지움
        clearCommand.append("\033[H");   // 커서를 맨 위로 이동
        System.out.print(clearCommand);
    }
}
