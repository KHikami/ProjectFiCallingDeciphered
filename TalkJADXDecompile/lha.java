import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class lha extends PhantomReference<Object> implements Runnable {
    static final Set<mtt<?>> a;
    final mtt<?> b;

    static {
        a = Collections.synchronizedSet(new HashSet());
    }

    lha(Object obj, ReferenceQueue<Object> referenceQueue, mtt<?> mtt_) {
        super(obj, referenceQueue);
        this.b = mtt_;
        a.add(mtt_);
    }

    public void run() {
        a.remove(this.b);
    }
}
