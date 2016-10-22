package defpackage;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* renamed from: cwu */
class cwu {
    public Reference a(Object obj, ReferenceQueue referenceQueue) {
        return new PhantomReference(obj, referenceQueue);
    }

    cwu() {
    }
}
