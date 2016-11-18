package defpackage;

public enum jpl {
    IMAGE(0),
    VIDEO(1),
    PANORAMA(2),
    ANIMATION(3);
    
    final int e;

    public static jpl a(int i) {
        switch (i) {
            case 0:
                return IMAGE;
            case 1:
                return VIDEO;
            case 2:
                return PANORAMA;
            case 3:
                return ANIMATION;
            default:
                return null;
        }
    }

    private jpl(int i) {
        this.e = i;
    }
}
