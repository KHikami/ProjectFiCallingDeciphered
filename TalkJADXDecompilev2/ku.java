package defpackage;

import java.util.Locale;

final class ku extends ko {
    public static final ku b = new ku();

    public ku() {
        super(null);
    }

    protected boolean a() {
        if (kv.a.a(Locale.getDefault()) == 1) {
            return true;
        }
        return false;
    }
}
