package p000;

import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.List;

final class cmp extends AsyncTask<Void, Void, ArrayList<cmq>> {
    final /* synthetic */ cmm f5655a;

    cmp(cmm cmm) {
        this.f5655a = cmm;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m7930a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m7931a((ArrayList) obj);
    }

    private ArrayList<cmq> m7930a() {
        String str = "Babel_Stickers";
        String str2 = "update albumId=";
        String valueOf = String.valueOf(this.f5655a.f5647d);
        glk.m17970a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        ArrayList<cmq> arrayList = new ArrayList();
        List<eyg> list = ((cmy) this.f5655a.getTargetFragment()).f5639i;
        String str3;
        if (this.f5655a.f5647d == null || list.isEmpty()) {
            str3 = this.f5655a.f5647d;
            str2 = String.valueOf(list);
            glk.m17982e("Babel_Stickers", new StringBuilder((String.valueOf(str3).length() + 21) + String.valueOf(str2).length()).append("Missing album:").append(str3).append(" cache:").append(str2).toString(), new Object[0]);
        } else {
            str3 = "Babel_Stickers";
            String str4 = "Updating! - ";
            valueOf = String.valueOf(this.f5655a.f5647d);
            glk.m17982e(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4), new Object[0]);
            for (eyg eyg : list) {
                if (this.f5655a.f5647d.equals(eyg.f12515a)) {
                    for (eyi eyi : eyg.f12519e) {
                        cmq cmq = new cmq(this.f5655a);
                        cmq.f5657b = eyi.f12521b;
                        cmq.f5656a = eyi.f12520a;
                        cmq.f5658c = eyi.f12522c;
                        arrayList.add(cmq);
                    }
                }
            }
        }
        return arrayList;
    }

    private void m7931a(ArrayList<cmq> arrayList) {
        this.f5655a.m7927a(this.f5655a.f5646c, (ArrayList) arrayList);
    }
}
