package defpackage;

import java.util.Locale;

/* renamed from: ku */
final class ku extends ko {
    public static final ku b;

    public ku() {
        super(null);
    }

    protected boolean a() {
        if (kv.a.a(Locale.getDefault()) == 1) {
            return true;
        }
        return false;
    }

    static {
        b = new ku();
    }
}
