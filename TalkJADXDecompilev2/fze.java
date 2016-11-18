package defpackage;

final class fze implements Runnable {
    final /* synthetic */ bko a;

    fze(bko bko) {
        this.a = bko;
    }

    public void run() {
        bkq.b(gwb.H(), this.a.g(), "sms_last_sync_time_millis");
        bkq.b(gwb.H(), this.a.g(), "sms_last_full_sync_time_millis");
        bkq.b(gwb.H(), this.a.g(), "sms_no_full_sync_till_millis");
        blf.a(new blo(gwb.H(), this.a.g()));
    }
}
