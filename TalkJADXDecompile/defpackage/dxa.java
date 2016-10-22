package defpackage;

/* renamed from: dxa */
public enum dxa {
    ID("_id"),
    CONTACT_LOOKUP_KEY("contact_lookup_key"),
    CONTACT_ID("contact_id"),
    DISPLAY_NAME("display_name"),
    AVATAR_URL("avatar_url"),
    IS_FREQUENT("is_frequent"),
    CONTACT_SOURCE("contact_source"),
    NEEDS_GAIA_IDS_RESOLVED("needs_gaia_ids_resolved"),
    IS_HANGOUTS_USER("is_hangouts_user"),
    DETAILS("details"),
    PERSON_LOGGING_ID("person_logging_id"),
    PERSON_AFFINITY_SCORE("person_affinity_score"),
    SEARCH_TYPE("search_type"),
    SEARCH_INDEX("search_index");
    
    private final String o;

    private dxa(String str) {
        this.o = str;
    }

    public String a() {
        return this.o;
    }

    public int b() {
        return ordinal();
    }

    public static String[] c() {
        dxa[] values = dxa.values();
        String[] strArr = new String[values.length];
        for (int i = 0; i < values.length; i++) {
            strArr[i] = values[i].o;
        }
        return strArr;
    }
}
