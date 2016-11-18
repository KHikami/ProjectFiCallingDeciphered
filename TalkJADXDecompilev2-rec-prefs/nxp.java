package p000;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

final class nxp extends nxo<FieldDescriptorType, Object> {
    nxp(int i) {
        super(i);
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        return super.m37035a((nwh) obj, obj2);
    }

    public void mo4071a() {
        if (!m37038b()) {
            for (int i = 0; i < m37039c(); i++) {
                Entry b = m37037b(i);
                if (((nwh) b.getKey()).d()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
            }
            for (Entry entry : m37042e()) {
                if (((nwh) entry.getKey()).d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo4071a();
    }
}
