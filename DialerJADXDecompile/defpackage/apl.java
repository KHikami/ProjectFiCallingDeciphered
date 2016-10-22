package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.content.CursorLoader;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.Loader;
import android.content.Loader.OnLoadCompleteListener;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: apl */
public class apl implements OnLoadCompleteListener {
    static final String a;
    public static final String[] b;
    public final Context c;
    public boolean d;
    public CursorLoader e;
    private final OnDismissListener f;
    private final int g;
    private final int h;
    private long i;
    private boolean j;

    public /* synthetic */ void onLoadComplete(Loader loader, Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor == null) {
            a();
            return;
        }
        boolean z;
        List arrayList = new ArrayList();
        if (this.c instanceof alf) {
            z = ((alf) this.c).u;
        } else {
            z = true;
        }
        if (z) {
            String str = null;
            while (cursor.moveToNext()) {
                try {
                    if (this.i == -1) {
                        this.i = cursor.getLong(8);
                    }
                    if (this.d && cursor.getInt(2) != 0) {
                        str = cursor.getString(1);
                    }
                    apn apn = new apn();
                    apn.a = cursor.getLong(0);
                    apn.b = cursor.getString(1);
                    apn.c = cursor.getString(3);
                    apn.d = cursor.getString(4);
                    apn.e = (long) cursor.getInt(5);
                    apn.f = cursor.getString(6);
                    apn.g = cursor.getString(7);
                    arrayList.add(apn);
                } finally {
                    cursor.close();
                }
            }
            if (!this.d || str == null) {
                buf.a(arrayList, this.c);
                if (arrayList.size() == 0) {
                    a();
                } else if (arrayList.size() == 1) {
                    apn apn2 = (apn) arrayList.get(0);
                    a();
                    a(apn2.b);
                } else {
                    Activity activity = (Activity) this.c;
                    if (!activity.isDestroyed()) {
                        try {
                            FragmentManager fragmentManager = activity.getFragmentManager();
                            int i = this.g;
                            boolean z2 = this.j;
                            int i2 = this.h;
                            apm apm = new apm();
                            Bundle bundle = new Bundle();
                            bundle.putParcelableArrayList("phoneList", arrayList);
                            bundle.putInt("interactionType", i);
                            bundle.putInt("callInitiation", i2);
                            bundle.putBoolean("is_video_call", z2);
                            apm.setArguments(bundle);
                            apm.show(fragmentManager, a);
                        } catch (IllegalStateException e) {
                        }
                    }
                }
                cursor.close();
                return;
            }
            a(str);
            a();
            cursor.close();
            return;
        }
        a();
    }

    static {
        a = apl.class.getSimpleName();
        b = new String[]{"_id", "data1", "is_super_primary", "account_type", "data_set", "data2", "data3", "mimetype", "contact_id"};
    }

    public apl(Context context, int i, OnDismissListener onDismissListener, boolean z, int i2) {
        this.i = -1;
        this.c = context;
        this.g = 1;
        this.f = null;
        this.h = i2;
        this.j = z;
    }

    static void a(Context context, String str, int i, boolean z, int i2) {
        Intent intent;
        switch (i) {
            case rq.c /*2*/:
                intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("sms", str, null));
                break;
            default:
                arq arq = new arq(str);
                arq.a = i2;
                arq.c = z;
                intent = arq.a();
                break;
        }
        buf.d(context, intent);
    }

    private final void a(String str) {
        apl.a(this.c, str, this.g, this.j, this.h);
    }

    private final void a() {
        if (this.f != null) {
            this.f.onDismiss(null);
        }
    }
}
