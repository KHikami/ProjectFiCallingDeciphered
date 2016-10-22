package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: ehk */
public class ehk {
    final /* synthetic */ eft a;

    public void a(Map<egi, List<bjg>> map) {
        Map linkedHashMap = new LinkedHashMap();
        for (Entry entry : map.entrySet()) {
            egi egi = (egi) entry.getKey();
            List list = (List) entry.getValue();
            switch (efw.a[egi.a().ordinal()]) {
                case wi.j /*1*/:
                    linkedHashMap.put(dvr.COMBINED, list);
                    break;
                case wi.l /*2*/:
                    linkedHashMap.put(dvr.DOMAIN, list);
                    break;
                case wi.h /*4*/:
                    linkedHashMap.put(dvr.HIGH_AFFINITY, list);
                    break;
                default:
                    break;
            }
        }
        this.a.h.a(this.a.context, linkedHashMap);
    }

    ehk(eft eft) {
        this.a = eft;
    }
}
