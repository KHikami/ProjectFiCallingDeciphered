package defpackage;

import android.content.SharedPreferences.Editor;

/* renamed from: jdj */
public final class jdj implements jdi {
    float a;

    public jdj(float f) {
        this.a = f;
    }

    public Object a(Object obj) {
        return Float.valueOf(this.a);
    }

    public void a(Editor editor, String str) {
        editor.putFloat(str, this.a);
    }
}
