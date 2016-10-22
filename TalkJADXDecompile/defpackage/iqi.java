package defpackage;

/* renamed from: iqi */
final class iqi implements Runnable {
    final /* synthetic */ ijj a;
    final /* synthetic */ iqh b;

    iqi(iqh iqh, ijj ijj) {
        this.b = iqh;
        this.a = ijj;
    }

    public void run() {
        if (this.b.d.contains(this.a)) {
            this.a.a();
        }
    }
}
