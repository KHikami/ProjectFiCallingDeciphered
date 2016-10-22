package defpackage;

/* renamed from: glb */
final class glb implements Runnable {
    final /* synthetic */ gla a;

    glb(gla gla) {
        this.a = gla;
    }

    public void run() {
        for (glc d : this.a.d) {
            d.d();
        }
        gla.b.postDelayed(this.a.e, gla.a);
    }
}
