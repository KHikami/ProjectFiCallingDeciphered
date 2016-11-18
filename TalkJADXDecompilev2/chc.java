package defpackage;

import android.text.TextUtils;
import java.util.Comparator;

final class chc implements Comparator<bpd> {
    final /* synthetic */ cgy a;

    chc(cgy cgy) {
        this.a = cgy;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        bpd bpd = (bpd) obj;
        bpd bpd2 = (bpd) obj2;
        edk edk = bpd.h;
        edk edk2 = bpd2.h;
        if (!TextUtils.isEmpty(edk.b()) && TextUtils.isEmpty(edk2.b())) {
            return -1;
        }
        if (TextUtils.isEmpty(edk.b()) && !TextUtils.isEmpty(edk2.b())) {
            return 1;
        }
        if (TextUtils.isEmpty(bpd.e) || TextUtils.isEmpty(bpd2.e)) {
            return 0;
        }
        bls bls = bpd.i;
        bls bls2 = bpd2.i;
        if (bls == null && bls2 != null) {
            return 1;
        }
        if (bls == null || bls2 != null) {
            return bpd.e.compareTo(bpd2.e);
        }
        return -1;
    }
}
