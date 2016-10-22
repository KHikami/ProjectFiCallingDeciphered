import android.content.SharedPreferences.Editor;

public final class boy {
    final long a;
    final /* synthetic */ box b;
    private final String c;

    boy(box box, String str, long j) {
        this.b = box;
        buf.n(str);
        buf.b(j > 0);
        this.c = str;
        this.a = j;
    }

    private final String e() {
        return this.c + ":start";
    }

    final void a() {
        long a = this.b.f().a();
        Editor edit = this.b.a.edit();
        edit.remove(c());
        edit.remove(d());
        edit.putLong(e(), a);
        edit.commit();
    }

    final long b() {
        return this.b.a.getLong(e(), 0);
    }

    final String c() {
        return this.c + ":count";
    }

    protected final String d() {
        return this.c + ":value";
    }
}
