package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;

public final class mkq<K, V> {
    mmc<K, V> f27859a;
    Comparator<? super K> f27860b;
    Comparator<? super V> f27861c;

    private mkq(mmc<K, V> mmc_K__V) {
        this.f27859a = mmc_K__V;
    }

    public mkq<K, V> m32399a(K k, V v) {
        gwb.m2264j((Object) k, (Object) v);
        this.f27859a.mo3776a((Object) k, (Object) v);
        return this;
    }

    public mkp<K, V> m32398a() {
        int i = 0;
        if (this.f27861c != null) {
            for (Collection collection : this.f27859a.mo3777b().values()) {
                Collections.sort((List) collection, this.f27861c);
            }
        }
        if (this.f27860b != null) {
            gwb.m2121d(8, "expectedKeys");
            mmc a = new mmf(8).m32500b().mo3884a();
            mjq a2 = mms.m32221a(this.f27860b).m32227d().m32222a(this.f27859a.mo3777b().entrySet());
            int size = a2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = a2.get(i2);
                i2++;
                Entry entry = (Entry) obj;
                a.mo3775a(entry.getKey(), (Iterable) entry.getValue());
            }
            this.f27859a = a;
        }
        mmc mmc = this.f27859a;
        if (mmc instanceof mkp) {
            mkp<K, V> mkp_K__V = (mkp) mmc;
            if (!mkp_K__V.m32286a()) {
                return mkp_K__V;
            }
        }
        if (mmc.mo3778j()) {
            return mjb.f27815a;
        }
        if (mmc instanceof mjw) {
            mjw mjw = (mjw) mmc;
            if (!mjw.m32286a()) {
                return mjw;
            }
        }
        mjz mjz = new mjz(mmc.mo3777b().size());
        for (Entry entry2 : mmc.mo3777b().entrySet()) {
            int i3;
            mjq a3 = mjq.m32314a((Collection) entry2.getValue());
            if (a3.isEmpty()) {
                i3 = i;
            } else {
                mjz.mo3837a(entry2.getKey(), a3);
                i3 = a3.size() + i;
            }
            i = i3;
        }
        return new mjw(mjz.mo3836a(), i);
    }

    public mkq() {
        gwb.m2121d(8, "expectedKeys");
        this(new mmf(8).m32500b().mo3884a());
    }
}
