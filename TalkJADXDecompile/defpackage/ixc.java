package defpackage;

import onw;
import ook;

/* renamed from: ixc */
final class ixc implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ ook b;
    final /* synthetic */ onw c;
    final /* synthetic */ ixb d;

    ixc(ixb ixb, String str, ook ook, onw onw) {
        this.d = ixb;
        this.a = str;
        this.b = ook;
        this.c = onw;
    }

    public void run() {
        this.d.b(this.a, this.b, this.c);
    }
}
