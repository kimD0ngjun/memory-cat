package com.cat.controller;


import com.cat.model.cat.CatModel;
import com.cat.model.system.MemoryDTO;
import com.cat.system.MemoryService;
import com.cat.view.CatView;

public class MemoryCatController {

    private final CatView view = new CatView();
    private final MemoryService memoryService = new MemoryService();

    public void runAnimation() {
        Thread animationThread = Thread.ofVirtual().start(() -> {
                        try {
                while (true) { // 무한 반복
                    // KB 단위
                    int usedMemoryKb = memoryService.getUsedMemorySafe();
                    int totalMemoryKb = memoryService.getTotalMemorySafe();

                    // GB 단위 (소수점 둘째 자리까지 반올림)
                    double usedMemoryGb = (double) usedMemoryKb / (1024 * 1024);
                    double totalMemoryGb = (double) totalMemoryKb / (1024 * 1024);

                    usedMemoryGb = Math.round(usedMemoryGb * 100.0) / 100.0;
                    totalMemoryGb = Math.round(totalMemoryGb * 100.0) / 100.0;

                    if (usedMemoryGb < 0) {
                        System.err.println("메모리 정보를 가져올 수 없습니다. 기본 값을 사용합니다.");
                        usedMemoryGb = 0; // 기본값 설정
                    }

                    // DTO 생성
                    MemoryDTO memoryDTO = new MemoryDTO(usedMemoryGb, totalMemoryGb);

                    CatModel catModel = new CatModel();
                    String[] frameArray = catModel.getSleepingCatFrame(memoryDTO);

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
