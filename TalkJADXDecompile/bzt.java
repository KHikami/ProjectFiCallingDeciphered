import android.content.Context;

final class bzt extends jgw implements gia<bow> {
    final /* synthetic */ bzq a;
    private czd b;

    public /* synthetic */ void a(ayo ayo) {
        c();
    }

    public /* bridge */ /* synthetic */ void a(ayo ayo, Exception exception) {
        a(exception);
    }

    public bzt(bzq bzq, Context context, ed edVar) {
        this.a = bzq;
        super(context, edVar);
    }

    private void c() {
        String str = "ConversationChange : ";
        String valueOf = String.valueOf(this.a.b.a());
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        if (this.b == null || !this.b.b()) {
            new bzu(this, this.a.a.c(), this.a.a.a()).execute(new Void[0]);
            return;
        }
        this.b.a();
        this.a.b.u();
    }

    public void a(String str, String str2, String str3, boolean z) {
        this.b = new czd(this.c);
        this.b.a(str);
    }

    public void a(String str) {
        if (this.b != null) {
            this.b.a();
        }
    }

    public boolean a(jgz jgz) {
        return false;
    }

    public boolean a() {
        if (this.b != null) {
            this.b.a();
        }
        gwb.a(new bzw(this, bc.W));
        if (this.a.b.n() == 2) {
            this.a.b.d(1);
        } else if (this.a.b.n() == 1) {
            this.a.b.d(2);
        }
        return false;
    }

    private void a(Exception exception) {
        a();
    }
}
