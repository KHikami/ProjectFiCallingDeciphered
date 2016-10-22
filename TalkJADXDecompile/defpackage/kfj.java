package defpackage;

import java.util.Comparator;

/* renamed from: kfj */
final class kfj implements Comparator<String> {
    final /* synthetic */ kfi a;

    kfj(kfi kfi) {
        this.a = kfi;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        if (str == str2) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        return str2 == null ? 1 : str.compareTo(str2);
    }
}
