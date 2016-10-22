import android.content.Intent;

public final class fpj implements fqd {
    private static final long serialVersionUID = 1;
    private final String a;
    private final long b;
    private final String[] c;

    public fpj(lph lph) {
        this.a = lph.a.a;
        if (lph.b == null) {
            glk.e("Babel", "DeleteConversationNotification without deteleAction", new Object[0]);
            this.b = 0;
        } else {
            this.b = gwb.a(lph.b.c);
            if (gwb.a(lph.b.a) == 2) {
                this.c = lph.b.d;
                return;
            }
        }
        this.c = null;
    }

    public String a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }

    public String[] c() {
        return this.c;
    }

    public void a(int i, mfa<Intent> mfa_android_content_Intent) {
        new fes(this).a(new blo(gwb.H(), i));
    }
}
