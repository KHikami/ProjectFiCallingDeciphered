package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

final class nxp extends nxo<FieldDescriptorType, Object> {
    nxp(int i) {
        super(i);
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        return super.a((nwh) obj, obj2);
    }

    public void a() {
        if (!b()) {
            for (int i = 0; i < c(); i++) {
                Entry b = b(i);
                if (((nwh) b.getKey()).d()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
            }
            for (Entry entry : e()) {
                if (((nwh) entry.getKey()).d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
