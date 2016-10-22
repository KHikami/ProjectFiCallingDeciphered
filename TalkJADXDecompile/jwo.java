import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.social.settings.PreferenceCategory;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class jwo {
    private final Context a;
    private onc<PreferenceScreen> b;
    private PreferenceScreen c;

    public jwo(Context context) {
        this.a = context;
        this.c = ((jxg) jyn.a(context, jxg.class)).b();
    }

    public jwi a(CharSequence charSequence, CharSequence charSequence2) {
        jwi jwi = new jwi(this.a);
        jwi.c(charSequence);
        jwi.b(charSequence2);
        return jwi;
    }

    public jwi a(CharSequence charSequence, CharSequence charSequence2, Intent intent) {
        jwi a = a(charSequence, charSequence2);
        a.a(intent);
        return a;
    }

    public PreferenceCategory a(CharSequence charSequence) {
        PreferenceCategory preferenceCategory = new PreferenceCategory(this.a);
        preferenceCategory.c(charSequence);
        return preferenceCategory;
    }

    public PreferenceCategory b(CharSequence charSequence) {
        jwi a = a(charSequence);
        if (this.c == null) {
            this.c = (PreferenceScreen) this.b.a();
        }
        this.c.c(a);
        return a;
    }

    public PreferenceCategory a(int i) {
        return b(this.a.getString(i));
    }

    private void a(PreferenceCategory preferenceCategory, CharSequence charSequence, Intent intent) {
        preferenceCategory.c(a(charSequence, null, intent));
    }

    public void a(PreferenceCategory preferenceCategory, int i, Intent intent) {
        a(preferenceCategory, this.a.getString(i), intent);
    }
}
