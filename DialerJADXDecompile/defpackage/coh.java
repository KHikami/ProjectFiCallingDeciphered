package defpackage;

import com.google.android.gms.location.DetectedActivity;
import java.util.Comparator;

/* renamed from: coh */
public final class coh implements Comparator {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        DetectedActivity detectedActivity = (DetectedActivity) obj;
        DetectedActivity detectedActivity2 = (DetectedActivity) obj2;
        int compareTo = Integer.valueOf(detectedActivity2.c).compareTo(Integer.valueOf(detectedActivity.c));
        return compareTo == 0 ? Integer.valueOf(detectedActivity.a()).compareTo(Integer.valueOf(detectedActivity2.a())) : compareTo;
    }
}
