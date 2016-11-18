package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.social.settings.PreferenceCategory;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class jwo {
    private final Context f21162a;
    private onc<PreferenceScreen> f21163b;
    private PreferenceScreen f21164c;

    public jwo(Context context) {
        this.f21162a = context;
        this.f21164c = ((jxg) jyn.m25426a(context, jxg.class)).mo3625b();
    }

    public jwi m25343a(CharSequence charSequence, CharSequence charSequence2) {
        jwi jwi = new jwi(this.f21162a);
        jwi.m5131c(charSequence);
        jwi.mo2102b(charSequence2);
        return jwi;
    }

    public jwi m25344a(CharSequence charSequence, CharSequence charSequence2, Intent intent) {
        jwi a = m25343a(charSequence, charSequence2);
        a.m5117a(intent);
        return a;
    }

    public PreferenceCategory m25342a(CharSequence charSequence) {
        PreferenceCategory preferenceCategory = new PreferenceCategory(this.f21162a);
        preferenceCategory.m5131c(charSequence);
        return preferenceCategory;
    }

    public PreferenceCategory m25346b(CharSequence charSequence) {
        jwi a = m25342a(charSequence);
        if (this.f21164c == null) {
            this.f21164c = (PreferenceScreen) this.f21163b.mo1297a();
        }
        this.f21164c.m10483c(a);
        return a;
    }

    public PreferenceCategory m25341a(int i) {
        return m25346b(this.f21162a.getString(i));
    }

    private void m25340a(PreferenceCategory preferenceCategory, CharSequence charSequence, Intent intent) {
        preferenceCategory.m10483c(m25344a(charSequence, null, intent));
    }

    public void m25345a(PreferenceCategory preferenceCategory, int i, Intent intent) {
        m25340a(preferenceCategory, this.f21162a.getString(i), intent);
    }
}
