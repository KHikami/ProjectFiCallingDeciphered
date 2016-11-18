package p000;

import android.content.SharedPreferences.Editor;
import java.util.Set;

public final class jdp implements jdi {
    Set<String> f19903a;

    public jdp(Set<String> set) {
        this.f19903a = set;
    }

    public Object mo3474a(Object obj) {
        return this.f19903a;
    }

    public void mo3475a(Editor editor, String str) {
        editor.putStringSet(str, this.f19903a);
    }
}
