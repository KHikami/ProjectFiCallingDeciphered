package defpackage;

import android.content.SharedPreferences.Editor;

/* renamed from: jdk */
public final class jdk implements jdi {
    int a;

    public jdk(int i) {
        this.a = i;
    }

    public Object a(Object obj) {
        return Integer.valueOf(this.a);
    }

    public void a(Editor editor, String str) {
        editor.putInt(str, this.a);
    }
}
