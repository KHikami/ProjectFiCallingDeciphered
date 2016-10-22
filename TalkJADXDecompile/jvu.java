import android.content.Context;

public final class jvu {
    private final int a;
    private final String b;
    private final jcf c;

    public jvu(Context context, int i, String str) {
        this.c = (jcf) jyn.a(context, jcf.class);
        this.a = i;
        this.b = str;
    }

    public void a(boolean z) {
        this.c.b(this.a).b(this.b, z).d();
    }

    public Boolean b(boolean z) {
        return Boolean.valueOf(this.c.a(this.a).a(this.b, z));
    }
}
