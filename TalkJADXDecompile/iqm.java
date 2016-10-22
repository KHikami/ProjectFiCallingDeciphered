@Deprecated
public final class iqm implements ayo {
    private final boolean a;
    private final iqo b;

    public iqm(boolean z, iqo iqo) {
        boolean z2;
        if (z || iqo == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        iil.a("Expected condition to be true", z2);
        this.a = z;
        this.b = iqo;
    }

    public boolean a() {
        return this.a;
    }
}
