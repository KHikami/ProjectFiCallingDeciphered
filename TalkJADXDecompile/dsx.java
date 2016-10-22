import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

final class dsx implements dsi {
    final String a;

    dsx() {
        this.a = getClass().getName();
    }

    public void a(Context context, ed edVar, String str, String str2, String str3, dsk dsk) {
        if (str2 == null) {
            Toast.makeText(context, ba.lN, 0).show();
            return;
        }
        jca jca = (jca) jyn.a(context, jca.class);
        fzw fzw = (fzw) jyn.a(context, fzw.class);
        bko e = fde.e(jca.a());
        if (dsk != dsk.INVITE || fzw.a(jca.a())) {
            dso dso = new dso();
            Bundle bundle = new Bundle();
            bundle.putString("conversation_id", str3);
            bundle.putString("name", str);
            bundle.putString("contact", str2);
            bundle.putSerializable("trigger_action", dsk);
            dso.setArguments(bundle);
            dso.a(edVar, this.a);
            return;
        }
        gwb.a(e, 1860);
        new dsl(context, str2, str3).a(context, dsm.c);
    }
}
