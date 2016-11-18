package p000;

import com.google.android.gms.common.data.DataHolder;

public final class hwq extends gux {
    private final huf f17425b;
    private final hue f17426c;

    public hwq(DataHolder dataHolder, huf huf, hue hue) {
        super(dataHolder, (byte) 0);
        this.f17425b = huf;
        this.f17426c = hue;
    }

    private hwp m21150b(int i) {
        return new hwe(this.f13937a, i, m16154e(), this.f17425b, this.f17426c);
    }

    public /* synthetic */ Object mo2075a(int i) {
        return m21150b(i);
    }

    public String toString() {
        return "People:size=" + mo2074a();
    }
}
