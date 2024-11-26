package com.cat.model.cat;

import com.cat.model.system.MemoryDTO;

public class CatModel {

    public String[] getSleepingCatFrame(MemoryDTO memoryDTO) {

        double usedMemoryGb = memoryDTO.usedMemory();

        if (memoryDTO.getPercentUsedMemory() > 0.82) {
            return new String[]{
                    "고양이 위로 나비와 사용 메모리량이 날아간다냥\n" +
                            "임시 : (종료를 원하면 엔터를 누르라냥)\n\n" +
                            "          εїз ~ " + usedMemoryGb + " GB" + "\n\n" +
                            "        ∧  ヘ\n" +
                            "       (  ̮  ̮  )\n" +
                            "        |_  _) \n" +
                            "       ()し(~)__\n",
                    "고양이 위로 나비와 사용 메모리량이 날아간다냥\n" +
                            "임시 : (종료를 원하면 엔터를 누르라냥)\n\n" +
                            "       εїз ~ " + usedMemoryGb + " GB" + "\n\n" +
                            "        ∧  ヘ\n" +
                            "       (。  ̮  )\n" +
                            "       ∠    <) \n" +
                            "       ()し(~)_ノ\n",
                    "고양이 위로 나비와 사용 메모리량이 날아간다냥\n" +
                            "임시 : (종료를 원하면 엔터를 누르라냥)\n\n" +
                            "    εїз ~ " + usedMemoryGb + " GB" + "\n\n" +
                            "        ﾉヽ\n" +
                            "       (˚. 。 フ\n" +
                            "       ∠    >)  \n" +
                            "       ()し(~)_ノ\n"
//                    "고양이 위로 나비와 사용 메모리량이 날아간다냥\n" +
//                            "(종료를 원하면 엔터를 누르라냥)\n\n" +
//                            "temp1 " + usedMemoryGb + "\n\n" +
//                            "1\n" + "2\n" + "3\n" + "4\n",
//                    "고양이 위로 나비와 사용 메모리량이 날아간다냥\n" +
//                            "(종료를 원하면 엔터를 누르라냥)\n\n" +
//                            "temp2 " + usedMemoryGb + "\n\n" +
//                            "1\n" + "2\n" + "3\n" + "4\n",
//                    "고양이 위로 나비와 사용 메모리량이 날아간다냥\n" +
//                            "(종료를 원하면 엔터를 누르라냥)\n\n" +
//                            "temp3 " + usedMemoryGb + "\n\n" +
//                            "1\n" + "2\n" + "3\n" + "4\n"
            };
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

}
