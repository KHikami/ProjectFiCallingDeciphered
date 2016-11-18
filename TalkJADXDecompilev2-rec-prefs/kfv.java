package p000;

import com.google.api.client.util.GenericData;
import java.util.Iterator;
import java.util.Map.Entry;

public final class kfv implements Iterator<Entry<String, Object>> {
    final /* synthetic */ GenericData f21619a;
    private boolean f21620b;
    private final Iterator<Entry<String, Object>> f21621c;
    private final Iterator<Entry<String, Object>> f21622d;

    public /* synthetic */ Object next() {
        return m25759a();
    }

    kfv(GenericData genericData, kfq kfq) {
        this.f21619a = genericData;
        this.f21621c = kfq.m25733a();
        this.f21622d = genericData.unknownFields.entrySet().iterator();
    }

    public boolean hasNext() {
        return this.f21621c.hasNext() || this.f21622d.hasNext();
    }

    private Entry<String, Object> m25759a() {
        if (!this.f21620b) {
            if (this.f21621c.hasNext()) {
                return (Entry) this.f21621c.next();
            }
            this.f21620b = true;
        }
        return (Entry) this.f21622d.next();
    }

    public void remove() {
        if (this.f21620b) {
            this.f21622d.remove();
        }
        this.f21621c.remove();
    }
}
