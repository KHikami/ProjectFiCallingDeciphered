package p000;

import java.lang.Thread.State;

final class gkk extends Thread {
    final /* synthetic */ gki f15500a;

    gkk(gki gki) {
        this.f15500a = gki;
        String str = "NotificationPlayer-";
        String valueOf = String.valueOf(gki.f15491d);
        super(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        while (true) {
            synchronized (this.f15500a.f15489b) {
                gkl gkl = (gkl) this.f15500a.f15489b.removeFirst();
            }
            switch (gkl.f15501a) {
                case 1:
                    this.f15500a.m17887a(gkl);
                    break;
                case 2:
                    gki gki = this.f15500a;
                    if (gki.f15493f != null) {
                        long b = glj.m17963b() - gkl.f15506f;
                        if (b > 1000) {
                            glk.m17981d(gki.f15491d, "Notification stop delayed by " + b + "msecs", new Object[0]);
                        }
                        gki.f15493f.stop();
                        gki.f15493f.release();
                        gki.f15493f = null;
                        if (gki.f15495h != null) {
                            if (gkl.f15507g) {
                                gki.f15488a.postDelayed(new gkj(gki), 3000);
                            } else {
                                gki.f15495h.abandonAudioFocus(null);
                                gki.f15495h = null;
                            }
                        }
                        if (!(gki.f15490c == null || gki.f15490c.getThread().getState() == State.TERMINATED)) {
                            gki.f15490c.quit();
                            break;
                        }
                    }
                    break;
            }
            synchronized (this.f15500a.f15489b) {
                if (this.f15500a.f15489b.size() == 0) {
                    this.f15500a.f15492e = null;
                    gki gki2 = this.f15500a;
                    if (gki2.f15494g != null) {
                        gki2.f15494g.release();
                    }
                }
            }
        }
    }
}
