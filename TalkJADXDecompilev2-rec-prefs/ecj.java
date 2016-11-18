package p000;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ecj {
    private static Map<String, Integer> f11110a;
    private static String f11111b;
    public ear f11112p;
    public fvd f11113q;
    public String f11114r;
    public String f11115s;

    ecj() {
    }

    static String m13472a(String str, String str2, ear ear, int i) {
        Object obj = null;
        if (!TextUtils.equals(f11111b, ear.f11061a)) {
            List<edk> H = new blo(gwb.m1400H(), i).m5916H(ear.f11061a);
            Map hashMap = new HashMap();
            for (edk edk : H) {
                CharSequence charSequence = edk.f11217f;
                if (!(bkq.m5685c(gwb.m1400H(), i).m13608a(edk.f11213b) || TextUtils.isEmpty(charSequence))) {
                    int a;
                    if (hashMap.containsKey(charSequence)) {
                        a = gwb.m1507a((Integer) hashMap.get(charSequence));
                    } else {
                        a = 0;
                    }
                    hashMap.put(charSequence, Integer.valueOf(a + 1));
                }
            }
            f11110a = hashMap;
            f11111b = ear.f11061a;
        }
        Map map = f11110a;
        if (!(map == null || str == null || gwb.m1507a((Integer) map.get(str)) <= 1)) {
            obj = 1;
        }
        return obj != null ? str2 : str;
    }
}
