package com.cat.view;

public class CatView {

    public void displayFrame(String frame) {
        System.out.print(frame);
    }

    // 이전 프레임 지우기 (콘솔 화면 제어)
    public void clearLines(int lineCount) {
        StringBuilder clearCommand = new StringBuilder();
        for (int i = 0; i < lineCount; i++) {
            clearCommand.append("\033[F"); // 커서를 한 줄 위로 이동
            clearCommand.append("\033[2K"); // 현재 줄을 지움
        }
        System.out.print(clearCommand);
    }

}
