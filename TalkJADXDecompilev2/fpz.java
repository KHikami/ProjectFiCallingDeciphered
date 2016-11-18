package defpackage;

import com.google.android.apps.hangouts.serverupdate.ReceiveServerUpdateService;

final class fpz implements Runnable {
    final /* synthetic */ fpy a;

    fpz(fpy fpy) {
        this.a = fpy;
    }

    public void run() {
        ReceiveServerUpdateService.a();
    }
}
