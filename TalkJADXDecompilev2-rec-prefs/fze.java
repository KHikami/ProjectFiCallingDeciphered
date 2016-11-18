package p000;

final class fze implements Runnable {
    final /* synthetic */ bko f14446a;

    fze(bko bko) {
        this.f14446a = bko;
    }

    public void run() {
        bkq.m5676b(gwb.m1400H(), this.f14446a.m5638g(), "sms_last_sync_time_millis");
        bkq.m5676b(gwb.m1400H(), this.f14446a.m5638g(), "sms_last_full_sync_time_millis");
        bkq.m5676b(gwb.m1400H(), this.f14446a.m5638g(), "sms_no_full_sync_till_millis");
        blf.m5770a(new blo(gwb.m1400H(), this.f14446a.m5638g()));
    }
}
