package defpackage;

public abstract class ko {
    final ks a;

    protected abstract boolean a();

    public boolean a(CharSequence charSequence, int i, int i2) {
        if (charSequence == null || i2 < 0 || charSequence.length() - i2 < 0) {
            throw new IllegalArgumentException();
        } else if (this.a == null) {
            return a();
        } else {
            return b(charSequence, 0, i2);
        }
    }

    public ko(ks ksVar) {
        this.a = ksVar;
    }

    boolean b(CharSequence charSequence, int i, int i2) {
        switch (this.a.a(charSequence, i, i2)) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return a();
        }
    }
}
