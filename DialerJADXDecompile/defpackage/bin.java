package defpackage;

import android.location.Address;
import android.os.AsyncTask;
import java.util.List;

/* compiled from: PG */
/* renamed from: bin */
final class bin extends AsyncTask {
    private beb a;
    private List b;
    private /* synthetic */ bim c;

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        Address address = ((Address[]) objArr)[0];
        if (address == null) {
            return null;
        }
        return this.c.a(address);
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Address address = (Address) obj;
        if (this.a != null) {
            this.a.a(address, this.b);
        }
    }

    bin(bim bim, List list, beb beb) {
        this.c = bim;
        this.a = beb;
        this.b = list;
    }
}
