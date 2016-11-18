package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class jdz implements jdy {
    private final jcf f19920a;
    private final jcr f19921b;

    jdz(Context context) {
        this.f19920a = (jcf) jyn.m25426a(context, jcf.class);
        this.f19921b = (jcr) jyn.m25426a(context, jcr.class);
    }

    public synchronized void mo3479a() {
        int i = 0;
        synchronized (this) {
            Map hashMap = new HashMap();
            for (jco jco : this.f19921b.mo3478a()) {
                hashMap.put(jco.m23898a(), Integer.valueOf(jco.m23899b()));
            }
            List arrayList = new ArrayList();
            for (Integer intValue : this.f19920a.mo3453a()) {
                int intValue2 = intValue.intValue();
                jch a = this.f19920a.mo3456a(intValue2);
                if (a.mo3440b("effective_gaia_id") == null) {
                    String b = a.mo3440b("account_name");
                    if (!hashMap.containsKey(b)) {
                        arrayList.add(Integer.valueOf(intValue2));
                        m24015a(intValue2, arrayList);
                    } else if (((Integer) hashMap.get(b)).intValue() != a.mo3433a("device_index", -1)) {
                        this.f19920a.mo3464b(intValue2).m23877b("device_index", ((Integer) hashMap.get(b)).intValue()).m23891d();
                    }
                }
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                this.f19920a.mo3471f(((Integer) obj).intValue());
            }
        }
    }

    private void m24015a(int i, List<Integer> list) {
        jch a = this.f19920a.mo3456a(i);
        if (!a.mo3448c("is_managed_account")) {
            String b = a.mo3440b("account_name");
            List a2 = this.f19920a.mo3453a();
            int size = a2.size();
            for (int i2 = 0; i2 < size; i2++) {
                Integer num = (Integer) a2.get(i2);
                jch a3 = this.f19920a.mo3456a(num.intValue());
                if (a3.mo3448c("is_managed_account") && a3.mo3440b("account_name").equals(b)) {
                    list.add(num);
                }
            }
        }
    }
}
