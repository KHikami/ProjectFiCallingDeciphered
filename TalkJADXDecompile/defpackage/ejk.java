package defpackage;

import android.preference.PreferenceManager;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.hangouts.phone.BabelHomeActivity;
import ph;

/* renamed from: ejk */
public final class ejk extends ph {
    final /* synthetic */ BabelHomeActivity a;

    public ejk(BabelHomeActivity babelHomeActivity) {
        this.a = babelHomeActivity;
    }

    public void a(int i) {
        this.a.r();
        this.a.F_();
        ((InputMethodManager) this.a.getSystemService("input_method")).hideSoftInputFromWindow(this.a.t.getWindowToken(), 0);
        PreferenceManager.getDefaultSharedPreferences(this.a).edit().putString("last_selected_tab", this.a.t.i().d).apply();
    }
}
