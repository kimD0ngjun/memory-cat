import controller.MemoryCatController;

/**
 * out 패키지 생성 : java -cp out/production/classes MemoryCatApplication
 * 실행 : java -cp out/production/classes MemoryCatApplication
 */
public class MemoryCatApplication {
    public static void main(String[] args) {
        MemoryCatController memoryCatController = new MemoryCatController();
        memoryCatController.runAnimation();
    }
}
