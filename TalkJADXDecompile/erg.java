final class erg implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ erf b;

    erg(erf erf, int i) {
        this.b = erf;
        this.a = i;
    }

    public void run() {
        for (int size = this.b.c.size() - 1; size >= 0; size--) {
            erh erh = (erh) this.b.c.get(size);
            if ((this.a & erh.a) != 0) {
                erl erl = erh.b;
                String str = this.b.a;
                erl.a(this.b.b);
            }
        }
    }
}
