import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class jdz implements jdy {
    private final jcf a;
    private final jcr b;

    jdz(Context context) {
        this.a = (jcf) jyn.a(context, jcf.class);
        this.b = (jcr) jyn.a(context, jcr.class);
    }

    public synchronized void a() {
        int i = 0;
        synchronized (this) {
            Map hashMap = new HashMap();
            for (jco jco : this.b.a()) {
                hashMap.put(jco.a(), Integer.valueOf(jco.b()));
            }
            List arrayList = new ArrayList();
            for (Integer intValue : this.a.a()) {
                int intValue2 = intValue.intValue();
                jch a = this.a.a(intValue2);
                if (a.b("effective_gaia_id") == null) {
                    String b = a.b("account_name");
                    if (!hashMap.containsKey(b)) {
                        arrayList.add(Integer.valueOf(intValue2));
                        a(intValue2, arrayList);
                    } else if (((Integer) hashMap.get(b)).intValue() != a.a("device_index", -1)) {
                        this.a.b(intValue2).b("device_index", ((Integer) hashMap.get(b)).intValue()).d();
                    }
                }
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                this.a.f(((Integer) obj).intValue());
            }
        }
    }

    private void a(int i, List<Integer> list) {
        jch a = this.a.a(i);
        if (!a.c("is_managed_account")) {
            String b = a.b("account_name");
            List a2 = this.a.a();
            int size = a2.size();
            for (int i2 = 0; i2 < size; i2++) {
                Integer num = (Integer) a2.get(i2);
                jch a3 = this.a.a(num.intValue());
                if (a3.c("is_managed_account") && a3.b("account_name").equals(b)) {
                    list.add(num);
                }
            }
        }
    }
}
