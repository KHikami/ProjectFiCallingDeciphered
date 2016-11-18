package p000;

final class erg implements Runnable {
    final /* synthetic */ int f12119a;
    final /* synthetic */ erf f12120b;

    erg(erf erf, int i) {
        this.f12120b = erf;
        this.f12119a = i;
    }

    public void run() {
        for (int size = this.f12120b.f12117c.size() - 1; size >= 0; size--) {
            erh erh = (erh) this.f12120b.f12117c.get(size);
            if ((this.f12119a & erh.f12121a) != 0) {
                erl erl = erh.f12122b;
                String str = this.f12120b.f12115a;
                erl.mo982a(this.f12120b.f12116b);
            }
        }
    }
}
