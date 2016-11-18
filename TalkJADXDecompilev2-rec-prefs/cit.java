package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public final class cit extends AsyncTask<Intent, Integer, bxy> {
    private final Context f5398a;
    private final int f5399b;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m7727a((Intent[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m7728a((bxy) obj);
    }

    public cit(Context context) {
        this.f5398a = context;
        this.f5399b = ((jca) jyn.m25426a(context, jca.class)).mo2317a();
    }

    private bxy m7727a(Intent... intentArr) {
        bxy bxy = (bxy) intentArr[0].getParcelableExtra("result_media_attachment");
        if (bxy == null) {
            glk.m17981d("Babel", "Attachment is null, stop sending the attachment.", new Object[0]);
            cancel(true);
        }
        try {
            bxy = ccy.m7221a(this.f5398a, this.f5399b, bxy.c, Uri.parse(bxy.a), bxy.a, bxy.d);
        } catch (Throwable e) {
            glk.m17980d("Babel_SendMediaAttTask", "File too big to attach.", e);
        }
        return bxy;
    }

    private void m7728a(bxy bxy) {
        if (bxy != null) {
            cdg cdg = (cdg) jyn.m25426a(this.f5398a, cdg.class);
            List arrayList = new ArrayList(1);
            arrayList.add(bxy);
            cdg.mo840a(arrayList);
            return;
        }
        Toast.makeText(this.f5398a, this.f5398a.getResources().getString(gwb.lU), 0).show();
    }
}
