package p000;

import android.content.SharedPreferences.Editor;

public final class jdl implements jdi {
    long f19899a;

    public jdl(long j) {
        this.f19899a = j;
    }

    public Object mo3474a(Object obj) {
        return Long.valueOf(this.f19899a);
    }

    public void mo3475a(Editor editor, String str) {
        editor.putLong(str, this.f19899a);
    }
}
