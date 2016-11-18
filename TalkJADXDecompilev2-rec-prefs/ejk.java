package p000;

import android.preference.PreferenceManager;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.hangouts.phone.BabelHomeActivity;

public final class ejk extends ph {
    final /* synthetic */ BabelHomeActivity f11645a;

    public ejk(BabelHomeActivity babelHomeActivity) {
        this.f11645a = babelHomeActivity;
    }

    public void m14009a(int i) {
        this.f11645a.m8869r();
        this.f11645a.F_();
        ((InputMethodManager) this.f11645a.getSystemService("input_method")).hideSoftInputFromWindow(this.f11645a.f6620t.getWindowToken(), 0);
        PreferenceManager.getDefaultSharedPreferences(this.f11645a).edit().putString("last_selected_tab", this.f11645a.f6620t.mo1270i().f15838d).apply();
    }
}
