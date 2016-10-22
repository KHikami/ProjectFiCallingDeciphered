package defpackage;

import android.content.SharedPreferences.Editor;

/* renamed from: jdh */
public final class jdh implements jdi {
    boolean a;

    public jdh(boolean z) {
        this.a = z;
    }

    public Object a(Object obj) {
        return Boolean.valueOf(this.a);
    }

    public void a(Editor editor, String str) {
        editor.putBoolean(str, this.a);
    }
}
