package defpackage;

import android.content.SharedPreferences.Editor;

/* renamed from: jdo */
public final class jdo implements jdi {
    String a;

    public jdo(String str) {
        this.a = str;
    }

    public Object a(Object obj) {
        return this.a;
    }

    public void a(Editor editor, String str) {
        editor.putString(str, this.a);
    }
}
