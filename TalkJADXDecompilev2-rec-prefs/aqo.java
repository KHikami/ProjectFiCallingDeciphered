package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class aqo<Data, ResourceType, Transcode> {
    private final Class<Data> f2150a;
    private final ll<List<Exception>> f2151b;
    private final List<? extends apo<Data, ResourceType, Transcode>> f2152c;
    private final String f2153d;

    public aqo(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<apo<Data, ResourceType, Transcode>> list, ll<List<Exception>> llVar) {
        this.f2150a = cls;
        this.f2151b = llVar;
        this.f2152c = (List) gwb.m1688a((Collection) list);
        String valueOf = String.valueOf(cls.getSimpleName());
        String valueOf2 = String.valueOf(cls2.getSimpleName());
        String valueOf3 = String.valueOf(cls3.getSimpleName());
        this.f2153d = new StringBuilder(((String.valueOf(valueOf).length() + 21) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("Failed LoadPath{").append(valueOf).append("->").append(valueOf2).append("->").append(valueOf3).append("}").toString();
    }

    public aqr<Transcode> m3752a(aog<Data> aog_Data, anz anz, int i, int i2, app<ResourceType> app_ResourceType) {
        List list = (List) this.f2151b.mo436a();
        try {
            aqr<Transcode> a = m3751a(aog_Data, anz, i, i2, app_ResourceType, list);
            return a;
        } finally {
            this.f2151b.mo437a(list);
        }
    }

    private aqr<Transcode> m3751a(aog<Data> aog_Data, anz anz, int i, int i2, app<ResourceType> app_ResourceType, List<Exception> list) {
        aqr<Transcode> a;
        int size = this.f2152c.size();
        aqr<Transcode> aqr_Transcode = null;
        int i3 = 0;
        while (i3 < size) {
            try {
                a = ((apo) this.f2152c.get(i3)).m3669a((aog) aog_Data, i, i2, anz, (app) app_ResourceType);
            } catch (aqm e) {
                list.add(e);
                a = aqr_Transcode;
            }
            if (a != null) {
                break;
            }
            i3++;
            aqr_Transcode = a;
        }
        a = aqr_Transcode;
        if (a != null) {
            return a;
        }
        throw new aqm(this.f2153d, new ArrayList(list));
    }

    public String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.f2152c.toArray(new apo[this.f2152c.size()])));
        return new StringBuilder(String.valueOf(valueOf).length() + 22).append("LoadPath{decodePaths=").append(valueOf).append("}").toString();
    }
}
