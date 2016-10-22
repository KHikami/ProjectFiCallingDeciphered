package defpackage;

/* renamed from: jpl */
public enum jpl {
    IMAGE(0),
    VIDEO(1),
    PANORAMA(2),
    ANIMATION(3);
    
    final int e;

    public static jpl a(int i) {
        switch (i) {
            case wi.w /*0*/:
                return IMAGE;
            case wi.j /*1*/:
                return VIDEO;
            case wi.l /*2*/:
                return PANORAMA;
            case wi.z /*3*/:
                return ANIMATION;
            default:
                return null;
        }
    }

    private jpl(int i) {
        this.e = i;
    }
}
