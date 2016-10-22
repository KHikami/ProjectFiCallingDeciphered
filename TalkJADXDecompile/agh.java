import android.database.Cursor;

public class agh {
    boolean a;
    boolean b;
    Cursor c;
    int d;
    int e;
    public CharSequence f;

    public agh(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public agh(boolean z, boolean z2, byte b) {
        this(false, false);
    }

    public void a(CharSequence charSequence) {
        this.f = charSequence;
    }

    public CharSequence a() {
        return this.f;
    }
}
