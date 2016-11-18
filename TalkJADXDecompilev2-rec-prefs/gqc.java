package p000;

import java.util.Collection;

final class gqc implements Runnable {
    final /* synthetic */ Collection f15895a;
    final /* synthetic */ gqb f15896b;

    gqc(gqb gqb, Collection collection) {
        this.f15896b = gqb;
        this.f15895a = collection;
    }

    public void run() {
        this.f15896b.m18292b(this.f15895a);
    }
}
