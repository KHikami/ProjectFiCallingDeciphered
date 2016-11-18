package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ecj {
    private static Map<String, Integer> a;
    private static String b;
    public ear p;
    public fvd q;
    public String r;
    public String s;

    ecj() {
    }

    static String a(String str, String str2, ear ear, int i) {
        Object obj = null;
        if (!TextUtils.equals(b, ear.a)) {
            List<edk> H = new blo(gwb.H(), i).H(ear.a);
            Map hashMap = new HashMap();
            for (edk edk : H) {
                CharSequence charSequence = edk.f;
                if (!(bkq.c(gwb.H(), i).a(edk.b) || TextUtils.isEmpty(charSequence))) {
                    int a;
                    if (hashMap.containsKey(charSequence)) {
                        a = gwb.a((Integer) hashMap.get(charSequence));
                    } else {
                        a = 0;
                    }
                    hashMap.put(charSequence, Integer.valueOf(a + 1));
                }
            }
            a = hashMap;
            b = ear.a;
        }
        Map map = a;
        if (!(map == null || str == null || gwb.a((Integer) map.get(str)) <= 1)) {
            obj = 1;
        }
        return obj != null ? str2 : str;
    }
}
