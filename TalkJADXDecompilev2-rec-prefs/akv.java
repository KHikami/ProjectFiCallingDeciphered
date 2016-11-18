package p000;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class akv implements akn {
    private static Set<String> f1162a = new HashSet(Arrays.asList(new String[]{"X-PHONETIC-FIRST-NAME", "X-PHONETIC-MIDDLE-NAME", "X-PHONETIC-LAST-NAME", "X-ABADR", "X-ABUID"}));
    private static Set<String> f1163b = new HashSet(Arrays.asList(new String[]{"X-GNO", "X-GN", "X-REDUCTION"}));
    private static Set<String> f1164c = new HashSet(Arrays.asList(new String[]{"X-MICROSOFT-ASST_TEL", "X-MICROSOFT-ASSISTANT", "X-MICROSOFT-OFFICELOC"}));
    private static Set<String> f1165d = new HashSet(Arrays.asList(new String[]{"X-SD-VERN", "X-SD-FORMAT_VER", "X-SD-CATEGORIES", "X-SD-CLASS", "X-SD-DCREATED", "X-SD-DESCRIPTION"}));
    private static String f1166e = "X-SD-CHAR_CODE";
    private int f1167f = 0;
    private int f1168g = -1;
    private String f1169h;

    public void mo237a() {
    }

    public void mo239b() {
    }

    public void mo240d() {
    }

    public void mo241e() {
    }

    public void mo238a(aku aku) {
        String a = aku.m2795a();
        List d = aku.m2806d();
        if (a.equalsIgnoreCase("VERSION") && d.size() > 0) {
            String str = (String) d.get(0);
            if (str.equals("2.1")) {
                this.f1168g = 0;
            } else if (str.equals("3.0")) {
                this.f1168g = 1;
            } else if (str.equals("4.0")) {
                this.f1168g = 2;
            } else {
                String str2 = "Invalid version string: ";
                str = String.valueOf(str);
                if (str.length() != 0) {
                    str2.concat(str);
                } else {
                    str = new String(str2);
                }
            }
        } else if (a.equalsIgnoreCase(f1166e)) {
            this.f1167f = 3;
            if (d.size() > 0) {
                this.f1169h = (String) d.get(0);
            }
        }
        if (this.f1167f == 0) {
            if (f1164c.contains(a)) {
                this.f1167f = 4;
            } else if (f1165d.contains(a)) {
                this.f1167f = 3;
            } else if (f1163b.contains(a)) {
                this.f1167f = 2;
            } else if (f1162a.contains(a)) {
                this.f1167f = 1;
            }
        }
    }

    public int m2811c() {
        switch (this.f1167f) {
            case 2:
                return 402653192;
            case 3:
                return 939524104;
            default:
                if (this.f1168g == 0) {
                    return -1073741824;
                }
                if (this.f1168g == 1) {
                    return -1073741823;
                }
                if (this.f1168g == 2) {
                    return -1073741822;
                }
                return 0;
        }
    }
}
