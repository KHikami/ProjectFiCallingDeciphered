final class fzm implements Runnable {
    final boolean a;
    private final bko b;
    private boolean c;
    private fzb d;

    public fzm(bko bko, boolean z) {
        this.b = bko;
        this.a = z;
        this.c = false;
        this.d = null;
    }

    public void a() {
        synchronized (this) {
            this.c = true;
            if (this.d != null) {
                this.d.h = true;
            }
        }
    }

    public void run() {
        try {
            long a;
            blo blo = new blo(gwb.H(), this.b.g());
            if (!this.a) {
                a = ((jcf) jyn.a(gwb.H(), jcf.class)).a(this.b.g()).a("sms_last_sync_time_millis", -1);
            } else if (((jcf) jyn.a(gwb.H(), jcf.class)).a(this.b.g()).a("sms_no_full_sync_till_millis", -1) > glj.a()) {
                if (fzb.a) {
                    new StringBuilder(59).append("SmsSyncManager A#").append(this.b.g()).append(": task can not be scheduled yet");
                }
                fzb.a(this.b.a(), this);
                return;
            } else {
                a = -1;
            }
            synchronized (this) {
                if (this.c) {
                    glk.c("Babel_SMS", "SmsSyncManager A#" + this.b.g() + ": task aborted", new Object[0]);
                    fzb.a(this.b.a(), this);
                    return;
                }
                this.d = new fzb(blo, a, this.a);
                int b = this.d.b();
                if (b < 0) {
                    fzb.a(this.b.a(), this);
                    return;
                }
                if (this.a) {
                    ((jcf) jyn.a(gwb.H(), jcf.class)).b(this.b.g()).b("sms_last_full_sync_time_millis", glj.a()).d();
                }
                if (!fzb.a(blo)) {
                    if (this.a && b == 0) {
                        glk.e("Babel_SMS", "SmsSyncManager A#" + this.b.g() + ": even after full sync we are still not in sync", new Object[0]);
                        ((jcf) jyn.a(gwb.H(), jcf.class)).b(this.b.g()).b("sms_no_full_sync_till_millis", glj.a() + fzb.e).d();
                    } else {
                        fzb.a(this.b, true, 10000);
                    }
                }
                fzb.a(this.b.a(), this);
            }
        } catch (Throwable th) {
            fzb.a(this.b.a(), this);
        }
    }
}
