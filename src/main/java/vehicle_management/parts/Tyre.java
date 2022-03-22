package vehicle_management.parts;

public enum Tyre {

    DUNLOP(3),
    MICHELIN(5),
    SHANNER(1);

    private final int durability;

    Tyre(int durability){
        this.durability = durability;

    }
}
