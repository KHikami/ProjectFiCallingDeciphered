package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class jth {
    private final List<jtg> f21027a = new ArrayList();

    public jth(String[] strArr, int[] iArr) {
        for (int i = 0; i < strArr.length; i++) {
            boolean z;
            if (iArr[i] == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f21027a.add(new jtg(strArr[i], z));
        }
    }

    public List<jtg> m25190a() {
        return Collections.unmodifiableList(this.f21027a);
    }
}
