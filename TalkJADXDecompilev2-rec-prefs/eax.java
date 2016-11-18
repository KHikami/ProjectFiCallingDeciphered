package p000;

import android.content.Context;
import android.database.Cursor;
import com.google.android.apps.hangouts.content.EsProvider;

final class eax {
    eax() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m13401a(Context context, int i) {
        Cursor query = context.getContentResolver().query(EsProvider.m8251a(EsProvider.f6009l, i), ebv.f11143a, eat.f11075a, null, "timestamp ASC");
        if (query != null) {
            try {
                gjj gjj = new gjj();
                int i2 = 0;
                int i3 = -1;
                long j = 0;
                query.moveToPosition(-1);
                while (query.moveToNext()) {
                    int i4;
                    fwx fwx = fwx.values()[query.getInt(12)];
                    String string = query.getString(7);
                    long j2 = query.getLong(11) / 1000;
                    switch (eau.f11078a[fwx.ordinal()]) {
                        case 1:
                        case 2:
                            break;
                        case 3:
                            i2++;
                            gjj.add(string);
                            i3 = query.getPosition();
                            if (j2 > j) {
                                j = j2;
                                i4 = i3;
                                break;
                            }
                        default:
                            i4 = i3;
                            break;
                    }
                    i3 = i4;
                }
                if (ecm.f11020p) {
                    new StringBuilder(43).append("query for failed message sends: ").append(i2);
                }
                if (i2 > 0) {
                    eat ebb;
                    if (i2 == 1) {
                        query.moveToPosition(i3);
                        ebb = new ebb(context, i, new ebs(query, i), j);
                        ecm.m13299a((ecm) ebb);
                    } else {
                        ecm eba = new eba(context, i, gjj, i2, j);
                        ecm.m13299a(eba);
                        ecm ecm = eba;
                    }
                    ebb.mo1807a(true);
                } else {
                    eat.m13386a(context, i);
                }
                query.close();
            } catch (Throwable th) {
                query.close();
            }
        }
    }

    void m13402a(Context context, int i, String str) {
        gjj a = gjj.m17806a(str);
        boolean a2 = ((fuz) jyn.m25426a(context, fuz.class)).m16291a(i);
        if (blf.m5816c(new blo(context, i), a) > 0 && !a2) {
            eax.m13401a(context, i);
        }
    }
}
