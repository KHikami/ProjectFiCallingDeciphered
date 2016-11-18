package p000;

import android.content.SharedPreferences.Editor;

public final class jdo implements jdi {
    String f19902a;

    public jdo(String str) {
        this.f19902a = str;
    }

    public Object mo3474a(Object obj) {
        return this.f19902a;
    }

    public void mo3475a(Editor editor, String str) {
        editor.putString(str, this.f19902a);
    }
}
