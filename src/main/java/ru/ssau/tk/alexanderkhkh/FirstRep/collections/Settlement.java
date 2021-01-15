package ru.ssau.tk.alexanderkhkh.FirstRep.collections;

public class Settlement extends Location {
    private int settlement;
    private SettlementType type;

    @Override
    public String toString() {
        return "Settlement. Type: " + type + "; name: " + getName() + "; latitude: " + getLatitude() + "; longitude: " + getLongitude();
    }

    public int getSettlement() {
        return settlement;
    }

    public SettlementType getType() {
        return type;
    }

    public void setType(SettlementType type) {
        this.type = type;
    }

    public void setSettlement(int settlement) {
        this.settlement = settlement;
    }
}
