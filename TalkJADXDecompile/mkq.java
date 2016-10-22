import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;

public final class mkq<K, V> {
    mmc<K, V> a;
    Comparator<? super K> b;
    Comparator<? super V> c;

    private mkq(mmc<K, V> mmc_K__V) {
        this.a = mmc_K__V;
    }

    public mkq<K, V> a(K k, V v) {
        gwb.j((Object) k, (Object) v);
        this.a.a((Object) k, (Object) v);
        return this;
    }

    public mkp<K, V> a() {
        int i = 0;
        if (this.c != null) {
            for (Collection collection : this.a.b().values()) {
                Collections.sort((List) collection, this.c);
            }
        }
        if (this.b != null) {
            gwb.d(8, "expectedKeys");
            mmc a = new mmf(8).b().a();
            mjq a2 = mms.a(this.b).d().a(this.a.b().entrySet());
            int size = a2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = a2.get(i2);
                i2++;
                Entry entry = (Entry) obj;
                a.a(entry.getKey(), (Iterable) entry.getValue());
            }
            this.a = a;
        }
        mmc mmc = this.a;
        if (mmc instanceof mkp) {
            mkp<K, V> mkp_K__V = (mkp) mmc;
            if (!mkp_K__V.a()) {
                return mkp_K__V;
            }
        }
        if (mmc.j()) {
            return mjb.a;
        }
        if (mmc instanceof mjw) {
            mjw mjw = (mjw) mmc;
            if (!mjw.a()) {
                return mjw;
            }
        }
        mjz mjz = new mjz(mmc.b().size());
        for (Entry entry2 : mmc.b().entrySet()) {
            int i3;
            mjq a3 = mjq.a((Collection) entry2.getValue());
            if (a3.isEmpty()) {
                i3 = i;
            } else {
                mjz.a(entry2.getKey(), a3);
                i3 = a3.size() + i;
            }
            i = i3;
        }
        return new mjw(mjz.a(), i);
    }

    public mkq() {
        gwb.d(8, "expectedKeys");
        this(new mmf(8).b().a());
    }
}
