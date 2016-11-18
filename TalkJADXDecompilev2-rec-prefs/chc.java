package p000;

import android.text.TextUtils;
import java.util.Comparator;

final class chc implements Comparator<bpd> {
    final /* synthetic */ cgy f5310a;

    chc(cgy cgy) {
        this.f5310a = cgy;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        bpd bpd = (bpd) obj;
        bpd bpd2 = (bpd) obj2;
        edk edk = bpd.f4153h;
        edk edk2 = bpd2.f4153h;
        if (!TextUtils.isEmpty(edk.m13590b()) && TextUtils.isEmpty(edk2.m13590b())) {
            return -1;
        }
        if (TextUtils.isEmpty(edk.m13590b()) && !TextUtils.isEmpty(edk2.m13590b())) {
            return 1;
        }
        if (TextUtils.isEmpty(bpd.f4150e) || TextUtils.isEmpty(bpd2.f4150e)) {
            return 0;
        }
        bls bls = bpd.f4154i;
        bls bls2 = bpd2.f4154i;
        if (bls == null && bls2 != null) {
            return 1;
        }
        if (bls == null || bls2 != null) {
            return bpd.f4150e.compareTo(bpd2.f4150e);
        }
        return -1;
    }
}
