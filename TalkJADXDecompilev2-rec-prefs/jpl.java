package p000;

public enum jpl {
    IMAGE(0),
    VIDEO(1),
    PANORAMA(2),
    ANIMATION(3);
    
    final int f20702e;

    public static jpl m24930a(int i) {
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
        this.f20702e = i;
    }
}
