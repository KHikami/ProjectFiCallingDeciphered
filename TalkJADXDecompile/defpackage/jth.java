package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: jth */
public final class jth {
    private final List<jtg> a;

    public jth(String[] strArr, int[] iArr) {
        this.a = new ArrayList();
        for (int i = 0; i < strArr.length; i++) {
            boolean z;
            if (iArr[i] == 0) {
                z = true;
            } else {
                z = false;
            }
            this.a.add(new jtg(strArr[i], z));
        }
    }

    public List<jtg> a() {
        return Collections.unmodifiableList(this.a);
    }
}
