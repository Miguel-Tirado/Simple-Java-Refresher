public enum Level {
    //enum is a list of constants
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    private int lvlNum;

    private Level(int num) {
        this.lvlNum = num;
    }

    public int getlvl(){
        return this.lvlNum;
    }

    public void setlvl(int num) {
        this.lvlNum = num;
    }

}