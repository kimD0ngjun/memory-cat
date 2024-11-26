package controller;

import model.cat.CatModel;
import view.CatView;

public class MemoryCatController {

    private final CatView view = new CatView();

    public void runAnimation() {
        Thread animationThread = Thread.ofVirtual().start(() -> {
            CatModel catModel = new CatModel();

            String[] frameArray = catModel.getSleepingCatFrame(String.valueOf(16));

            try {
                while (true) { // 무한 반복
                    for (String frame : frameArray) {
                        view.clearLines(frameArray[0].split("\n").length); // 이전 프레임 지우기
                        view.displayFrame(frame); // 새로운 프레임 출력
                        Thread.sleep(750);
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("\n고양이가 잠에서 깼다냥\n");
            }
        });

        try {
            System.in.read(); // 사용자 입력 대기
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        animationThread.interrupt(); // 스레드 중단 요청
    }

}
