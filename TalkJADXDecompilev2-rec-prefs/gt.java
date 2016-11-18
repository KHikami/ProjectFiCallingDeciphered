package p000;

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

final class gt {
    private static final Object f16037a = new Object();
    private static Field f16038b;
    private static boolean f16039c;
    private static final Object f16040d = new Object();

    public static void m18504a(fp fpVar, CharSequence charSequence, boolean z, CharSequence charSequence2, CharSequence charSequence3) {
        BigTextStyle bigText = new BigTextStyle(fpVar.mo2303a()).setBigContentTitle(charSequence).bigText(charSequence3);
        if (z) {
            bigText.setSummaryText(charSequence2);
        }
    }

    public static void m18503a(fp fpVar, CharSequence charSequence, boolean z, CharSequence charSequence2, Bitmap bitmap, Bitmap bitmap2, boolean z2) {
        BigPictureStyle bigPicture = new BigPictureStyle(fpVar.mo2303a()).setBigContentTitle(charSequence).bigPicture(bitmap);
        if (z2) {
            bigPicture.bigLargeIcon(bitmap2);
        }
        if (z) {
            bigPicture.setSummaryText(charSequence2);
        }
    }

    public static void m18505a(fp fpVar, CharSequence charSequence, boolean z, CharSequence charSequence2, ArrayList<CharSequence> arrayList) {
        InboxStyle bigContentTitle = new InboxStyle(fpVar.mo2303a()).setBigContentTitle(charSequence);
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

    public static SparseArray<Bundle> m18501a(List<Bundle> list) {
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

    public static Bundle m18500a(Notification notification) {
        synchronized (f16037a) {
            if (f16039c) {
                return null;
            }
            try {
                if (f16038b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (Bundle.class.isAssignableFrom(declaredField.getType())) {
                        declaredField.setAccessible(true);
                        f16038b = declaredField;
                    } else {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f16039c = true;
                        return null;
                    }
                }
                Bundle bundle = (Bundle) f16038b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f16038b.set(notification, bundle);
                }
                return bundle;
            } catch (Throwable e) {
                Log.e("NotificationCompat", "Unable to access notification extras", e);
                f16039c = true;
                return null;
            } catch (Throwable e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                f16039c = true;
                return null;
            }
        }
    }

    public static Bundle m18499a(Builder builder, gq gqVar) {
        builder.addAction(gqVar.mo2066a(), gqVar.mo2067b(), gqVar.mo2068c());
        Bundle bundle = new Bundle(gqVar.mo2069d());
        if (gqVar.mo2071f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", ba.m4589a(gqVar.mo2071f()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", gqVar.mo2070e());
        return bundle;
    }

    public static ArrayList<Parcelable> m18502a(gq[] gqVarArr) {
        if (gqVarArr == null) {
            return null;
        }
        ArrayList<Parcelable> arrayList = new ArrayList(gqVarArr.length);
        for (gq gqVar : gqVarArr) {
            Bundle bundle = new Bundle();
            bundle.putInt("icon", gqVar.mo2066a());
            bundle.putCharSequence("title", gqVar.mo2067b());
            bundle.putParcelable("actionIntent", gqVar.mo2068c());
            bundle.putBundle("extras", gqVar.mo2069d());
            bundle.putParcelableArray("remoteInputs", ba.m4589a(gqVar.mo2071f()));
            arrayList.add(bundle);
        }
        return arrayList;
    }
}
