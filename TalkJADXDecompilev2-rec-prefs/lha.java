package p000;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class lha extends PhantomReference<Object> implements Runnable {
    static final Set<mtt<?>> f24991a = Collections.synchronizedSet(new HashSet());
    final mtt<?> f24992b;

    lha(Object obj, ReferenceQueue<Object> referenceQueue, mtt<?> mtt_) {
        super(obj, referenceQueue);
        this.f24992b = mtt_;
        f24991a.add(mtt_);
    }

    public void run() {
        f24991a.remove(this.f24992b);
    }
}
