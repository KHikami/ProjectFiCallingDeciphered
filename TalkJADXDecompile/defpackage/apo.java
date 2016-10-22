package defpackage;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: apo */
public final class apo<DataType, ResourceType, Transcode> {
    private final Class<DataType> a;
    private final List<? extends aoa<DataType, ResourceType>> b;
    private final ayc<ResourceType, Transcode> c;
    private final ll<List<Exception>> d;
    private final String e;

    public apo(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends aoa<DataType, ResourceType>> list, ayc<ResourceType, Transcode> ayc_ResourceType__Transcode, ll<List<Exception>> llVar) {
        this.a = cls;
        this.b = list;
        this.c = ayc_ResourceType__Transcode;
        this.d = llVar;
        String valueOf = String.valueOf(cls.getSimpleName());
        String valueOf2 = String.valueOf(cls2.getSimpleName());
        String valueOf3 = String.valueOf(cls3.getSimpleName());
        this.e = new StringBuilder(((String.valueOf(valueOf).length() + 23) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("Failed DecodePath{").append(valueOf).append("->").append(valueOf2).append("->").append(valueOf3).append("}").toString();
    }

    public aqr<Transcode> a(aog<DataType> aog_DataType, int i, int i2, anz anz, app<ResourceType> app_ResourceType) {
        return this.c.a(app_ResourceType.a(a(aog_DataType, i, i2, anz)));
    }

    private aqr<ResourceType> a(aog<DataType> aog_DataType, int i, int i2, anz anz) {
        List list = (List) this.d.a();
        try {
            aqr<ResourceType> a = a((aog) aog_DataType, i, i2, anz, list);
            return a;
        } finally {
            this.d.a(list);
        }
    }

    private aqr<ResourceType> a(aog<DataType> aog_DataType, int i, int i2, anz anz, List<Exception> list) {
        aqr<ResourceType> aqr_ResourceType = null;
        int size = this.b.size();
        for (int i3 = 0; i3 < size; i3++) {
            aoa aoa = (aoa) this.b.get(i3);
            try {
                aqr<ResourceType> a;
                if (aoa.a(aog_DataType.a(), anz)) {
                    a = aoa.a(aog_DataType.a(), i, i2, anz);
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
        throw new aqm(this.e, new ArrayList(list));
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        return new StringBuilder(((String.valueOf(valueOf).length() + 47) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("DecodePath{ dataClass=").append(valueOf).append(", decoders=").append(valueOf2).append(", transcoder=").append(valueOf3).append("}").toString();
    }
}
