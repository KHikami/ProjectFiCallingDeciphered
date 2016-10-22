import java.util.List;

final class cvi extends itg {
    final /* synthetic */ cvh a;

    cvi(cvh cvh) {
        this.a = cvh;
    }

    public void a(int i, String str) {
        cvh cvh = this.a;
        List<cvn> list = (List) cvh.c.get(cvh.b(str));
        if (list != null) {
            for (cvn a : list) {
                a.a(i);
            }
        }
    }
}
