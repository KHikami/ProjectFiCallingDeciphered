package p000;

final class djf implements Runnable {
    final /* synthetic */ djd f9941a;

    djf(djd djd) {
        this.f9941a = djd;
    }

    public void run() {
        if (this.f9941a.m12054m()) {
            iry l = this.f9941a.f9922b.m11720l();
            if (l != null) {
                glk.m17979c("Babel_calls", "Disabling camera because the earpiece is on.", new Object[0]);
                l.m23059a(false);
            }
        }
    }
}
