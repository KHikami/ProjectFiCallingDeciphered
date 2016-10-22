package defpackage;

import android.app.Notification;
import android.app.Notification.BigPictureStyle;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.Notification.InboxStyle;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gt */
final class gt {
    private static final Object a;
    private static Field b;
    private static boolean c;
    private static final Object d;

    static {
        a = new Object();
        d = new Object();
    }

    public static void a(fp fpVar, CharSequence charSequence, boolean z, CharSequence charSequence2, CharSequence charSequence3) {
        BigTextStyle bigText = new BigTextStyle(fpVar.a()).setBigContentTitle(charSequence).bigText(charSequence3);
        if (z) {
            bigText.setSummaryText(charSequence2);
        }
    }

    public static void a(fp fpVar, CharSequence charSequence, boolean z, CharSequence charSequence2, Bitmap bitmap, Bitmap bitmap2, boolean z2) {
        BigPictureStyle bigPicture = new BigPictureStyle(fpVar.a()).setBigContentTitle(charSequence).bigPicture(bitmap);
        if (z2) {
            bigPicture.bigLargeIcon(bitmap2);
        }
        if (z) {
            bigPicture.setSummaryText(charSequence2);
        }
    }

    public static void a(fp fpVar, CharSequence charSequence, boolean z, CharSequence charSequence2, ArrayList<CharSequence> arrayList) {
        InboxStyle bigContentTitle = new InboxStyle(fpVar.a()).setBigContentTitle(charSequence);
        if (z) {
            bigContentTitle.setSummaryText(charSequence2);
        }
        arrayList = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            bigContentTitle.addLine((CharSequence) obj);
        }
    }

    public static SparseArray<Bundle> a(List<Bundle> list) {
        SparseArray<Bundle> sparseArray = null;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Bundle bundle = (Bundle) list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    public static Bundle a(Notification notification) {
        synchronized (a) {
            if (c) {
                return null;
            }
            try {
                if (b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (Bundle.class.isAssignableFrom(declaredField.getType())) {
                        declaredField.setAccessible(true);
                        b = declaredField;
                    } else {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        c = true;
                        return null;
                    }
                }
                Bundle bundle = (Bundle) b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    b.set(notification, bundle);
                }
                return bundle;
            } catch (Throwable e) {
                Log.e("NotificationCompat", "Unable to access notification extras", e);
                c = true;
                return null;
            } catch (Throwable e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                c = true;
                return null;
            }
        }
    }

    public static Bundle a(Builder builder, gq gqVar) {
        builder.addAction(gqVar.a(), gqVar.b(), gqVar.c());
        Bundle bundle = new Bundle(gqVar.d());
        if (gqVar.f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", ba.a(gqVar.f()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", gqVar.e());
        return bundle;
    }

    public static ArrayList<Parcelable> a(gq[] gqVarArr) {
        if (gqVarArr == null) {
            return null;
        }
        ArrayList<Parcelable> arrayList = new ArrayList(gqVarArr.length);
        for (gq gqVar : gqVarArr) {
            Bundle bundle = new Bundle();
            bundle.putInt("icon", gqVar.a());
            bundle.putCharSequence("title", gqVar.b());
            bundle.putParcelable("actionIntent", gqVar.c());
            bundle.putBundle("extras", gqVar.d());
            bundle.putParcelableArray("remoteInputs", ba.a(gqVar.f()));
            arrayList.add(bundle);
        }
        return arrayList;
    }
}
