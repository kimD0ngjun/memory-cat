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
                        "        |_  _) \n" +
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
                        "          -ª<⢦ ~ " + usedMemoryGb + " GB..!" + "\n\n" +
                        "   　   へ ~ノ\\\n" +
                        "       ( ˚ - ゜)\n" +
                        "  　　  し ~  J\n" +
                        "  　    (~)—(~)_\n",
                "고양이 위로 나비와 사용 메모리량이 날아간다냥\n" +
                        "(종료를 원하면 엔터를 누르라냥)\n\n" +
                        "       -ª<⢦ ~ " + usedMemoryGb + " GB..!" + "\n\n" +
                        "   .    へ ~ノ\\\n" +
                        "    `¨.( ˚ △ ゜)\n" +
                        "  　　  ∠  ~  \\\n" +
                        "  　    (~)—(~)ノ\n",
                "고양이 위로 나비와 사용 메모리량이 날아간다냥\n" +
                        "(종료를 원하면 엔터를 누르라냥)\n\n" +
                        "    -ª<⢦ ~ " + usedMemoryGb + " GB..!" + "\n\n" +
                        "  .　   へ ~ノ\\\n" +
                        "    Σ`.(;˚ □ ゜)\n" +
                        "  　　  <  ~  フ\n" +
                        "  　    (~)—(~)ノ\n"
        };
    }
}
