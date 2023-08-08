package com.lsx3.shiren2.analyzer.enums;

public enum ItemTypeCode implements ICode {
    NULL((byte) 0x00, "null"),
    GRASS((byte) 0x01, "草"),
    SCROLL((byte) 0x02, "巻物"),
    WEAPON((byte) 0x03, "武器"),
    SHIELD((byte) 0x04, "盾"),
    ARROW((byte) 0x05, "矢"),
    BRACELETS((byte) 0x06, "腕輪"),
    STAVE((byte) 0x07, "杖"),
    FOOD((byte) 0x08, "おにぎり"),
    POD((byte) 0x09, "壺"),
    STATUE((byte) 0x0A, "土偶"),
    STONE((byte) 0x0B, "石"),
    CANNONBALL((byte) 0x0C, "大砲の弾"),
    VOUCHER((byte) 0x0D, "割引券"),
    GITAN((byte) 0x0E, "ギタン"),
    STAIRS((byte) 0x0F, "階段"),
    TRAP((byte) 0x10, "ワナ"),
    MATERIALS((byte) 0x11, "城の材料"),
    OTHER((byte) 0xFF, "その他"),
    ;

    private final byte itemTypeCode;
    private final String itemTypeName;

    ItemTypeCode(byte itemTypeCode, String itemTypeName) {
        this.itemTypeCode = itemTypeCode;
        this.itemTypeName = itemTypeName;
    }

    public byte getCode() {
        return itemTypeCode;
    }

    public String getName() {
        return itemTypeName;
    }

    public static final EnumReverseLookup<ItemTypeCode, Byte> byCode =
            new EnumReverseLookup<>(ItemTypeCode.class, ItemTypeCode::getCode);
}
