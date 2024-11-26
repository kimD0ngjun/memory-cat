import controller.MemoryCatController;

/**
 * 얘네는 개발환경에서만 쓰는 것, 실제 배포 파일은 jar 파일로 배포
 * out 패키지 생성 : java -cp out/production/classes MemoryCatApplication
 * 실행 : java -cp out/production/classes MemoryCatApplication
 */
public class MemoryCatApplication {
    public static void main(String[] args) {
        MemoryCatController memoryCatController = new MemoryCatController();
        memoryCatController.runAnimation();
    }
}
