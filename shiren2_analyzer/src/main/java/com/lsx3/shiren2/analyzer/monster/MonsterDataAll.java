package com.lsx3.shiren2.analyzer.monster;

import com.lsx3.shiren2.analyzer.enums.MonsterCode;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class MonsterDataAll {
    private List<MonsterData> monsterData;

    public MonsterDataAll(byte[] rom) {
        this.monsterData = analyzeMonsterData(rom);
    }

    private List<MonsterData> analyzeMonsterData(byte[] rom) {
        List<MonsterData> monsterDataList = new ArrayList<>();
        int readAddress = 0x01B8BA0;
        for (int i = 0; i < 260; i++) {
            monsterDataList.add(analyzeFloorDataOneFloor(rom, readAddress));
            readAddress += 24;
        }

        readAddress = 0x01BAD08;
        for (int i = 0; i < 18; i++) {
            monsterDataList.add(analyzeFloorDataOneFloor(rom, readAddress));
            readAddress += 24;
        }

        return monsterDataList;
    }

    private MonsterData analyzeFloorDataOneFloor(byte[] rom, int readAddress) {
        byte[] hitPointArray = {0x00, 0x00, rom[readAddress++], rom[readAddress++]};
        int hitPoint = ByteBuffer.wrap(hitPointArray).getInt();
        byte[] attackPowerArray = {0x00, 0x00, rom[readAddress++], rom[readAddress++]};
        int attackPower = ByteBuffer.wrap(attackPowerArray).getInt();
        byte[] defencePointArray = {0x00, 0x00, rom[readAddress++], rom[readAddress++]};
        int defence = ByteBuffer.wrap(defencePointArray).getInt();
        int wakeUpRate = Byte.toUnsignedInt(rom[readAddress++]);
        int speed = Byte.toUnsignedInt(rom[readAddress++]);
        int type1 = Byte.toUnsignedInt(rom[readAddress++]);
        int type2 = Byte.toUnsignedInt(rom[readAddress++]);
        byte[] experiencePointArray = {0x00, 0x00, rom[readAddress++], rom[readAddress++]};
        int experiencePoint = ByteBuffer.wrap(experiencePointArray).getInt();
        int sleepType = Byte.toUnsignedInt(rom[readAddress++]);
        int dropRate = Byte.toUnsignedInt(rom[readAddress++]);
        int randomDrop = Byte.toUnsignedInt(rom[readAddress++]);
        int fixedDrop = Byte.toUnsignedInt(rom[readAddress++]);
        int hitPointIncrement = Byte.toUnsignedInt(rom[readAddress++]);
        int powerIncrement = Byte.toUnsignedInt(rom[readAddress++]);
        int maxLevel = Byte.toUnsignedInt(rom[readAddress++]);
        int icon = Byte.toUnsignedInt(rom[readAddress++]);
        int skillRate = Byte.toUnsignedInt(rom[readAddress++]);
        int skillNumber1 = Byte.toUnsignedInt(rom[readAddress++]);
        int skillNumber2 = Byte.toUnsignedInt(rom[readAddress++]);
        int byte24 = Byte.toUnsignedInt(rom[readAddress++]);

        MonsterData monsterData1 = new MonsterData(hitPoint, attackPower, defence, wakeUpRate, speed, type1, type2, experiencePoint, sleepType, dropRate, randomDrop, fixedDrop, hitPointIncrement, powerIncrement, maxLevel, icon, skillRate, skillNumber1, skillNumber2, byte24);

        return monsterData1;
    }

    public StringBuilder makeTable() {
        StringBuilder sb = new StringBuilder();

        sb.append(makeBody());

        return sb;
    }

    protected StringBuilder makeBody() {
        StringBuilder sb = new StringBuilder();
        String header = "|モンスター名|HP|攻撃|守備|覚醒率|速|種1|種2|経験値|睡眠タイプ|落率|ランダムドロップ&br;の有無|固定ドロップ|HP+|攻+|成長|アイコン|特技率|A|B||A内容|B内容|h\n";
        sb.append(header);
        int i = 1;
        for (MonsterData monsterData : monsterData) {
            MonsterCode monsterCodeTemp = MonsterCode.getMonsterCode(i++);

            sb.append("|~" + monsterCodeTemp.getName()
                    + monsterData.getRow()
                    + monsterCodeTemp.getaInfo()
                    + "|" + monsterCodeTemp.getbInfo()
                    + "|\n"
            );
        }
        sb.append("\n");

        return sb;
    }
}
