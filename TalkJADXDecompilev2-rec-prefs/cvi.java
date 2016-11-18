package p000;

import java.util.List;

final class cvi extends itg {
    final /* synthetic */ cvh f9172a;

    cvi(cvh cvh) {
        this.f9172a = cvh;
    }

    public void mo1439a(int i, String str) {
        cvh cvh = this.f9172a;
        List<cvn> list = (List) cvh.f9162c.get(cvh.m11096b(str));
        if (list != null) {
            for (cvn a : list) {
                a.mo1422a(i);
            }
        }
    }
}
