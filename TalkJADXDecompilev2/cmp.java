package defpackage;

import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.List;

final class cmp extends AsyncTask<Void, Void, ArrayList<cmq>> {
    final /* synthetic */ cmm a;

    cmp(cmm cmm) {
        this.a = cmm;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        a((ArrayList) obj);
    }

    private ArrayList<cmq> a() {
        String str = "Babel_Stickers";
        String str2 = "update albumId=";
        String valueOf = String.valueOf(this.a.d);
        glk.a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        ArrayList<cmq> arrayList = new ArrayList();
        List<eyg> list = ((cmy) this.a.getTargetFragment()).i;
        String str3;
        if (this.a.d == null || list.isEmpty()) {
            str3 = this.a.d;
            str2 = String.valueOf(list);
            glk.e("Babel_Stickers", new StringBuilder((String.valueOf(str3).length() + 21) + String.valueOf(str2).length()).append("Missing album:").append(str3).append(" cache:").append(str2).toString(), new Object[0]);
        } else {
            str3 = "Babel_Stickers";
            String str4 = "Updating! - ";
            valueOf = String.valueOf(this.a.d);
            glk.e(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4), new Object[0]);
            for (eyg eyg : list) {
                if (this.a.d.equals(eyg.a)) {
                    for (eyi eyi : eyg.e) {
                        cmq cmq = new cmq(this.a);
                        cmq.b = eyi.b;
                        cmq.a = eyi.a;
                        cmq.c = eyi.c;
                        arrayList.add(cmq);
                    }
                }
            }
        }
        return arrayList;
    }

    private void a(ArrayList<cmq> arrayList) {
        this.a.a(this.a.c, (ArrayList) arrayList);
    }
}
