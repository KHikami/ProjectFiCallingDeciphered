package p000;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ehk {
    final /* synthetic */ eft f11500a;

    public void m13923a(Map<egi, List<bjg>> map) {
        Map linkedHashMap = new LinkedHashMap();
        for (Entry entry : map.entrySet()) {
            egi egi = (egi) entry.getKey();
            List list = (List) entry.getValue();
            switch (efw.f11394a[egi.mo1872a().ordinal()]) {
                case 1:
                    linkedHashMap.put(dvr.COMBINED, list);
                    break;
                case 2:
                    linkedHashMap.put(dvr.DOMAIN, list);
                    break;
                case 4:
                    linkedHashMap.put(dvr.HIGH_AFFINITY, list);
                    break;
                default:
                    break;
            }
        }
        this.f11500a.f11390h.mo1725a(this.f11500a.context, linkedHashMap);
    }

    ehk(eft eft) {
        this.f11500a = eft;
    }
}
