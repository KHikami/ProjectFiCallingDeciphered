package defpackage;

import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.OperationApplicationException;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.ContactsContract.RawContacts;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: bgn */
public final class bgn implements bgq {
    private static String b;
    public final ArrayList a;
    private final ContentResolver c;
    private long d;
    private int e;
    private ArrayList f;

    static {
        b = "vCard";
    }

    public bgn(ContentResolver contentResolver) {
        this.a = new ArrayList();
        this.c = contentResolver;
    }

    public final void b() {
        if (this.f != null) {
            this.a.add(a(this.f));
        }
        bfr.a();
    }

    public final void a(bfs bfs) {
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = this.f;
        if (obj == null) {
            obj = new ArrayList();
        }
        if (!bfs.b()) {
            int size = obj.size();
            Builder newInsert = ContentProviderOperation.newInsert(RawContacts.CONTENT_URI);
            if (bfs.o != null) {
                newInsert.withValue("account_name", bfs.o.name);
                newInsert.withValue("account_type", bfs.o.type);
            } else {
                newInsert.withValue("account_name", null);
                newInsert.withValue("account_type", null);
            }
            obj.add(newInsert.build());
            obj.size();
            bfs.a(new bgb(bfs, obj, size));
            obj.size();
        }
        this.f = obj;
        this.e++;
        if (this.e >= 20) {
            this.a.add(a(this.f));
            this.e = 0;
            this.f = null;
        }
        this.d += System.currentTimeMillis() - currentTimeMillis;
    }

    private final Uri a(ArrayList arrayList) {
        Uri uri = null;
        try {
            ContentProviderResult[] applyBatch = this.c.applyBatch("com.android.contacts", arrayList);
            if (!(applyBatch == null || applyBatch.length == 0 || applyBatch[0] == null)) {
                uri = applyBatch[0].uri;
            }
        } catch (RemoteException e) {
            Log.e(b, String.format("%s: %s", new Object[]{e.toString(), e.getMessage()}));
        } catch (OperationApplicationException e2) {
            Log.e(b, String.format("%s: %s", new Object[]{e2.toString(), e2.getMessage()}));
        }
        return uri;
    }
}
