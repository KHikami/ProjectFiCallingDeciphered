import android.util.Pair;

final class bwh implements Runnable {
    final /* synthetic */ bwn a;
    final /* synthetic */ bwl b;
    final /* synthetic */ bwe c;

    bwh(bwe bwe, bwn bwn, bwl bwl) {
        this.c = bwe;
        this.a = bwn;
        this.b = bwl;
    }

    public void run() {
        new Object[1][0] = this.a;
        this.c.b.b();
        for (btf b : this.a.a) {
            this.c.b.b(b);
        }
        for (Pair pair : this.a.b) {
            btf btf = (btf) pair.first;
            this.c.b.a(this.c.b.c(btf), (btf) pair.second);
        }
        this.c.b.a(this.a.c);
        if (this.b != null) {
            this.b.a();
        }
        this.c.b.c();
    }
}
