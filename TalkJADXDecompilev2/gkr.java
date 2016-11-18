package defpackage;

import java.util.HashSet;
import java.util.Iterator;

public final class gkr extends HashSet<edo> {
    private static final long serialVersionUID = 1;

    public boolean contains(Object obj) {
        if (obj == null || !(obj instanceof edo)) {
            return false;
        }
        edo edo = (edo) obj;
        Iterator it = iterator();
        while (it.hasNext()) {
            if (((edo) it.next()).a(edo)) {
                return true;
            }
        }
        return false;
    }

    public boolean remove(Object obj) {
        if (obj == null || !(obj instanceof edo)) {
            return false;
        }
        Object obj2;
        edo edo = (edo) obj;
        Iterator it = iterator();
        while (it.hasNext()) {
            obj2 = (edo) it.next();
            if (edo.a((edo) obj2)) {
                break;
            }
        }
        obj2 = null;
        return obj2 != null ? super.remove(obj2) : false;
    }
}
