package defpackage;

/* renamed from: iol */
final class iol implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ iok b;

    iol(iok iok, Object obj) {
        this.b = iok;
        this.a = obj;
    }

    public void run() {
        this.b.p = this.a;
    }
}
