package model.cat;

public enum CatModel {
    SLEEPING_CAT(Frame.SLEEPING_CAT_FRAME),
    WAKEUP_CAT(Frame.WAKEUP_CAT_FRAME);

    private final String[] frame;

    CatModel(String[] frame) {
        this.frame = frame;
    }

    public String[] getFrame() {
        return frame;
    }

    public static class Frame {
        public static final String[] SLEEPING_CAT_FRAME = {
                "고양이 위로 나비가 날아간다냥\n\n" +
                        "       εїз\n\n" +
                        "   ∧  ヘ\n" +
                        "  (  ̮  ̮  )\n" +
                        "   |_  _) \n" +
                        "  ()し(~)〜〜\n",
                "고양이 위로 나비가 날아간다냥\n\n" +
                        "    εїз...\n\n" +
                        "   ∧  ヘ\n" +
                        "  (。  ̮  )\n" +
                        "  ∠    <) \n" +
                        "  ()し(~)〜〜\n",
                "고양이 위로 나비가 날아간다냥\n\n" +
                        "  εїз.....\n\n" +
                        "   ﾉヽ\n" +
                        "  (˚. 。 フ\n" +
                        "  ∠    >)  \n" +
                        "  ()し(~)〜〜\n"
        };

        public static final String[] WAKEUP_CAT_FRAME = {};
    }
}
