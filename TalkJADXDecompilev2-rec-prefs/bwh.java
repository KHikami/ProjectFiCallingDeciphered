package p000;

import android.util.Pair;

final class bwh implements Runnable {
    final /* synthetic */ bwn f4641a;
    final /* synthetic */ bwl f4642b;
    final /* synthetic */ bwe f4643c;

    bwh(bwe bwe, bwn bwn, bwl bwl) {
        this.f4643c = bwe;
        this.f4641a = bwn;
        this.f4642b = bwl;
    }

    public void run() {
        new Object[1][0] = this.f4641a;
        this.f4643c.f4626b.b();
        for (btf b : this.f4641a.f4658a) {
            this.f4643c.f4626b.b(b);
        }
        for (Pair pair : this.f4641a.f4659b) {
            btf btf = (btf) pair.first;
            this.f4643c.f4626b.a(this.f4643c.f4626b.c(btf), (btf) pair.second);
        }
        this.f4643c.f4626b.a(this.f4641a.f4660c);
        if (this.f4642b != null) {
            this.f4642b.mo750a();
        }
        this.f4643c.f4626b.c();
    }
}
