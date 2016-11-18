package p000;

import com.google.android.gms.location.DetectedActivity;
import java.util.Comparator;

public final class hjd implements Comparator<DetectedActivity> {
    public /* synthetic */ int compare(Object obj, Object obj2) {
        DetectedActivity detectedActivity = (DetectedActivity) obj;
        DetectedActivity detectedActivity2 = (DetectedActivity) obj2;
        int compareTo = Integer.valueOf(detectedActivity2.m9778b()).compareTo(Integer.valueOf(detectedActivity.m9778b()));
        return compareTo == 0 ? Integer.valueOf(detectedActivity.m9777a()).compareTo(Integer.valueOf(detectedActivity2.m9777a())) : compareTo;
    }
}
