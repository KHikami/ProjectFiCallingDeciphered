package defpackage;

import java.util.Collection;

final class gqc implements Runnable {
    final /* synthetic */ Collection a;
    final /* synthetic */ gqb b;

    gqc(gqb gqb, Collection collection) {
        this.b = gqb;
        this.a = collection;
    }

    public void run() {
        this.b.b(this.a);
    }
}
