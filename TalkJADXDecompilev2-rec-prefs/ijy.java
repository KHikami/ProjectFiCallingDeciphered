package p000;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class ijy implements ijl<lyu>, Runnable {
    private final ijd f17835a;
    private final String f17836b;
    private final ijh f17837c;
    private CountDownLatch f17838d;

    public /* synthetic */ void mo1431a(nzf nzf) {
        m22088b();
    }

    public /* synthetic */ void mo1432b(nzf nzf) {
        m22087a();
    }

    ijy(ijd ijd, String str, ijh ijh) {
        this.f17835a = ijd;
        this.f17836b = str;
        this.f17837c = ijh;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        itx.m23277a(3, "vclib", "LeaveHandler starting");
        this.f17838d = new CountDownLatch(1);
        nzf lyt = new lyt();
        lyt.f26950a = this.f17836b;
        itx.m23277a(3, "vclib", String.format("Sending leave RPC: %s", new Object[]{this.f17836b}));
        this.f17835a.mo3368c(lyt, this);
        try {
            if (!this.f17838d.await(1, TimeUnit.MINUTES)) {
                itx.m23277a(5, "vclib", "LeaveRPC not complete yet! Not waiting any further");
            }
            this.f17837c.mo3357a();
        } catch (InterruptedException e) {
            itx.m23277a(6, "vclib", "LeaveHandler was interrupted!");
        } catch (Throwable th) {
            this.f17837c.mo3357a();
        }
        itx.m23277a(3, "vclib", "LeaveHandler terminating");
    }

    private void m22087a() {
        itx.m23277a(5, "vclib", "Leave RPC failed!");
        this.f17838d.countDown();
    }

    private void m22088b() {
        itx.m23277a(3, "vclib", "Leave RPC succeeded!");
        this.f17838d.countDown();
    }
}
