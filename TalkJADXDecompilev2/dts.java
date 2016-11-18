package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

final class dts implements dtp {
    final /* synthetic */ dtr a;

    dts(dtr dtr) {
        this.a = dtr;
    }

    private static void a(Context context, List<dto> list, Class<? extends dto> cls) {
        dto dto = (dto) jyn.b(context, (Class) cls);
        if (dto != null) {
            list.add(dto);
        }
    }

    public List<dto> a(Context context) {
        List<dto> arrayList = new ArrayList();
        dts.a(context, arrayList, dtu.class);
        dts.a(context, arrayList, dtq.class);
        return arrayList;
    }
}
