package p000;

import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class cnf {
    AtomicBoolean f5701a = new AtomicBoolean(true);
    private final Context f5702b;
    private List<String> f5703c;

    cnf(Context context) {
        this.f5702b = context;
        gwb.m2214g(context).mo563a(new cng(this));
    }

    public boolean m7966a() {
        if (VERSION.SDK_INT < 19) {
            return false;
        }
        String string = Secure.getString(this.f5702b.getContentResolver(), "default_input_method");
        if (string != null) {
            boolean z;
            if (this.f5701a.compareAndSet(true, false)) {
                List list;
                Object b = gwb.m1998b(this.f5702b, "babel_allowed_emoji_imes", "com.google.android.inputmethod.latin/");
                if (TextUtils.isEmpty(b)) {
                    list = null;
                } else {
                    list = Arrays.asList(b.split(","));
                }
                this.f5703c = list;
            }
            if (this.f5703c != null) {
                for (String startsWith : this.f5703c) {
                    if (string.startsWith(startsWith)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                InputMethodSubtype currentInputMethodSubtype = ((InputMethodManager) this.f5702b.getSystemService("input_method")).getCurrentInputMethodSubtype();
                if (currentInputMethodSubtype == null) {
                    return false;
                }
                return currentInputMethodSubtype.containsExtraValueKey("EmojiCapable");
            }
        }
        return false;
    }
}
