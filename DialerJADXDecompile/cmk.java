import android.content.ContentResolver;

public class cmk {
    final ContentResolver a;

    public Boolean a(String str, Boolean bool) {
        return Boolean.valueOf(ckq.a(this.a, str, bool.booleanValue()));
    }

    public Long a(String str, Long l) {
        return Long.valueOf(ckq.a(this.a, str, l.longValue()));
    }

    public Integer a(String str, Integer num) {
        return Integer.valueOf(ckq.a(this.a, str, num.intValue()));
    }

    public Float a(String str, Float f) {
        String a = ckq.a(this.a, str, null);
        if (a != null) {
            try {
                f = Float.valueOf(Float.parseFloat(a));
            } catch (NumberFormatException e) {
            }
        }
        return f;
    }

    public String a(String str, String str2) {
        return ckq.a(this.a, str, str2);
    }

    public cmk(ContentResolver contentResolver) {
        this.a = contentResolver;
    }
}
