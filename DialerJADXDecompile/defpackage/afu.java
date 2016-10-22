package defpackage;

import java.util.Arrays;
import java.util.HashSet;

/* compiled from: PG */
/* renamed from: afu */
public class afu {
    static {
        afu.class.getSimpleName();
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/email_v2", "vnd.android.cursor.item/im", "vnd.android.cursor.item/nickname", "vnd.android.cursor.item/website", "vnd.android.cursor.item/relation", "vnd.android.cursor.item/sip_address"}));
        hashSet = new HashSet(Arrays.asList(new String[]{"vnd.android.cursor.item/organization", "vnd.android.cursor.item/note", "vnd.android.cursor.item/photo", "vnd.android.cursor.item/group_membership"}));
    }

    public static int a(ahm ahm, int i) {
        for (int i2 = 0; i2 < ahm.k.size(); i2++) {
            if (((afz) ahm.k.get(i2)).a == i) {
                return i2;
            }
        }
        return Integer.MAX_VALUE;
    }
}
