package defpackage;

import android.widget.Toast;

/* compiled from: PG */
/* renamed from: adb */
final class adb implements Runnable {
    private /* synthetic */ acy a;

    adb(acy acy) {
        this.a = acy;
    }

    public final void run() {
        Toast.makeText(this.a.getContext(), buf.gl, 0).show();
    }
}
