package p000;

import java.util.ArrayList;
import java.util.List;

public enum cqs {
    ACCOUNT_ID("account_id", true),
    CONVERSATION_ID("conversation_id", true),
    CONVERSATION_TYPE("conversation_type", true),
    NAME("name", true),
    GENERATED_NAME("generated_name", true),
    PACKED_AVATAR_URLS("packed_avatar_urls", true),
    SHARE_COUNT("share_count", true),
    SHARE_TIMESTAMP("last_share_timestamp", true),
    SORT_TIMESTAMP("sort_timestamp", true),
    MILLIS_SINCE_LAST_SHARE("millis_since_last_share", false),
    ACCOUNT_NAME("account_name", false),
    ACCOUNT_UI_NAME("account_ui_name", false),
    ACCOUNT_COUNT("account_count", false),
    SHARE_SCORE("share_score", false),
    TARGET_INDEX("target_index", false);
    
    private final String f8863p;
    private final boolean f8864q;

    private cqs(String str, boolean z) {
        this.f8863p = str;
        this.f8864q = z;
    }

    public int m10718a() {
        return ordinal();
    }

    public static String[] m10716b() {
        cqs[] values = cqs.values();
        String[] strArr = new String[values.length];
        for (int i = 0; i < values.length; i++) {
            strArr[i] = values[i].f8863p;
        }
        return strArr;
    }

    public static String[] m10717c() {
        cqs[] values = cqs.values();
        List arrayList = new ArrayList(values.length);
        for (cqs cqs : values) {
            if (cqs.f8864q) {
                arrayList.add(cqs.f8863p);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
