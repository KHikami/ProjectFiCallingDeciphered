import android.content.Context;

final class bkz extends fip {
    final /* synthetic */ int a;
    final /* synthetic */ Context b;
    final /* synthetic */ int c;
    final /* synthetic */ boolean d;

    bkz(int i, Context context, int i2, boolean z) {
        this.a = i;
        this.b = context;
        this.c = i2;
        this.d = z;
    }

    public final void a(int i, bko bko, fiu fiu) {
        if (i == this.a && (fiu.c() instanceof ezu)) {
            ((fit) jyn.a(this.b, fit.class)).b(this);
            ((jcf) jyn.a(this.b, jcf.class)).b(this.c).b("invite_notifications_enabled", this.d).d();
        }
    }
}
