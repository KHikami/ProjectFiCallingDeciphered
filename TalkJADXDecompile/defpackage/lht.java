package defpackage;

import android.app.Activity;

/* renamed from: lht */
public final class lht implements onc {
    private final lhs a;

    public /* synthetic */ Object a() {
        return b();
    }

    public lht(lhs lhs) {
        this.a = lhs;
    }

    private Activity b() {
        return (Activity) bn.a(this.a.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
