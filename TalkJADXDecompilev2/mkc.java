package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map.Entry;

class mkc implements Serializable {
    private static final long serialVersionUID = 0;
    private final Object[] a;
    private final Object[] b;

    mkc(mjx<?, ?> mjx___) {
        this.a = new Object[mjx___.size()];
        this.b = new Object[mjx___.size()];
        Iterator a = mjx___.e().a();
        int i = 0;
        while (a.hasNext()) {
            Entry entry = (Entry) a.next();
            this.a[i] = entry.getKey();
            this.b[i] = entry.getValue();
            i++;
        }
    }

    Object readResolve() {
        return a(new mjz(this.a.length));
    }

    Object a(mjz<Object, Object> mjz_java_lang_Object__java_lang_Object) {
        for (int i = 0; i < this.a.length; i++) {
            mjz_java_lang_Object__java_lang_Object.a(this.a[i], this.b[i]);
        }
        return mjz_java_lang_Object__java_lang_Object.a();
    }
}
