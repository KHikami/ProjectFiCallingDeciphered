package p000;

import android.content.Context;
import com.google.android.libraries.social.settings.CheckBoxPreference;

public final class jvt extends CheckBoxPreference {
    private final jvu f21145c;

    public jvt(Context context, int i, String str, Boolean bool) {
        super(context);
        if (bool == null) {
            bool = Boolean.valueOf(false);
        }
        m5128b((Object) bool);
        this.f21145c = new jvu(context, i, str);
    }

    protected void mo530a(boolean z, Object obj) {
        mo534a(mo3621c(((Boolean) obj).booleanValue()));
    }

    protected boolean mo3620b(boolean z) {
        this.f21145c.m25330a(z);
        return true;
    }

    protected boolean mo3621c(boolean z) {
        return this.f21145c.m25331b(z).booleanValue();
    }
}
