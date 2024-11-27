package com.cat.model.cat;

import com.cat.model.system.MemoryDTO;

public class CatModel {

    public String[] getCatFrame(MemoryDTO memoryDTO) {

        double usedMemoryGb = memoryDTO.usedMemory();

        if (memoryDTO.getPercentUsedMemory() > 0.82) {
            return getWakeUpCatFrame(usedMemoryGb);
        }

        return getSleepingFrame(usedMemoryGb);
    }

    private String[] getSleepingFrame(double usedMemoryGb) {
        return new String[]{
                "고양이 위로 나비와 사용 메모리량이 날아간다냥\n" +
                        "(종료를 원하면 엔터를 누르라냥)\n\n" +
                        "          εїз ~ " + usedMemoryGb + " GB" + "\n\n" +
                        "        ∧  ヘ\n" +
                        "       (  ̮  ̮  )\n" +
                        "        (   _) \n" +
                        "       ()し(~)__\n",
                "고양이 위로 나비와 사용 메모리량이 날아간다냥\n" +
                        "(종료를 원하면 엔터를 누르라냥)\n\n" +
                        "       εїз ~ " + usedMemoryGb + " GB" + "\n\n" +
                        "        ∧  ヘ\n" +
                        "       (。  ̮  )\n" +
                        "       ∠    <) \n" +
                        "       ()し(~)_ノ\n",
                "고양이 위로 나비와 사용 메모리량이 날아간다냥\n" +
                        "(종료를 원하면 엔터를 누르라냥)\n\n" +
                        "    εїз ~ " + usedMemoryGb + " GB" + "\n\n" +
                        "        ﾉヽ\n" +
                        "       (˚. 。 フ\n" +
                        "       ∠    >)  \n" +
                        "       ()し(~)_ノ\n"
        };
    }

    private String[] getWakeUpCatFrame(double usedMemoryGb) {
        return new String[]{
                "고양이 위로 나비와 사용 메모리량이 날아간다냥\n" +
                        "(종료를 원하면 엔터를 누르라냥)\n\n" +
                        "    -⢦< ~ " + usedMemoryGb + " GB..!" + "\n\n" +
                        "  .     ﾉヽ\n" +
                        "    Σ`.(˚. 。;フ\n" +
                        "       ∠    >)  \n" +
                        "       ()し(~)_ノ █ \n",
                "고양이 위로 나비와 사용 메모리량이 날아간다냥\n" +
                        "(종료를 원하면 엔터를 누르라냥)\n\n" +
                        "  -⢦< ~ " + usedMemoryGb + " GB..!" + "\n\n" +
                        "        /＼ へ\n" +
                        "       (  。 。)\n" +
                        "        し - J)  \n" +
                        "       ()し(~)_ノ █ \n",
                "고양이 위로 나비와 사용 메모리량이 날아간다냥\n" +
                        "(종료를 원하면 엔터를 누르라냥)\n\n" +
                        " ⣄⣄⠷⣦⣷⣽⠊   " + usedMemoryGb + "\n" +
                        "⠓⠸⣿⣿⣿⣿⠋           G\n" +
                        " ⠓⠸⣿⣿⣿⠂ ﾉヽ" + "         B...\n" +
                        "  ⠉ ⠙⠻◀(˚. 。 フ\n" +
                        "       \\    >)  \n" +
                        "       ()し(~)_ノ\n"
        };
    }
}
