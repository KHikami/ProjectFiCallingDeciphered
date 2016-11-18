package p000;

import com.google.api.client.util.GenericData;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

public final class kfw extends AbstractSet<Entry<String, Object>> {
    final /* synthetic */ GenericData f21623a;
    private final kfq f21624b;

    public kfw(GenericData genericData) {
        this.f21623a = genericData;
        this.f21624b = new kfn(genericData, genericData.classInfo.f21564a).m25730a();
    }

    public Iterator<Entry<String, Object>> iterator() {
        return new kfv(this.f21623a, this.f21624b);
    }

    public int size() {
        return this.f21623a.unknownFields.size() + this.f21624b.size();
    }

    public void clear() {
        this.f21623a.unknownFields.clear();
        this.f21624b.clear();
    }
}
