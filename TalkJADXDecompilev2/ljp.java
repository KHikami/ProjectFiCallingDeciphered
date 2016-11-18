package defpackage;

import android.content.DialogInterface.OnClickListener;
import java.util.Set;

public final class ljp {
    private final ljt a;
    private final ljm b;

    ljp(ljt ljt, Set<ljm> set) {
        this.a = ljt;
        this.b = ljm.a(set);
    }

    public OnClickListener a(OnClickListener onClickListener, String str) {
        return new ljq(this, str, onClickListener);
    }

    public void a(String str) {
        this.a.a(str, this.b);
    }

    public void b(String str) {
        a(str);
    }

    public void a(Class<?> cls, String str) {
        String valueOf = String.valueOf(cls.getSimpleName());
        a(new StringBuilder((String.valueOf(valueOf).length() + 2) + String.valueOf(str).length()).append(valueOf).append(": ").append(str).toString());
    }

    void c(String str) {
        a(str);
    }
}
