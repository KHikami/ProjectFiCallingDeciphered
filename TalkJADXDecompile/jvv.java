import android.content.Context;

public final class jvv extends jxk {
    private final jvu c;

    public jvv(Context context, int i, String str) {
        this(context, i, str, null);
    }

    public jvv(Context context, int i, String str, Boolean bool) {
        super(context);
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        b((Object) bool);
        this.c = new jvu(context, i, str);
    }

    protected void a(boolean z, Object obj) {
        a(c(gwb.b((Boolean) obj)));
    }

    protected boolean b(boolean z) {
        this.c.a(z);
        return true;
    }

    protected boolean c(boolean z) {
        return gwb.b(this.c.b(z));
    }
}
