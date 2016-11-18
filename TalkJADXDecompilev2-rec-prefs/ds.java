package p000;

import android.view.View;

final class ds extends ea {
    final /* synthetic */ dr f10419a;

    ds(dr drVar) {
        this.f10419a = drVar;
    }

    public View mo1657a(int i) {
        if (this.f10419a.f740S != null) {
            return this.f10419a.f740S.findViewById(i);
        }
        throw new IllegalStateException("Fragment does not have a view");
    }

    public boolean mo1658a() {
        return this.f10419a.f740S != null;
    }
}
