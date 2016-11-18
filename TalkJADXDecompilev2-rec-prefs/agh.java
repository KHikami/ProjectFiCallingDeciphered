package p000;

import android.database.Cursor;

public class agh {
    boolean f602a;
    boolean f603b;
    Cursor f604c;
    int f605d;
    int f606e;
    public CharSequence f607f;

    public agh(boolean z, boolean z2) {
        this.f602a = z;
        this.f603b = z2;
    }

    public agh(boolean z, boolean z2, byte b) {
        this(false, false);
    }

    public void m1063a(CharSequence charSequence) {
        this.f607f = charSequence;
    }

    public CharSequence m1062a() {
        return this.f607f;
    }
}
