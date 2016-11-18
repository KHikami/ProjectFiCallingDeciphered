package p000;

import android.content.DialogInterface.OnClickListener;
import java.util.Set;

public final class ljp {
    private final ljt f25103a;
    private final ljm f25104b;

    ljp(ljt ljt, Set<ljm> set) {
        this.f25103a = ljt;
        this.f25104b = ljm.m29178a(set);
    }

    public OnClickListener m29180a(OnClickListener onClickListener, String str) {
        return new ljq(this, str, onClickListener);
    }

    public void m29182a(String str) {
        this.f25103a.mo3719a(str, this.f25104b);
    }

    public void m29183b(String str) {
        m29182a(str);
    }

    public void m29181a(Class<?> cls, String str) {
        String valueOf = String.valueOf(cls.getSimpleName());
        m29182a(new StringBuilder((String.valueOf(valueOf).length() + 2) + String.valueOf(str).length()).append(valueOf).append(": ").append(str).toString());
    }

    void m29184c(String str) {
        m29182a(str);
    }
}
