package p000;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class apo<DataType, ResourceType, Transcode> {
    private final Class<DataType> f2068a;
    private final List<? extends aoa<DataType, ResourceType>> f2069b;
    private final ayc<ResourceType, Transcode> f2070c;
    private final ll<List<Exception>> f2071d;
    private final String f2072e;

    public apo(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends aoa<DataType, ResourceType>> list, ayc<ResourceType, Transcode> ayc_ResourceType__Transcode, ll<List<Exception>> llVar) {
        this.f2068a = cls;
        this.f2069b = list;
        this.f2070c = ayc_ResourceType__Transcode;
        this.f2071d = llVar;
        String valueOf = String.valueOf(cls.getSimpleName());
        String valueOf2 = String.valueOf(cls2.getSimpleName());
        String valueOf3 = String.valueOf(cls3.getSimpleName());
        this.f2072e = new StringBuilder(((String.valueOf(valueOf).length() + 23) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("Failed DecodePath{").append(valueOf).append("->").append(valueOf2).append("->").append(valueOf3).append("}").toString();
    }

    public aqr<Transcode> m3669a(aog<DataType> aog_DataType, int i, int i2, anz anz, app<ResourceType> app_ResourceType) {
        return this.f2070c.mo408a(app_ResourceType.m3671a(m3667a(aog_DataType, i, i2, anz)));
    }

    private aqr<ResourceType> m3667a(aog<DataType> aog_DataType, int i, int i2, anz anz) {
        List list = (List) this.f2071d.mo436a();
        try {
            aqr<ResourceType> a = m3668a((aog) aog_DataType, i, i2, anz, list);
            return a;
        } finally {
            this.f2071d.mo437a(list);
        }
    }

    private aqr<ResourceType> m3668a(aog<DataType> aog_DataType, int i, int i2, anz anz, List<Exception> list) {
        aqr<ResourceType> aqr_ResourceType = null;
        int size = this.f2069b.size();
        for (int i3 = 0; i3 < size; i3++) {
            aoa aoa = (aoa) this.f2069b.get(i3);
            try {
                aqr<ResourceType> a;
                if (aoa.mo395a(aog_DataType.mo317a(), anz)) {
                    a = aoa.mo394a(aog_DataType.mo317a(), i, i2, anz);
                } else {
                    a = aqr_ResourceType;
                }
                aqr_ResourceType = a;
            } catch (IOException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    String valueOf = String.valueOf(aoa);
                    new StringBuilder(String.valueOf(valueOf).length() + 26).append("Failed to decode data for ").append(valueOf);
                }
                list.add(e);
            }
            if (aqr_ResourceType != null) {
                break;
            }
        }
        if (aqr_ResourceType != null) {
            return aqr_ResourceType;
        }
        throw new aqm(this.f2072e, new ArrayList(list));
    }

    public String toString() {
        String valueOf = String.valueOf(this.f2068a);
        String valueOf2 = String.valueOf(this.f2069b);
        String valueOf3 = String.valueOf(this.f2070c);
        return new StringBuilder(((String.valueOf(valueOf).length() + 47) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("DecodePath{ dataClass=").append(valueOf).append(", decoders=").append(valueOf2).append(", transcoder=").append(valueOf3).append("}").toString();
    }
}
