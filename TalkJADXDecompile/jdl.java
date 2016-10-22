import android.content.SharedPreferences.Editor;

public final class jdl implements jdi {
    long a;

    public jdl(long j) {
        this.a = j;
    }

    public Object a(Object obj) {
        return Long.valueOf(this.a);
    }

    public void a(Editor editor, String str) {
        editor.putLong(str, this.a);
    }
}
