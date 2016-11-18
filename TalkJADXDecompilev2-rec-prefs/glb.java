package p000;

final class glb implements Runnable {
    final /* synthetic */ gla f15535a;

    glb(gla gla) {
        this.f15535a = gla;
    }

    public void run() {
        for (glc d : this.f15535a.f15533d) {
            d.mo1665d();
        }
        gla.f15531b.postDelayed(this.f15535a.f15534e, gla.f15530a);
    }
}
