package p000;

import android.content.SharedPreferences.Editor;

public final class jdj implements jdi {
    float f19897a;

    public jdj(float f) {
        this.f19897a = f;
    }

    public Object mo3474a(Object obj) {
        return Float.valueOf(this.f19897a);
    }

    public void mo3475a(Editor editor, String str) {
        editor.putFloat(str, this.f19897a);
    }
}
