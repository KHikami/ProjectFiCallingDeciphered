package defpackage;

import android.content.Context;
import com.google.android.libraries.social.settings.CheckBoxPreference;

/* renamed from: jvt */
public final class jvt extends CheckBoxPreference {
    private final jvu c;

    public jvt(Context context, int i, String str, Boolean bool) {
        super(context);
        if (bool == null) {
            bool = Boolean.valueOf(false);
        }
        b((Object) bool);
        this.c = new jvu(context, i, str);
    }

    protected void a(boolean z, Object obj) {
        a(c(((Boolean) obj).booleanValue()));
    }

    protected boolean b(boolean z) {
        this.c.a(z);
        return true;
    }

    protected boolean c(boolean z) {
        return this.c.b(z).booleanValue();
    }
}
