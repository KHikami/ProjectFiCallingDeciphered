package p000;

public abstract class ko {
    final ks f22466a;

    protected abstract boolean mo3679a();

    public boolean m26751a(CharSequence charSequence, int i, int i2) {
        if (charSequence == null || i2 < 0 || charSequence.length() - i2 < 0) {
            throw new IllegalArgumentException();
        } else if (this.f22466a == null) {
            return mo3679a();
        } else {
            return m26752b(charSequence, 0, i2);
        }
    }

    public ko(ks ksVar) {
        this.f22466a = ksVar;
    }

    boolean m26752b(CharSequence charSequence, int i, int i2) {
        switch (this.f22466a.mo3678a(charSequence, i, i2)) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return mo3679a();
        }
    }
}
