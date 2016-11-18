package p000;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map.Entry;

class mkc implements Serializable {
    private static final long serialVersionUID = 0;
    private final Object[] f27829a;
    private final Object[] f27830b;

    mkc(mjx<?, ?> mjx___) {
        this.f27829a = new Object[mjx___.size()];
        this.f27830b = new Object[mjx___.size()];
        Iterator a = mjx___.mo3873e().mo3806a();
        int i = 0;
        while (a.hasNext()) {
            Entry entry = (Entry) a.next();
            this.f27829a[i] = entry.getKey();
            this.f27830b[i] = entry.getValue();
            i++;
        }
    }

    Object readResolve() {
        return m32348a(new mjz(this.f27829a.length));
    }

    Object m32348a(mjz<Object, Object> mjz_java_lang_Object__java_lang_Object) {
        for (int i = 0; i < this.f27829a.length; i++) {
            mjz_java_lang_Object__java_lang_Object.mo3837a(this.f27829a[i], this.f27830b[i]);
        }
        return mjz_java_lang_Object__java_lang_Object.mo3836a();
    }
}
