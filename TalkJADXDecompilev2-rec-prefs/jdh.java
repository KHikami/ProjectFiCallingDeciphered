package p000;

import android.content.SharedPreferences.Editor;

public final class jdh implements jdi {
    boolean f19896a;

    public jdh(boolean z) {
        this.f19896a = z;
    }

    public Object mo3474a(Object obj) {
        return Boolean.valueOf(this.f19896a);
    }

    public void mo3475a(Editor editor, String str) {
        editor.putBoolean(str, this.f19896a);
    }
}
