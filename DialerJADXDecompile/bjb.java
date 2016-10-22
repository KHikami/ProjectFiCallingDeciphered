import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.ArraySet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
public final class bjb {
    private static long a;

    static {
        a = TimeUnit.DAYS.toMillis(1);
    }

    private static void a(Set set, SharedPreferences sharedPreferences) {
        Editor edit = sharedPreferences.edit();
        edit.putStringSet("RATE_LIMITER_PREFS", set);
        edit.apply();
    }

    private static Set a(Set set) {
        Set arraySet = new ArraySet();
        for (String str : set) {
            int i;
            String[] split = str.split("_");
            avl.a(split.length == 2);
            if (System.currentTimeMillis() - Long.parseLong(split[1]) > a) {
                i = 1;
            } else {
                i = 0;
            }
            if (i == 0) {
                arraySet.add(str);
            }
        }
        return arraySet;
    }

    public static int a(String str, SharedPreferences sharedPreferences) {
        avl.a((Object) str);
        avl.a((Object) sharedPreferences);
        Set<String> a = a(sharedPreferences.getStringSet("RATE_LIMITER_PREFS", new ArraySet()));
        if (((long) a.size()) >= 1000) {
            a((Set) a, sharedPreferences);
            return 2;
        }
        for (String split : a) {
            String[] split2 = split.split("_");
            avl.a(split2.length == 2);
            if (str.equals(split2[0])) {
                a((Set) a, sharedPreferences);
                return 1;
            }
        }
        String split3 = String.valueOf("_");
        a.add(new StringBuilder((String.valueOf(str).length() + 20) + String.valueOf(split3).length()).append(str).append(split3).append(System.currentTimeMillis()).toString());
        a((Set) a, sharedPreferences);
        return 0;
    }
}
