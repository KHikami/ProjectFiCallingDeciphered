package p000;

final class fzm implements Runnable {
    final boolean f14478a;
    private final bko f14479b;
    private boolean f14480c = false;
    private fzb f14481d = null;

    public fzm(bko bko, boolean z) {
        this.f14479b = bko;
        this.f14478a = z;
    }

    public void m16701a() {
        synchronized (this) {
            this.f14480c = true;
            if (this.f14481d != null) {
                this.f14481d.f14435h = true;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        try {
            long a;
            blo blo = new blo(gwb.m1400H(), this.f14479b.m5638g());
            if (!this.f14478a) {
                a = ((jcf) jyn.m25426a(gwb.m1400H(), jcf.class)).mo3456a(this.f14479b.m5638g()).mo3434a("sms_last_sync_time_millis", -1);
            } else if (((jcf) jyn.m25426a(gwb.m1400H(), jcf.class)).mo3456a(this.f14479b.m5638g()).mo3434a("sms_no_full_sync_till_millis", -1) > glj.m17956a()) {
                if (fzb.f14418a) {
                    new StringBuilder(59).append("SmsSyncManager A#").append(this.f14479b.m5638g()).append(": task can not be scheduled yet");
                }
                fzb.m16672a(this.f14479b.m5629a(), this);
                return;
            } else {
                a = -1;
            }
            synchronized (this) {
                if (this.f14480c) {
                    glk.m17979c("Babel_SMS", "SmsSyncManager A#" + this.f14479b.m5638g() + ": task aborted", new Object[0]);
                    fzb.m16672a(this.f14479b.m5629a(), this);
                    return;
                }
                this.f14481d = new fzb(blo, a, this.f14478a);
            }
        } catch (Throwable th) {
            fzb.m16672a(this.f14479b.m5629a(), this);
        }
    }
}
