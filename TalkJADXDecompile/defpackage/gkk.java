package defpackage;

import java.lang.Thread.State;

/* renamed from: gkk */
final class gkk extends Thread {
    final /* synthetic */ gki a;

    gkk(gki gki) {
        this.a = gki;
        String str = "NotificationPlayer-";
        String valueOf = String.valueOf(gki.d);
        super(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public void run() {
        while (true) {
            synchronized (this.a.b) {
                gkl gkl = (gkl) this.a.b.removeFirst();
            }
            switch (gkl.a) {
                case wi.j /*1*/:
                    this.a.a(gkl);
                    break;
                case wi.l /*2*/:
                    gki gki = this.a;
                    if (gki.f != null) {
                        long b = glj.b() - gkl.f;
                        if (b > 1000) {
                            glk.d(gki.d, "Notification stop delayed by " + b + "msecs", new Object[0]);
                        }
                        gki.f.stop();
                        gki.f.release();
                        gki.f = null;
                        if (gki.h != null) {
                            if (gkl.g) {
                                gki.a.postDelayed(new gkj(gki), 3000);
                            } else {
                                gki.h.abandonAudioFocus(null);
                                gki.h = null;
                            }
                        }
                        if (!(gki.c == null || gki.c.getThread().getState() == State.TERMINATED)) {
                            gki.c.quit();
                            break;
                        }
                    }
                    break;
            }
            synchronized (this.a.b) {
                if (this.a.b.size() == 0) {
                    this.a.e = null;
                    gki gki2 = this.a;
                    if (gki2.g != null) {
                        gki2.g.release();
                    }
                    return;
                }
            }
        }
    }
}
