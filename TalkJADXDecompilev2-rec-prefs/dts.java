package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

final class dts implements dtp {
    final /* synthetic */ dtr f10515a;

    dts(dtr dtr) {
        this.f10515a = dtr;
    }

    private static void m12683a(Context context, List<dto> list, Class<? extends dto> cls) {
        dto dto = (dto) jyn.m25433b(context, (Class) cls);
        if (dto != null) {
            list.add(dto);
        }
    }

    public List<dto> mo1674a(Context context) {
        List<dto> arrayList = new ArrayList();
        dts.m12683a(context, arrayList, dtu.class);
        dts.m12683a(context, arrayList, dtq.class);
        return arrayList;
    }
}
