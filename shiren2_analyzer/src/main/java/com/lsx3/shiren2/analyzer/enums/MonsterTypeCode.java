package com.lsx3.shiren2.analyzer.enums;

public enum MonsterTypeCode implements ICode {
    NORMAL((byte) 1, "ノーマル", "#e6e6fa"),
    WEAPON((byte) 2, "武器系", "#9999FF"),
    PROJECTILE((byte) 3, "投げもの系", "sandybrown"),
    MAGIC((byte) 4, "魔法系", "orchid"),
    ITEM((byte) 5, "アイテム変化系", "#CC99FF"),
    THEFT((byte) 6, "ぬすっと系", "#e6e6fa"),
    DRAGON((byte) 7, "ドラゴン系", "#99CC00"),
    GHOST((byte) 8, "ゴースト系", "#FFFF99"),
    DRAIN((byte) 9, "ドレイン系", "#FF99CC"),
    CYCLOPS((byte) 10, "一ツ目系", "#CCFFCC"),
    BOMB((byte) 11, "爆弾系", "#FFCC99"),
    AQUATIC((byte) 12, "水中系", "#99CCFF"),
    ONI((byte) 13, "鬼系", "#e6e6fa"),
    BONUS((byte) 14, "ボーナス系", "yellow"),
    N_DUBBA((byte) 15, "ンドゥバ", "lightcyan"),
    ;

    private final byte code;
    private final String name;
    private final String colorCode;

    MonsterTypeCode(byte code, String name, String colorCode) {
        this.code = code;
        this.name = name;
        this.colorCode = colorCode;
    }

    @Override
    public byte getCode() {
        return code;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getColorCode() {
        return colorCode;
    }

    public static final EnumReverseLookup<MonsterTypeCode, Byte> byCode =
            new EnumReverseLookup<>(MonsterTypeCode.class, MonsterTypeCode::getCode);

}
