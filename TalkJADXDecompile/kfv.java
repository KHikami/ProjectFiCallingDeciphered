import com.google.api.client.util.GenericData;
import java.util.Iterator;
import java.util.Map.Entry;

public final class kfv implements Iterator<Entry<String, Object>> {
    final /* synthetic */ GenericData a;
    private boolean b;
    private final Iterator<Entry<String, Object>> c;
    private final Iterator<Entry<String, Object>> d;

    public /* synthetic */ Object next() {
        return a();
    }

    kfv(GenericData genericData, kfq kfq) {
        this.a = genericData;
        this.c = kfq.a();
        this.d = genericData.unknownFields.entrySet().iterator();
    }

    public boolean hasNext() {
        return this.c.hasNext() || this.d.hasNext();
    }

    private Entry<String, Object> a() {
        if (!this.b) {
            if (this.c.hasNext()) {
                return (Entry) this.c.next();
            }
            this.b = true;
        }
        return (Entry) this.d.next();
    }

    public void remove() {
        if (this.b) {
            this.d.remove();
        }
        this.c.remove();
    }
}
