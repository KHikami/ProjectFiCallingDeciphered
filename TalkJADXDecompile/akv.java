import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class akv implements akn {
    private static Set<String> a;
    private static Set<String> b;
    private static Set<String> c;
    private static Set<String> d;
    private static String e;
    private int f;
    private int g;
    private String h;

    public akv() {
        this.f = 0;
        this.g = -1;
    }

    static {
        a = new HashSet(Arrays.asList(new String[]{"X-PHONETIC-FIRST-NAME", "X-PHONETIC-MIDDLE-NAME", "X-PHONETIC-LAST-NAME", "X-ABADR", "X-ABUID"}));
        b = new HashSet(Arrays.asList(new String[]{"X-GNO", "X-GN", "X-REDUCTION"}));
        c = new HashSet(Arrays.asList(new String[]{"X-MICROSOFT-ASST_TEL", "X-MICROSOFT-ASSISTANT", "X-MICROSOFT-OFFICELOC"}));
        d = new HashSet(Arrays.asList(new String[]{"X-SD-VERN", "X-SD-FORMAT_VER", "X-SD-CATEGORIES", "X-SD-CLASS", "X-SD-DCREATED", "X-SD-DESCRIPTION"}));
        e = "X-SD-CHAR_CODE";
    }

    public void a() {
    }

    public void b() {
    }

    public void d() {
    }

    public void e() {
    }

    public void a(aku aku) {
        String a = aku.a();
        List d = aku.d();
        if (a.equalsIgnoreCase("VERSION") && d.size() > 0) {
            String str = (String) d.get(0);
            if (str.equals("2.1")) {
                this.g = 0;
            } else if (str.equals("3.0")) {
                this.g = 1;
            } else if (str.equals("4.0")) {
                this.g = 2;
            } else {
                String str2 = "Invalid version string: ";
                str = String.valueOf(str);
                if (str.length() != 0) {
                    str2.concat(str);
                } else {
                    str = new String(str2);
                }
            }
        } else if (a.equalsIgnoreCase(e)) {
            this.f = 3;
            if (d.size() > 0) {
                this.h = (String) d.get(0);
            }
        }
        if (this.f == 0) {
            if (c.contains(a)) {
                this.f = 4;
            } else if (d.contains(a)) {
                this.f = 3;
            } else if (b.contains(a)) {
                this.f = 2;
            } else if (a.contains(a)) {
                this.f = 1;
            }
        }
    }

    public int c() {
        switch (this.f) {
            case wi.l /*2*/:
                return 402653192;
            case wi.z /*3*/:
                return 939524104;
            default:
                if (this.g == 0) {
                    return -1073741824;
                }
                if (this.g == 1) {
                    return -1073741823;
                }
                if (this.g == 2) {
                    return -1073741822;
                }
                return 0;
        }
    }
}
