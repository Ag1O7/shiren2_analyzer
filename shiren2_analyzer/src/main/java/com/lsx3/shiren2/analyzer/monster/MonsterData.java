package com.lsx3.shiren2.analyzer.monster;

public class MonsterData {
    private int hitPoint;
    private int attackPower;
    private int defence;
    private int wakeUpRate;
    private int speed;
    private int type1;
    private int type2;
    private int experiencePoint;
    private int sleepType;
    private int dropRate;
    private int randomDrop;
    private int fixedDrop;
    private int hitPointIncrement;
    private int powerIncrement;
    private int maxLevel;
    private int icon;
    private int skillRate;
    private int skillNumber1;
    private int skillNumber2;
    private int byte24;

    public MonsterData(int hitPoint, int attackPower, int defence, int wakeUpRate, int speed, int type1, int type2, int experiencePoint, int sleepType, int dropRate, int randomDrop, int fixedDrop, int hitPointIncrement, int powerIncrement, int maxLevel, int icon, int skillRate, int skillNumber1, int skillNumber2, int byte24) {
        this.hitPoint = hitPoint;
        this.attackPower = attackPower;
        this.defence = defence;
        this.wakeUpRate = wakeUpRate;
        this.speed = speed;
        this.type1 = type1;
        this.type2 = type2;
        this.experiencePoint = experiencePoint;
        this.sleepType = sleepType;
        this.dropRate = dropRate;
        this.randomDrop = randomDrop;
        this.fixedDrop = fixedDrop;
        this.hitPointIncrement = hitPointIncrement;
        this.powerIncrement = powerIncrement;
        this.maxLevel = maxLevel;
        this.icon = icon;
        this.skillRate = skillRate;
        this.skillNumber1 = skillNumber1;
        this.skillNumber2 = skillNumber2;
        this.byte24 = byte24;
    }

    public String getRow() {
        return "|" + hitPoint
                + "|" + attackPower
                + "|" + defence
                + "|" + wakeUpRate
                + "|" + speed
                + "|" + type1
                + "|" + type2
                + "|" + experiencePoint
                + "|" + sleepType
                + "|" + dropRate
                + "|" + randomDrop
                + "|0x" + String.format("%02X", fixedDrop)
                + "|" + hitPointIncrement
                + "|" + powerIncrement
                + "|" + maxLevel
                + "|" + icon
                + "|" + skillRate
                + "|" + skillNumber1
                + "|" + skillNumber2
                + "|" + byte24
                + "|";
    }
}
