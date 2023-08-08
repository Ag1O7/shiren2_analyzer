package com.lsx3.shiren2.analyzer.enums;

public enum MonsterCode implements ICode {
    MAMEL(1, (byte) 0x1D, (byte) 1, "マムル", "マムル", MonsterTypeCode.NORMAL, "", ""),
    PIT_MAMEL(2, (byte) 0x1D, (byte) 2, "あなぐらマムル", "あなぐら", MonsterTypeCode.NORMAL, "", ""),
    CAVE_MAMEL(3, (byte) 0x1D, (byte) 3, "どうくつマムル", "洞窟", MonsterTypeCode.NORMAL, "", ""),
    CODE_0x1E_1(4, (byte) 0x1E, (byte) 1, "ドラゴン", "ﾄﾞﾗｺﾞﾝ", MonsterTypeCode.DRAGON, "固定ダメ", ""),
    CODE_0x1E_2(5, (byte) 0x1E, (byte) 2, "スカイドラゴン", "ｽｶｲ", MonsterTypeCode.DRAGON, "固定ダメ", ""),
    CODE_0x1E_3(6, (byte) 0x1E, (byte) 3, "アークドラゴン", "ｱｰｸ", MonsterTypeCode.DRAGON, "固定ダメ", ""),
    CODE_0x1F_1(7, (byte) 0x1F, (byte) 1, "ガマラ", "ｶﾞﾏﾗ", MonsterTypeCode.THEFT, "", ""),
    CODE_0x1F_2(8, (byte) 0x1F, (byte) 2, "ガマグッチ", "ｶﾞﾏｸﾞｯﾁ", MonsterTypeCode.THEFT, "", ""),
    CODE_0x1F_3(9, (byte) 0x1F, (byte) 3, "ガマゴン", "ｶﾞﾏｺﾞﾝ", MonsterTypeCode.THEFT, "", ""),
    CODE_0x20_1(10, (byte) 0x20, (byte) 1, "ぬすっトド", "トド", MonsterTypeCode.THEFT, "", ""),
    CODE_0x20_2(11, (byte) 0x20, (byte) 2, "みどりトド", "緑ﾄﾄﾞ", MonsterTypeCode.THEFT, "分裂率", ""),
    CODE_0x20_3(12, (byte) 0x20, (byte) 3, "アイアントド", "ｱｲｱﾝﾄﾄﾞ", MonsterTypeCode.THEFT, "分裂率", ""),
    CODE_0x21_1(13, (byte) 0x21, (byte) 1, "くねくねハニー", "ﾊﾆｰ", MonsterTypeCode.DRAIN, "", ""),
    CODE_0x22_1(14, (byte) 0x22, (byte) 1, "タウロス", "ﾀｳﾛｽ", MonsterTypeCode.WEAPON, "痛恨ダメ+n％", ""),
    CODE_0x22_2(15, (byte) 0x22, (byte) 2, "ミノタウロス", "ﾐﾉﾀｳﾛｽ", MonsterTypeCode.WEAPON, "痛恨ダメ+n％", ""),
    CODE_0x22_3(16, (byte) 0x22, (byte) 3, "メガタウロス", "ﾒｶﾞﾀｳﾛｽ", MonsterTypeCode.WEAPON, "痛恨ダメ+n％", ""),
    CODE_0x23_1(17, (byte) 0x23, (byte) 1, "にぎりみならい", "みならい", MonsterTypeCode.NORMAL, "", ""),
    CODE_0x23_2(18, (byte) 0x23, (byte) 2, "にぎりへんげ", "へんげ", MonsterTypeCode.ITEM, "", ""),
    CODE_0x23_3(19, (byte) 0x23, (byte) 3, "にぎり親方", "親方", MonsterTypeCode.ITEM, "", ""),
    CODE_0x23_4(20, (byte) 0x23, (byte) 4, "にぎりもとじめ", "元締", MonsterTypeCode.ITEM, "？", ""),
    CODE_0x24_1(21, (byte) 0x24, (byte) 1, "ゲイズ", "ゲイズ", MonsterTypeCode.CYCLOPS, "", ""),
    CODE_0x24_2(22, (byte) 0x24, (byte) 2, "スーパーゲイズ", "S.ｹﾞｲｽﾞ", MonsterTypeCode.CYCLOPS, "", ""),
    CODE_0x24_3(23, (byte) 0x24, (byte) 3, "ハイパーゲイズ", "H.ｹﾞｲｽﾞ", MonsterTypeCode.CYCLOPS, "", ""),
    CODE_0x25_1(24, (byte) 0x25, (byte) 1, "チンタラ", "ﾁﾝﾀﾗ", MonsterTypeCode.NORMAL, "", ""),
    CODE_0x25_2(25, (byte) 0x25, (byte) 2, "ちゅうチンタラ", "中ﾁﾝﾀﾗ", MonsterTypeCode.NORMAL, "", ""),
    CODE_0x25_3(26, (byte) 0x25, (byte) 3, "おおチンタラ", "大ﾁﾝﾀﾗ", MonsterTypeCode.NORMAL, "", ""),
    CODE_0x26_1(27, (byte) 0x26, (byte) 1, "デブータ", "ﾃﾞﾌﾞｰﾀ", MonsterTypeCode.PROJECTILE, "射程", ""),
    CODE_0x26_2(28, (byte) 0x26, (byte) 2, "デブーチョ", "ﾃﾞﾌﾞﾁｮ", MonsterTypeCode.PROJECTILE, "射程", ""),
    CODE_0x26_3(29, (byte) 0x26, (byte) 3, "デブートン", "ﾃﾞﾌﾞｰﾄﾝ", MonsterTypeCode.PROJECTILE, "射程", ""),
    CODE_0x27_1(30, (byte) 0x27, (byte) 1, "ケンゴウ", "ｹﾝｺﾞｳ", MonsterTypeCode.WEAPON, "", ""),
    CODE_0x27_2(31, (byte) 0x27, (byte) 2, "イアイ", "ｲｱｲ", MonsterTypeCode.WEAPON, "", ""),
    CODE_0x27_3(32, (byte) 0x27, (byte) 3, "シハン", "ｼﾊﾝ", MonsterTypeCode.WEAPON, "", ""),
    CODE_0x28_1(33, (byte) 0x28, (byte) 1, "しおいやん", "いやん", MonsterTypeCode.DRAIN, "", "攻撃低下"),
    CODE_0x28_2(34, (byte) 0x28, (byte) 2, "まじしおいやん", "まじしお", MonsterTypeCode.DRAIN, "", "攻撃低下"),
    CODE_0x28_3(35, (byte) 0x28, (byte) 3, "しおやだん", "やだん", MonsterTypeCode.DRAIN, "分裂率", "攻撃低下"),
    CODE_0x28_4(36, (byte) 0x28, (byte) 4, "しおかんべん", "勘弁", MonsterTypeCode.DRAIN, "分裂率", "攻撃低下"),
    CODE_0x29_1(37, (byte) 0x29, (byte) 1, "ンドゥバ", "ﾝﾄﾞｩﾊﾞ1", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_2(38, (byte) 0x29, (byte) 2, "ンドゥバ2才", "ﾝﾄﾞｩﾊﾞ2", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_3(39, (byte) 0x29, (byte) 3, "ンドゥバ3才", "ﾝﾄﾞｩﾊﾞ3", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_4(40, (byte) 0x29, (byte) 4, "ンドゥバ4才", "ﾝﾄﾞｩﾊﾞ4", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_5(41, (byte) 0x29, (byte) 5, "ンドゥバ5才", "ﾝﾄﾞｩﾊﾞ5", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_6(42, (byte) 0x29, (byte) 6, "ンドゥバ6才", "ﾝﾄﾞｩﾊﾞ6", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_7(43, (byte) 0x29, (byte) 7, "ンドゥバ7才", "ﾝﾄﾞｩﾊﾞ7", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_8(44, (byte) 0x29, (byte) 8, "ンドゥバ8才", "ﾝﾄﾞｩﾊﾞ8", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_9(45, (byte) 0x29, (byte) 9, "ンドゥバ9才", "ﾝﾄﾞｩﾊﾞ9", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_10(46, (byte) 0x29, (byte) 10, "ンドゥバ10才", "ﾝﾄﾞｩﾊﾞ10", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_11(47, (byte) 0x29, (byte) 11, "ンドゥバ11才", "ﾝﾄﾞｩﾊﾞ11", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_12(48, (byte) 0x29, (byte) 12, "ンドゥバ12才", "ﾝﾄﾞｩﾊﾞ12", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_13(49, (byte) 0x29, (byte) 13, "ンドゥバ13才", "ﾝﾄﾞｩﾊﾞ13", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_14(50, (byte) 0x29, (byte) 14, "ンドゥバ14才", "ﾝﾄﾞｩﾊﾞ14", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_15(51, (byte) 0x29, (byte) 15, "ンドゥバ15才", "ﾝﾄﾞｩﾊﾞ15", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_16(52, (byte) 0x29, (byte) 16, "ンドゥバ16才", "ﾝﾄﾞｩﾊﾞ16", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_17(53, (byte) 0x29, (byte) 17, "ンドゥバ17才", "ﾝﾄﾞｩﾊﾞ17", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_18(54, (byte) 0x29, (byte) 18, "ンドゥバ18才", "ﾝﾄﾞｩﾊﾞ18", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_19(55, (byte) 0x29, (byte) 19, "ンドゥバ19才", "ﾝﾄﾞｩﾊﾞ19", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_20(56, (byte) 0x29, (byte) 20, "ンドゥバはたち", "ﾝﾄﾞｩﾊﾞ20", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_21(57, (byte) 0x29, (byte) 21, "ンドゥバ21才", "ﾝﾄﾞｩﾊﾞ21", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_22(58, (byte) 0x29, (byte) 22, "ンドゥバ22才", "ﾝﾄﾞｩﾊﾞ22", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_23(59, (byte) 0x29, (byte) 23, "ンドゥバ23才", "ﾝﾄﾞｩﾊﾞ23", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_24(60, (byte) 0x29, (byte) 24, "ンドゥバ24才", "ﾝﾄﾞｩﾊﾞ24", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_25(61, (byte) 0x29, (byte) 25, "ンドゥバ25才", "ﾝﾄﾞｩﾊﾞ25", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_26(62, (byte) 0x29, (byte) 26, "ンドゥバ26才", "ﾝﾄﾞｩﾊﾞ26", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_27(63, (byte) 0x29, (byte) 27, "ンドゥバ27才", "ﾝﾄﾞｩﾊﾞ27", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_28(64, (byte) 0x29, (byte) 28, "ンドゥバ28才", "ﾝﾄﾞｩﾊﾞ28", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_29(65, (byte) 0x29, (byte) 29, "ンドゥバ29才", "ﾝﾄﾞｩﾊﾞ29", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_30(66, (byte) 0x29, (byte) 30, "ンドゥバみそじ", "ﾝﾄﾞｩﾊﾞ30", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_31(67, (byte) 0x29, (byte) 31, "ンドゥバ31才", "ﾝﾄﾞｩﾊﾞ31", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_32(68, (byte) 0x29, (byte) 32, "ンドゥバ32才", "ﾝﾄﾞｩﾊﾞ32", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_33(69, (byte) 0x29, (byte) 33, "ンドゥバ33才", "ﾝﾄﾞｩﾊﾞ33", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_34(70, (byte) 0x29, (byte) 34, "ンドゥバ34才", "ﾝﾄﾞｩﾊﾞ34", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_35(71, (byte) 0x29, (byte) 35, "ンドゥバ35才", "ﾝﾄﾞｩﾊﾞ35", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_36(72, (byte) 0x29, (byte) 36, "ンドゥバ36才", "ﾝﾄﾞｩﾊﾞ36", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_37(73, (byte) 0x29, (byte) 37, "ンドゥバ37才", "ﾝﾄﾞｩﾊﾞ37", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_38(74, (byte) 0x29, (byte) 38, "ンドゥバ38才", "ﾝﾄﾞｩﾊﾞ38", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_39(75, (byte) 0x29, (byte) 39, "ンドゥバ39才", "ﾝﾄﾞｩﾊﾞ39", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_40(76, (byte) 0x29, (byte) 40, "ンドゥバ40才", "ﾝﾄﾞｩﾊﾞ40", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_41(77, (byte) 0x29, (byte) 41, "ンドゥバ41才", "ﾝﾄﾞｩﾊﾞ41", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_42(78, (byte) 0x29, (byte) 42, "ンドゥバ42才", "ﾝﾄﾞｩﾊﾞ42", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_43(79, (byte) 0x29, (byte) 43, "ンドゥバ43才", "ﾝﾄﾞｩﾊﾞ43", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_44(80, (byte) 0x29, (byte) 44, "ンドゥバ44才", "ﾝﾄﾞｩﾊﾞ44", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_45(81, (byte) 0x29, (byte) 45, "ンドゥバ45才", "ﾝﾄﾞｩﾊﾞ45", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_46(82, (byte) 0x29, (byte) 46, "ンドゥバ46才", "ﾝﾄﾞｩﾊﾞ46", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_47(83, (byte) 0x29, (byte) 47, "ンドゥバ47才", "ﾝﾄﾞｩﾊﾞ47", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_48(84, (byte) 0x29, (byte) 48, "ンドゥバ48才", "ﾝﾄﾞｩﾊﾞ48", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_49(85, (byte) 0x29, (byte) 49, "ンドゥバ49才", "ﾝﾄﾞｩﾊﾞ49", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_50(86, (byte) 0x29, (byte) 50, "ンドゥバ50才", "ﾝﾄﾞｩﾊﾞ50", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_51(87, (byte) 0x29, (byte) 51, "ンドゥバ51才", "ﾝﾄﾞｩﾊﾞ51", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_52(88, (byte) 0x29, (byte) 52, "ンドゥバ52才", "ﾝﾄﾞｩﾊﾞ52", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_53(89, (byte) 0x29, (byte) 53, "ンドゥバ53才", "ﾝﾄﾞｩﾊﾞ53", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_54(90, (byte) 0x29, (byte) 54, "ンドゥバ54才", "ﾝﾄﾞｩﾊﾞ54", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_55(91, (byte) 0x29, (byte) 55, "ンドゥバ55才", "ﾝﾄﾞｩﾊﾞ55", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_56(92, (byte) 0x29, (byte) 56, "ンドゥバ56才", "ﾝﾄﾞｩﾊﾞ56", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_57(93, (byte) 0x29, (byte) 57, "ンドゥバ57才", "ﾝﾄﾞｩﾊﾞ57", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_58(94, (byte) 0x29, (byte) 58, "ンドゥバ58才", "ﾝﾄﾞｩﾊﾞ58", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_59(95, (byte) 0x29, (byte) 59, "ンドゥバ59才", "ﾝﾄﾞｩﾊﾞ59", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_60(96, (byte) 0x29, (byte) 60, "ンドゥバかんれき", "ﾝﾄﾞｩﾊﾞ60", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_61(97, (byte) 0x29, (byte) 61, "ンドゥバ61才", "ﾝﾄﾞｩﾊﾞ61", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_62(98, (byte) 0x29, (byte) 62, "ンドゥバ62才", "ﾝﾄﾞｩﾊﾞ62", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_63(99, (byte) 0x29, (byte) 63, "ンドゥバ63才", "ﾝﾄﾞｩﾊﾞ63", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_64(100, (byte) 0x29, (byte) 64, "ンドゥバ64才", "ﾝﾄﾞｩﾊﾞ64", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_65(101, (byte) 0x29, (byte) 65, "ンドゥバ65才", "ﾝﾄﾞｩﾊﾞ65", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_66(102, (byte) 0x29, (byte) 66, "ンドゥバ66才", "ﾝﾄﾞｩﾊﾞ66", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_67(103, (byte) 0x29, (byte) 67, "ンドゥバ67才", "ﾝﾄﾞｩﾊﾞ67", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_68(104, (byte) 0x29, (byte) 68, "ンドゥバ68才", "ﾝﾄﾞｩﾊﾞ68", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_69(105, (byte) 0x29, (byte) 69, "ンドゥバ69才", "ﾝﾄﾞｩﾊﾞ69", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_70(106, (byte) 0x29, (byte) 70, "ンドゥバこき", "ﾝﾄﾞｩﾊﾞ70", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_71(107, (byte) 0x29, (byte) 71, "ンドゥバ71才", "ﾝﾄﾞｩﾊﾞ71", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_72(108, (byte) 0x29, (byte) 72, "ンドゥバ72才", "ﾝﾄﾞｩﾊﾞ72", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_73(109, (byte) 0x29, (byte) 73, "ンドゥバ73才", "ﾝﾄﾞｩﾊﾞ73", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_74(110, (byte) 0x29, (byte) 74, "ンドゥバ74才", "ﾝﾄﾞｩﾊﾞ74", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_75(111, (byte) 0x29, (byte) 75, "ンドゥバ75才", "ﾝﾄﾞｩﾊﾞ75", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_76(112, (byte) 0x29, (byte) 76, "ンドゥバ76才", "ﾝﾄﾞｩﾊﾞ76", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_77(113, (byte) 0x29, (byte) 77, "ンドゥバきじゅ", "ﾝﾄﾞｩﾊﾞ77", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_78(114, (byte) 0x29, (byte) 78, "ンドゥバ78才", "ﾝﾄﾞｩﾊﾞ78", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_79(115, (byte) 0x29, (byte) 79, "ンドゥバ79才", "ﾝﾄﾞｩﾊﾞ79", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_80(116, (byte) 0x29, (byte) 80, "ンドゥバ80才", "ﾝﾄﾞｩﾊﾞ80", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_81(117, (byte) 0x29, (byte) 81, "ンドゥバ81才", "ﾝﾄﾞｩﾊﾞ81", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_82(118, (byte) 0x29, (byte) 82, "ンドゥバ82才", "ﾝﾄﾞｩﾊﾞ82", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_83(119, (byte) 0x29, (byte) 83, "ンドゥバ83才", "ﾝﾄﾞｩﾊﾞ83", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_84(120, (byte) 0x29, (byte) 84, "ンドゥバ84才", "ﾝﾄﾞｩﾊﾞ84", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_85(121, (byte) 0x29, (byte) 85, "ンドゥバ85才", "ﾝﾄﾞｩﾊﾞ85", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_86(122, (byte) 0x29, (byte) 86, "ンドゥバ86才", "ﾝﾄﾞｩﾊﾞ86", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_87(123, (byte) 0x29, (byte) 87, "ンドゥバ87才", "ﾝﾄﾞｩﾊﾞ87", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_88(124, (byte) 0x29, (byte) 88, "ンドゥバべいじゅ", "ﾝﾄﾞｩﾊﾞ88", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_89(125, (byte) 0x29, (byte) 89, "ンドゥバ89才", "ﾝﾄﾞｩﾊﾞ89", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_90(126, (byte) 0x29, (byte) 90, "ンドゥバそつじゅ", "ﾝﾄﾞｩﾊﾞ90", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_91(127, (byte) 0x29, (byte) 91, "ンドゥバ91才", "ﾝﾄﾞｩﾊﾞ91", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_92(128, (byte) 0x29, (byte) 92, "ンドゥバ92才", "ﾝﾄﾞｩﾊﾞ92", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_93(129, (byte) 0x29, (byte) 93, "ンドゥバ93才", "ﾝﾄﾞｩﾊﾞ93", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_94(130, (byte) 0x29, (byte) 94, "ンドゥバ94才", "ﾝﾄﾞｩﾊﾞ94", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_95(131, (byte) 0x29, (byte) 95, "ンドゥバ95才", "ﾝﾄﾞｩﾊﾞ95", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_96(132, (byte) 0x29, (byte) 96, "ンドゥバ96才", "ﾝﾄﾞｩﾊﾞ96", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_97(133, (byte) 0x29, (byte) 97, "ンドゥバ97才", "ﾝﾄﾞｩﾊﾞ97", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_98(134, (byte) 0x29, (byte) 98, "ンドゥバ98才", "ﾝﾄﾞｩﾊﾞ98", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x29_99(135, (byte) 0x29, (byte) 99, "ンドゥバはくじゅ", "ﾝﾄﾞｩﾊﾞ99", MonsterTypeCode.N_DUBBA, "", ""),
    CODE_0x2A_1(136, (byte) 0x2A, (byte) 1, "プチフェニックス", "ﾌﾟﾁﾌｪﾆ", MonsterTypeCode.NORMAL, "回復量", "範囲"),
    CODE_0x2B_1(137, (byte) 0x2B, (byte) 1, "シャーガ", "ｼｬｰｶﾞ", MonsterTypeCode.DRAGON, "攻回数", "のりうつり攻回数"),
    CODE_0x2B_2(138, (byte) 0x2B, (byte) 2, "ナシャーガ", "ﾅｼｬｰｶﾞ", MonsterTypeCode.DRAGON, "攻回数", "のりうつり攻回数"),
    CODE_0x2B_3(139, (byte) 0x2B, (byte) 3, "ラシャーガ", "ﾗｼｬｰｶﾞ", MonsterTypeCode.DRAGON, "攻回数", "のりうつり攻回数"),
    CODE_0x2C_1(140, (byte) 0x2C, (byte) 1, "シューベル", "ｼｭｰﾍﾞﾙ", MonsterTypeCode.NORMAL, "", ""),
    CODE_0x2C_2(141, (byte) 0x2C, (byte) 2, "メンベルス", "ﾒﾝﾍﾞﾙ", MonsterTypeCode.NORMAL, "", ""),
    CODE_0x2C_3(142, (byte) 0x2C, (byte) 3, "ベルトーベン", "ﾍﾞﾙﾄﾍﾞﾝ", MonsterTypeCode.NORMAL, "", ""),
    CODE_0x2D_1(143, (byte) 0x2D, (byte) 1, "パコレプキン", "ﾊﾟｺﾚﾌﾟ", MonsterTypeCode.GHOST, "", ""),
    CODE_0x2D_2(144, (byte) 0x2D, (byte) 2, "パコレプキーナ", "ﾊﾟｺｷｰﾅ", MonsterTypeCode.GHOST, "", ""),
    CODE_0x2D_3(145, (byte) 0x2D, (byte) 3, "パコレプキング", "ﾊﾟｺｷﾝｸﾞ", MonsterTypeCode.GHOST, "", ""),
    CODE_0x2E_1(146, (byte) 0x2E, (byte) 1, "ワラドール", "ﾜﾗﾄﾞﾙ", MonsterTypeCode.ITEM, "", ""),
    CODE_0x2E_2(147, (byte) 0x2E, (byte) 2, "クギワラドール", "ｸｷﾞﾜﾗ", MonsterTypeCode.ITEM, "", ""),
    CODE_0x2E_3(148, (byte) 0x2E, (byte) 3, "ゴスンドール", "ｺﾞｽﾝ", MonsterTypeCode.ITEM, "", ""),
    CODE_0x2F_1(149, (byte) 0x2F, (byte) 1, "ハラヘリーニョ", "ﾊﾗﾍﾘ", MonsterTypeCode.DRAIN, "満腹度-", "満腹度+"),
    CODE_0x2F_2(150, (byte) 0x2F, (byte) 2, "ハラヘリータ", "ﾊﾗﾍﾘﾀ", MonsterTypeCode.DRAIN, "満腹度-", "満腹度+"),
    CODE_0x2F_3(151, (byte) 0x2F, (byte) 3, "ハラヘッリオ", "ﾊﾗﾍｯﾘｵ", MonsterTypeCode.DRAIN, "満腹度-", "満腹度+"),
    CODE_0x2F_4(152, (byte) 0x2F, (byte) 4, "ハラベルト", "ﾊﾗﾍﾞﾙﾄ", MonsterTypeCode.DRAIN, "最大満腹度-", "満腹度+"),
    CODE_0x30_1(153, (byte) 0x30, (byte) 1, "マルジロウ", "ﾏﾙｼﾞﾛｳ", MonsterTypeCode.NORMAL, "マス", "ダメ"),
    CODE_0x30_2(154, (byte) 0x30, (byte) 2, "マルジロウ兄", "ﾏﾙ兄", MonsterTypeCode.NORMAL, "マス", "ダメ"),
    CODE_0x30_3(155, (byte) 0x30, (byte) 3, "マルジロウ父", "ﾏﾙ父", MonsterTypeCode.NORMAL, "マス", "ダメ"),
    CODE_0x31_1(156, (byte) 0x31, (byte) 1, "かんにんぶくろ", "ｶﾝﾆﾝ袋", MonsterTypeCode.BOMB, "行動しなくなるHP", ""),
    CODE_0x32_1(157, (byte) 0x32, (byte) 1, "ものまね仮面", "ものまね", MonsterTypeCode.NORMAL, "", ""),
    CODE_0x32_2(158, (byte) 0x32, (byte) 2, "ふるまいカブリ", "ふるまい", MonsterTypeCode.NORMAL, "", ""),
    CODE_0x32_3(159, (byte) 0x32, (byte) 3, "なりきりマスク", "なりきり", MonsterTypeCode.NORMAL, "", ""),
    CODE_0x33_1(160, (byte) 0x33, (byte) 1, "ケロぼうず", "ｹﾛぼうず", MonsterTypeCode.NORMAL, "", ""),
    CODE_0x33_2(161, (byte) 0x33, (byte) 2, "ケロケロぼうず", "ｹﾛｹﾛ", MonsterTypeCode.ITEM, "守備-ｎ％", ""),
    CODE_0x33_3(162, (byte) 0x33, (byte) 3, "ジャノメぼうず", "ｼﾞｬﾉﾒ", MonsterTypeCode.ITEM, "", "武器？率"),
    CODE_0x33_4(163, (byte) 0x33, (byte) 4, "ドシャブリぼうず", "ﾄﾞｼｬﾌﾞﾘ", MonsterTypeCode.ITEM, "", "武器？率"),
    CODE_0x34_1(164, (byte) 0x34, (byte) 1, "イダテン", "ｲﾀﾞﾃﾝ", MonsterTypeCode.GHOST, "", ""),
    CODE_0x34_2(165, (byte) 0x34, (byte) 2, "シップウ", "ｼｯﾌﾟｳ", MonsterTypeCode.GHOST, "", ""),
    CODE_0x34_3(166, (byte) 0x34, (byte) 3, "カミカゼ", "ｶﾐｶｾﾞ", MonsterTypeCode.GHOST, "", ""),
    CODE_0x34_4(167, (byte) 0x34, (byte) 4, "ダイレップウ", "ﾀﾞｲﾚｯﾌﾟｳ", MonsterTypeCode.GHOST, "", ""),
    CODE_0x35_1(168, (byte) 0x35, (byte) 1, "Mr.ブーン", "Mr.ﾌﾞｰﾝ", MonsterTypeCode.BONUS, "", ""),
    CODE_0x35_2(169, (byte) 0x35, (byte) 2, "Mr.ヘリコ", "Mr.ﾍﾘｺ", MonsterTypeCode.BONUS, "", ""),
    CODE_0x35_3(170, (byte) 0x35, (byte) 3, "Mr.ジャイロ", "Mr.ｼﾞｬｲﾛ", MonsterTypeCode.BONUS, "", ""),
    CODE_0x36_1(171, (byte) 0x36, (byte) 1, "パ王", "ﾊﾟ王", MonsterTypeCode.MAGIC, "", ""),
    CODE_0x36_2(172, (byte) 0x36, (byte) 2, "パオパ王", "ﾊﾟｵﾊﾟ王", MonsterTypeCode.MAGIC, "", ""),
    CODE_0x36_3(173, (byte) 0x36, (byte) 3, "パオパ王ーン", "ﾊﾟ王ｰﾝ", MonsterTypeCode.MAGIC, "", ""),
    CODE_0x37_1(174, (byte) 0x37, (byte) 1, "ボウヤー", "ﾎﾞｳﾔｰ", MonsterTypeCode.PROJECTILE, "", ""),
    CODE_0x37_2(175, (byte) 0x37, (byte) 2, "コドモ戦車", "ｺﾄﾞﾓ", MonsterTypeCode.PROJECTILE, "", ""),
    CODE_0x37_3(176, (byte) 0x37, (byte) 3, "オヤジ戦車", "ｵﾔｼﾞ", MonsterTypeCode.BOMB, "固定ダメ", ""),
    CODE_0x37_4(177, (byte) 0x37, (byte) 4, "イッテツ戦車", "ｲｯﾃﾂ", MonsterTypeCode.BOMB, "固定ダメ", ""),
    CODE_0x38_1(178, (byte) 0x38, (byte) 1, "馬武者", "馬武者", MonsterTypeCode.PROJECTILE, "", ""),
    CODE_0x38_2(179, (byte) 0x38, (byte) 2, "荒馬ザムライ", "荒馬", MonsterTypeCode.PROJECTILE, "", ""),
    CODE_0x38_3(180, (byte) 0x38, (byte) 3, "あばれ馬将軍", "荒馬", MonsterTypeCode.PROJECTILE, "", ""),
    CODE_0x38_4(181, (byte) 0x38, (byte) 4, "乱れ馬王", "乱馬王", MonsterTypeCode.PROJECTILE, "", ""),
    CODE_0x39_1(182, (byte) 0x39, (byte) 1, "ウルロイド", "ｳﾙﾛｲﾄﾞ", MonsterTypeCode.BOMB, "射程", "固定ダメ"),
    CODE_0x39_2(183, (byte) 0x39, (byte) 2, "ゴリボット", "ｺﾞﾘﾎﾞｯﾄ", MonsterTypeCode.BOMB, "射程", "固定ダメ"),
    CODE_0x39_3(184, (byte) 0x39, (byte) 3, "ベアボーグ", "ﾍﾞｱﾎﾞｰｸﾞ", MonsterTypeCode.BOMB, "射程", "固定ダメ"),
    CODE_0x3A_1(185, (byte) 0x3A, (byte) 1, "アイアンヘッド", "ｱｲｱﾝ頭", MonsterTypeCode.CYCLOPS, "", ""),
    CODE_0x3A_2(186, (byte) 0x3A, (byte) 2, "チェインヘッド", "ﾁｪｲﾝ頭", MonsterTypeCode.CYCLOPS, "", ""),
    CODE_0x3A_3(187, (byte) 0x3A, (byte) 3, "ギガヘッド", "ｷﾞｶﾞ頭", MonsterTypeCode.CYCLOPS, "", ""),
    CODE_0x3B_1(188, (byte) 0x3B, (byte) 1, "バットカンガルー", "ｶﾝｶﾞﾙｰ", MonsterTypeCode.MAGIC, "", ""),
    CODE_0x3B_2(189, (byte) 0x3B, (byte) 2, "エビルカンガルー", "ｴﾋﾞｶﾝ", MonsterTypeCode.MAGIC, "", ""),
    CODE_0x3B_3(190, (byte) 0x3B, (byte) 3, "デビルカンガルー", "ﾃﾞﾋﾞｶﾝ", MonsterTypeCode.MAGIC, "", ""),
    CODE_0x3C_1(191, (byte) 0x3C, (byte) 1, "エスカルゴン", "ｴｽｶﾙｺﾞ", MonsterTypeCode.NORMAL, "", ""),
    CODE_0x3D_1(192, (byte) 0x3D, (byte) 1, "マゼルン", "ﾏｾﾞﾙﾝ", MonsterTypeCode.BONUS, "容量", "上昇率（％）"),
    CODE_0x3D_2(193, (byte) 0x3D, (byte) 2, "マゼモン", "ﾏｾﾞﾓﾝ", MonsterTypeCode.BONUS, "容量", "上昇率（％）"),
    CODE_0x3D_3(194, (byte) 0x3D, (byte) 3, "マゼゴン", "ﾏｾﾞｺﾞﾝ", MonsterTypeCode.BONUS, "容量", "上昇率（％）"),
    CODE_0x3E_1(195, (byte) 0x3E, (byte) 1, "タベラレルー", "ﾀﾍﾞﾗﾚ", MonsterTypeCode.NORMAL, "", ""),
    CODE_0x3F_1(196, (byte) 0x3F, (byte) 1, "スイテキマル", "ｽｲﾃｷ", MonsterTypeCode.NORMAL, "", ""),
    CODE_0x3F_2(197, (byte) 0x3F, (byte) 2, "ジライヤ", "ｼﾞﾗｲﾔ", MonsterTypeCode.NORMAL, "", ""),
    CODE_0x3F_3(198, (byte) 0x3F, (byte) 3, "ショウカンマル", "ｼｮｳｶﾝ", MonsterTypeCode.NORMAL, "", ""),
    CODE_0x3F_4(199, (byte) 0x3F, (byte) 4, "ダイジライヤ", "大ｼﾞﾗｲﾔ", MonsterTypeCode.NORMAL, "", ""),
    CODE_0x40_1(200, (byte) 0x40, (byte) 1, "ひまガッパ", "暇ｶﾞｯﾊﾟ", MonsterTypeCode.AQUATIC, "射程", ""),
    CODE_0x40_2(201, (byte) 0x40, (byte) 2, "いやすぎガッパ", "嫌すぎ", MonsterTypeCode.AQUATIC, "射程", ""),
    CODE_0x40_3(202, (byte) 0x40, (byte) 3, "たまらんガッパ", "たまらん", MonsterTypeCode.AQUATIC, "射程", ""),
    CODE_0x41_1(203, (byte) 0x41, (byte) 1, "ピコタン", "ﾋﾟｺﾀﾝ", MonsterTypeCode.NORMAL, "", ""),
    CODE_0x41_2(204, (byte) 0x41, (byte) 2, "ポコタン", "ﾎﾟｺﾀﾝ", MonsterTypeCode.NORMAL, "", ""),
    CODE_0x41_3(205, (byte) 0x41, (byte) 3, "パコタン", "ﾊﾟｺﾀﾝ", MonsterTypeCode.NORMAL, "", ""),
    CODE_0x42_1(206, (byte) 0x42, (byte) 1, "ドスコーイ", "ﾄﾞｽｺｲ", MonsterTypeCode.NORMAL, "", ""),
    CODE_0x42_2(207, (byte) 0x42, (byte) 2, "ハッキョーイ", "ﾊｯｷｮｲ", MonsterTypeCode.NORMAL, "", ""),
    CODE_0x42_3(208, (byte) 0x42, (byte) 3, "ゴッツァーン", "ｺﾞｯﾂｧﾝ", MonsterTypeCode.NORMAL, "", ""),
    CODE_0x43_1(209, (byte) 0x43, (byte) 1, "ヒツジ神官", "ﾋﾂｼﾞ神官", MonsterTypeCode.MAGIC, "", ""),
    CODE_0x43_2(210, (byte) 0x43, (byte) 2, "ヤギ司祭", "ﾔｷﾞ司祭", MonsterTypeCode.MAGIC, "", ""),
    CODE_0x43_3(211, (byte) 0x43, (byte) 3, "ガゼル教皇", "ｶﾞｾﾞﾙ", MonsterTypeCode.MAGIC, "", ""),
    CODE_0x44_1(212, (byte) 0x44, (byte) 1, "タイガーウッホ", "ｳｯﾎ", MonsterTypeCode.PROJECTILE, "射程", ""),
    CODE_0x44_2(213, (byte) 0x44, (byte) 2, "タイガーウホホ", "ｳﾎﾎ", MonsterTypeCode.PROJECTILE, "射程", ""),
    CODE_0x44_3(214, (byte) 0x44, (byte) 3, "タイガーウホーン", "ｳﾎｰﾝ", MonsterTypeCode.PROJECTILE, "射程", ""),
    CODE_0x45_1(215, (byte) 0x45, (byte) 1, "ギャドン", "ｷﾞｬﾄﾞﾝ", MonsterTypeCode.ITEM, "", ""),
    CODE_0x45_2(216, (byte) 0x45, (byte) 2, "ギャイラス", "ｷﾞｬｲﾗｽ", MonsterTypeCode.ITEM, "", ""),
    CODE_0x45_3(217, (byte) 0x45, (byte) 3, "ギャンドラー", "ｷﾞｬﾝﾄﾞﾗ", MonsterTypeCode.ITEM, "", ""),
    CODE_0x46_1(218, (byte) 0x46, (byte) 1, "足軽どん", "足軽", MonsterTypeCode.WEAPON, "", ""),
    CODE_0x46_2(219, (byte) 0x46, (byte) 2, "侍どん", "侍どん", MonsterTypeCode.WEAPON, "", ""),
    CODE_0x46_3(220, (byte) 0x46, (byte) 3, "大将どん", "大将", MonsterTypeCode.WEAPON, "", ""),
    CODE_0x46_4(221, (byte) 0x46, (byte) 4, "殿様どん", "殿様", MonsterTypeCode.WEAPON, "", ""),
    CODE_0x47_1(222, (byte) 0x47, (byte) 1, "テッポーウオー", "ﾃｯﾎﾟｰ", MonsterTypeCode.AQUATIC, "固定ダメ", ""),
    CODE_0x47_2(223, (byte) 0x47, (byte) 2, "テッポウ竜", "ﾃｯﾎﾟｳ竜", MonsterTypeCode.AQUATIC, "固定ダメ", ""),
    CODE_0x47_3(224, (byte) 0x47, (byte) 3, "キングオトシゴン", "王ｵﾄｼｺﾞ", MonsterTypeCode.AQUATIC, "固定ダメ", ""),
    CODE_0x48_1(225, (byte) 0x48, (byte) 1, "シャチーン", "ｼｬﾁｰﾝ", MonsterTypeCode.AQUATIC, "回復", "水に入るHP"),
    CODE_0x48_2(226, (byte) 0x48, (byte) 2, "シャチーダ", "ｼｬﾁｰﾀﾞ", MonsterTypeCode.AQUATIC, "回復", "水に入るHP"),
    CODE_0x48_3(227, (byte) 0x48, (byte) 3, "シャチオーン", "ｼｬﾁｵｰﾝ", MonsterTypeCode.AQUATIC, "回復", "水に入るHP"),
    CODE_0x49_1(228, (byte) 0x49, (byte) 1, "水龍", "水龍", MonsterTypeCode.AQUATIC, "固定ダメ", ""),
    CODE_0x49_2(229, (byte) 0x49, (byte) 2, "海龍", "海龍", MonsterTypeCode.AQUATIC, "固定ダメ", ""),
    CODE_0x49_3(230, (byte) 0x49, (byte) 3, "水神龍", "水神龍", MonsterTypeCode.AQUATIC, "固定ダメ", ""),
    CODE_0x4A_1(231, (byte) 0x4A, (byte) 1, "オトト兵", "ｵﾄﾄ", MonsterTypeCode.AQUATIC, "", ""),
    CODE_0x4A_2(232, (byte) 0x4A, (byte) 2, "オトト軍曹", "ｵﾄ軍曹", MonsterTypeCode.AQUATIC, "回復", "水に入るHP"),
    CODE_0x4A_3(233, (byte) 0x4A, (byte) 3, "オトト大将", "ｵﾄ大将", MonsterTypeCode.AQUATIC, "回復", "水に入るHP"),
    CODE_0x4A_4(234, (byte) 0x4A, (byte) 4, "オトトげんすい", "ｵﾄ元帥", MonsterTypeCode.AQUATIC, "回復", "水に入るHP"),
    CODE_0x4B_1(235, (byte) 0x4B, (byte) 1, "ゴーレム", "ｺﾞｰﾚﾑ", MonsterTypeCode.CYCLOPS, "", ""),
    CODE_0x4B_2(236, (byte) 0x4B, (byte) 2, "ストーンゴーレム", "石ｺﾞﾚﾑ", MonsterTypeCode.CYCLOPS, "", ""),
    CODE_0x4B_3(237, (byte) 0x4B, (byte) 3, "マグマゴーレム", "ﾏｸﾞﾏｺﾞﾚ", MonsterTypeCode.CYCLOPS, "", ""),
    CODE_0x4C_1(238, (byte) 0x4C, (byte) 1, "ヤミキチ", "ﾔﾐｷﾁ", MonsterTypeCode.GHOST, "", ""),
    CODE_0x4C_2(239, (byte) 0x4C, (byte) 2, "ワルキチ", "ﾜﾙｷﾁ", MonsterTypeCode.GHOST, "", ""),
    CODE_0x4C_3(240, (byte) 0x4C, (byte) 3, "ズルキチ", "ｽﾞﾙｷﾁ", MonsterTypeCode.GHOST, "", ""),
    CODE_0x4D_1(241, (byte) 0x4D, (byte) 1, "毒サソリ", "毒ｻｿﾘ", MonsterTypeCode.DRAIN, "", ""),
    CODE_0x4D_2(242, (byte) 0x4D, (byte) 2, "鬼サソリ", "鬼ｻｿﾘ", MonsterTypeCode.DRAIN, "", ""),
    CODE_0x4D_3(243, (byte) 0x4D, (byte) 3, "しびれサソリ", "ｼﾋﾞﾚｻｿﾘ", MonsterTypeCode.DRAIN, "", ""),
    CODE_0x4E_1(244, (byte) 0x4E, (byte) 1, "ボーンドラゴン", "ﾎﾞｰﾝ", MonsterTypeCode.GHOST, "", ""),
    CODE_0x4E_2(245, (byte) 0x4E, (byte) 2, "スカルドラゴン", "ｽｶﾙ", MonsterTypeCode.GHOST, "", ""),
    CODE_0x4E_3(246, (byte) 0x4E, (byte) 3, "ガルムドラゴン", "ｶﾞﾙﾑ", MonsterTypeCode.GHOST, "", ""),
    CODE_0x4F_1(247, (byte) 0x4F, (byte) 1, "岩獣ズドン", "ｽﾞﾄﾞﾝ", MonsterTypeCode.NORMAL, "", "固定ダメ"),
    CODE_0x4F_2(248, (byte) 0x4F, (byte) 2, "岩獣ガガン", "ｶﾞｶﾞﾝ", MonsterTypeCode.NORMAL, "壊れる壁", "固定ダメ"),
    CODE_0x4F_3(249, (byte) 0x4F, (byte) 3, "岩獣ドガガーン", "ﾄﾞｶﾞｶﾞｰﾝ", MonsterTypeCode.NORMAL, "壊れる壁", "固定ダメ"),
    CODE_0x50_1(250, (byte) 0x50, (byte) 1, "チビオニ", "ﾁﾋﾞｵﾆ", MonsterTypeCode.ONI, "", ""),
    CODE_0x50_2(251, (byte) 0x50, (byte) 2, "ゴツオニ", "ｺﾞﾂｵﾆ", MonsterTypeCode.ONI, "", ""),
    CODE_0x50_3(252, (byte) 0x50, (byte) 3, "ズングリオニ", "ｽﾞﾝｸﾞﾘｵﾆ", MonsterTypeCode.ONI, "", ""),
    CODE_0x51_1(253, (byte) 0x51, (byte) 1, "ヤセオニ", "ﾔｾｵﾆ", MonsterTypeCode.ONI, "", ""),
    CODE_0x51_2(254, (byte) 0x51, (byte) 2, "ヒョロオニ", "ﾋｮﾛｵﾆ", MonsterTypeCode.ONI, "", ""),
    CODE_0x51_3(255, (byte) 0x51, (byte) 3, "ガリガリオニ", "ｶﾞﾘｶﾞﾘｵﾆ", MonsterTypeCode.ONI, "", ""),
    CODE_0x52_1(256, (byte) 0x52, (byte) 1, "ヨロイグモ", "ﾖﾛｲｸﾞﾓ", MonsterTypeCode.NORMAL, "", ""),
    CODE_0x53_1(257, (byte) 0x53, (byte) 1, "女王グモ", "女王ｸﾞﾓ", MonsterTypeCode.NORMAL, "", ""),
    CODE_0x54_1(258, (byte) 0x54, (byte) 1, "アメンジャ", "ｱﾒﾝｼﾞｬ", MonsterTypeCode.AQUATIC, "投げる距離？", ""),
    CODE_0x55_1(259, (byte) 0x55, (byte) 1, "ガラハ", "ｶﾞﾗﾊ", MonsterTypeCode.ONI, "？", "？"),
    CODE_0x56_1(260, (byte) 0x56, (byte) 1, "鬼親分", "鬼親分", MonsterTypeCode.ONI, "炎ダメ", "吹き飛ばしダメ"),
    CODE_261(261, (byte) 0x57, (byte) 1, "店主", "店主", MonsterTypeCode.ONI, "", ""),
    CODE_262(262, (byte) 0x57, (byte) 2, "店長", "店長", MonsterTypeCode.ONI, "", ""),
    CODE_263(263, (byte) 0x57, (byte) 3, "大店長", "大店長", MonsterTypeCode.ONI, "", ""),
    CODE_264(264, (byte) 0x57, (byte) 3, "とうぞく番", "とうぞく番", MonsterTypeCode.ONI, "", ""),
    CODE_265(265, (byte) 0x57, (byte) 3, "番犬", "番犬", MonsterTypeCode.ONI, "", ""),
    CODE_266(266, (byte) 0x57, (byte) 3, "行商人", "行商人", MonsterTypeCode.ONI, "", ""),
    CODE_267(267, (byte) 0x57, (byte) 3, "おしうり", "おしうり", MonsterTypeCode.ONI, "", ""),
    CODE_268(268, (byte) 0x57, (byte) 3, "？", "？", MonsterTypeCode.ONI, "", ""),
    CODE_269(269, (byte) 0x57, (byte) 3, "土人形【並】", "土人形【並】", MonsterTypeCode.ONI, "", ""),
    CODE_270(270, (byte) 0x57, (byte) 3, "土人形【良】", "土人形【良】", MonsterTypeCode.ONI, "", ""),
    CODE_271(271, (byte) 0x57, (byte) 3, "土人形【優】", "土人形【優】", MonsterTypeCode.ONI, "", ""),
    CODE_272(272, (byte) 0x57, (byte) 3, "鬼木偶", "鬼木偶", MonsterTypeCode.ONI, "", ""),
    CODE_273(273, (byte) 0x57, (byte) 3, "鬼木偶その2", "鬼木偶その2", MonsterTypeCode.ONI, "", ""),
    CODE_274(274, (byte) 0x57, (byte) 3, "シュテン村の子", "シュテン村の子", MonsterTypeCode.ONI, "", ""),
    CODE_275(275, (byte) 0x57, (byte) 3, "シュテン村の子？", "シュテン村の子？", MonsterTypeCode.ONI, "", ""),
    CODE_276(276, (byte) 0x57, (byte) 3, "シュテン村の子？", "シュテン村の子？", MonsterTypeCode.ONI, "", ""),
    CODE_277(277, (byte) 0x57, (byte) 3, "シュテン村の子？", "シュテン村の子？", MonsterTypeCode.ONI, "", ""),
    CODE_278(278, (byte) 0x57, (byte) 3, "シュテン村の子？", "シュテン村の子？", MonsterTypeCode.ONI, "", ""),

    ;

    private final int totalNumber;
    private final byte code;
    private final byte level;
    private final String name;
    private final String shortName;
    private final MonsterTypeCode monsterTypeCode;
    private final String aInfo;
    private final String bInfo;

    MonsterCode(int totalNumber, byte code, byte level, String name, String shortName, MonsterTypeCode monsterTypeCode, String aInfo, String bInfo) {
        this.totalNumber = totalNumber;
        this.code = code;
        this.level = level;
        this.name = name;
        this.shortName = shortName;
        this.monsterTypeCode = monsterTypeCode;
        this.aInfo = aInfo;
        this.bInfo = bInfo;
    }

    public int getTotalNumber() {
        return totalNumber;
    }

    public byte getCode() {
        return code;
    }

    public byte getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }

    public MonsterTypeCode getMonsterTypeCode() {
        return monsterTypeCode;
    }

    public String getaInfo() {
        return aInfo;
    }

    public String getbInfo() {
        return bInfo;
    }

    public static final EnumReverseLookup<MonsterCode, Byte> byCode =
            new EnumReverseLookup<>(MonsterCode.class, MonsterCode::getCode);

    public static MonsterCode getMonsterCode(byte code, byte level) {
        for (MonsterCode monsterCodeTemp : MonsterCode.values()) {
            if (monsterCodeTemp.getCode() == code) {
                if (monsterCodeTemp.getLevel() == level) {
                    return monsterCodeTemp;
                }
            }
        }
        return null;
    }

    public static MonsterCode getMonsterCode(int totalNumber) {
        for (MonsterCode monsterCodeTemp : MonsterCode.values()) {
            if (monsterCodeTemp.getTotalNumber() == totalNumber) {
                return monsterCodeTemp;
            }
        }
        return null;
    }

}

