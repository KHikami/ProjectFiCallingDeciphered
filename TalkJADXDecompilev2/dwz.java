package defpackage;

import android.content.ContentProvider;
import android.net.Uri;

public abstract class dwz extends ContentProvider {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final Uri f;
    public static final Uri g;
    public static final Uri h;
    public static final String[] i = new String[]{"_id", "contact_lookup_key", "contact_id", "raw_contact_id", "display_name", "avatar_url", "is_frequent", "contact_source", "frequent_order", "person_logging_id", "person_affinity_score"};
    public static final String[] j = new String[]{"_id", "merged_contact_id", "lookup_data_type", "lookup_data", "lookup_data_standardized", "lookup_data_search", "lookup_data_label", "is_hangouts_user", "needs_gaia_ids_resolved", "gaia_id", "avatar_url", "display_name", "last_checked_ts", "lookup_data_display", "detail_logging_id", "detail_affinity_score"};
    private static final String k;

    static {
        String str;
        try {
            Class.forName("com.google.android.apps.hangouts.defaultbuild.EsProvider");
            str = "com.google.android.apps.hangouts.mergedcontacts.MergedContactProvider";
        } catch (ClassNotFoundException e) {
            str = "com.google.android.apps.hangouts.mergedcontacts.MergedContactProviderAltBuild";
        }
        a = str;
        k = new StringBuilder(String.valueOf(str).length() + 11).append("content://").append(str).append("/").toString();
        str = String.valueOf("CREATE VIEW merged_contacts_with_details AS SELECT merged_contacts._id as _id, merged_contacts.contact_lookup_key as contact_lookup_key, merged_contacts.contact_id as contact_id, merged_contacts.raw_contact_id as raw_contact_id, merged_contacts.display_name as display_name, merged_contacts.avatar_url as avatar_url, merged_contacts.is_frequent as is_frequent, merged_contacts.is_favorite as is_favorite, merged_contacts.contact_source as contact_source, merged_contacts.frequent_order as frequent_order, merged_contacts.person_logging_id as person_logging_id, merged_contacts.person_affinity_score as person_affinity_score, merged_contact_details.lookup_data as lookup_data, merged_contact_details.lookup_data_search as lookup_data_search, max(merged_contact_details.needs_gaia_ids_resolved) as needs_gaia_ids_resolved, max(merged_contact_details.is_hangouts_user) as is_hangouts_user, max(case when merged_contact_details.lookup_data_type = 0 then 1 else 0 END ) as has_phone_number, group_concat(merged_contact_details.lookup_data_type || \"#DELIM2#\" || ");
        String valueOf = String.valueOf(dwz.a("lookup_data"));
        String valueOf2 = String.valueOf(" || \"#DELIM2#\" || ");
        String valueOf3 = String.valueOf(dwz.a("lookup_data_standardized"));
        String valueOf4 = String.valueOf(" || \"#DELIM2#\" || ");
        String valueOf5 = String.valueOf(dwz.a("lookup_data_label"));
        String valueOf6 = String.valueOf(" || \"#DELIM2#\" || ");
        String valueOf7 = String.valueOf("merged_contact_details");
        String valueOf8 = String.valueOf("needs_gaia_ids_resolved");
        String valueOf9 = String.valueOf(" || \"#DELIM2#\" || ");
        String valueOf10 = String.valueOf("merged_contact_details");
        String valueOf11 = String.valueOf("is_hangouts_user");
        String valueOf12 = String.valueOf(" || \"#DELIM2#\" || ");
        String valueOf13 = String.valueOf(dwz.a("gaia_id"));
        String valueOf14 = String.valueOf(" || \"#DELIM2#\" || ");
        String valueOf15 = String.valueOf(dwz.a("avatar_url"));
        String valueOf16 = String.valueOf(" || \"#DELIM2#\" || ");
        String valueOf17 = String.valueOf(dwz.a("display_name"));
        String valueOf18 = String.valueOf(" || \"#DELIM2#\" || ");
        String valueOf19 = String.valueOf("merged_contact_details");
        String valueOf20 = String.valueOf("last_checked_ts");
        String valueOf21 = String.valueOf(" || \"#DELIM2#\" || ");
        String valueOf22 = String.valueOf(dwz.a("lookup_data_display"));
        String valueOf23 = String.valueOf(" || \"#DELIM2#\" || ");
        String valueOf24 = String.valueOf(dwz.a("detail_logging_id"));
        String valueOf25 = String.valueOf(" || \"#DELIM2#\" || ");
        String valueOf26 = String.valueOf(dwz.a("detail_affinity_score"));
        String valueOf27 = String.valueOf("#DELIM1#");
        String valueOf28 = String.valueOf(" as ");
        String valueOf29 = String.valueOf("details");
        String valueOf30 = String.valueOf("merged_contacts");
        String valueOf31 = String.valueOf("merged_contact_details");
        String valueOf32 = String.valueOf("merged_contact_details");
        String valueOf33 = String.valueOf("merged_contact_id");
        String valueOf34 = String.valueOf("merged_contacts");
        String valueOf35 = String.valueOf("_id");
        String valueOf36 = String.valueOf("merged_contacts");
        String valueOf37 = String.valueOf("_id");
        String valueOf38 = String.valueOf("merged_contacts");
        String valueOf39 = String.valueOf("contact_lookup_key");
        String valueOf40 = String.valueOf("merged_contacts");
        String valueOf41 = String.valueOf("contact_id");
        String valueOf42 = String.valueOf("merged_contacts");
        String valueOf43 = String.valueOf("raw_contact_id");
        String valueOf44 = String.valueOf("merged_contacts");
        String valueOf45 = String.valueOf("display_name");
        String valueOf46 = String.valueOf("merged_contacts");
        String valueOf47 = String.valueOf("avatar_url");
        String valueOf48 = String.valueOf("merged_contacts");
        String valueOf49 = String.valueOf("is_frequent");
        String valueOf50 = String.valueOf("merged_contacts");
        String valueOf51 = String.valueOf("is_favorite");
        b = new StringBuilder((((((((((((((((((((((((((((((((((((((((((((((((((((String.valueOf(str).length() + 67) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()) + String.valueOf(valueOf7).length()) + String.valueOf(valueOf8).length()) + String.valueOf(valueOf9).length()) + String.valueOf(valueOf10).length()) + String.valueOf(valueOf11).length()) + String.valueOf(valueOf12).length()) + String.valueOf(valueOf13).length()) + String.valueOf(valueOf14).length()) + String.valueOf(valueOf15).length()) + String.valueOf(valueOf16).length()) + String.valueOf(valueOf17).length()) + String.valueOf(valueOf18).length()) + String.valueOf(valueOf19).length()) + String.valueOf(valueOf20).length()) + String.valueOf(valueOf21).length()) + String.valueOf(valueOf22).length()) + String.valueOf(valueOf23).length()) + String.valueOf(valueOf24).length()) + String.valueOf(valueOf25).length()) + String.valueOf(valueOf26).length()) + String.valueOf(valueOf27).length()) + String.valueOf(valueOf28).length()) + String.valueOf(valueOf29).length()) + String.valueOf(valueOf30).length()) + String.valueOf(valueOf31).length()) + String.valueOf(valueOf32).length()) + String.valueOf(valueOf33).length()) + String.valueOf(valueOf34).length()) + String.valueOf(valueOf35).length()) + String.valueOf(valueOf36).length()) + String.valueOf(valueOf37).length()) + String.valueOf(valueOf38).length()) + String.valueOf(valueOf39).length()) + String.valueOf(valueOf40).length()) + String.valueOf(valueOf41).length()) + String.valueOf(valueOf42).length()) + String.valueOf(valueOf43).length()) + String.valueOf(valueOf44).length()) + String.valueOf(valueOf45).length()) + String.valueOf(valueOf46).length()) + String.valueOf(valueOf47).length()) + String.valueOf(valueOf48).length()) + String.valueOf(valueOf49).length()) + String.valueOf(valueOf50).length()) + String.valueOf(valueOf51).length()).append(str).append(valueOf).append(valueOf2).append(valueOf3).append(valueOf4).append(valueOf5).append(valueOf6).append(valueOf7).append(".").append(valueOf8).append(valueOf9).append(valueOf10).append(".").append(valueOf11).append(valueOf12).append(valueOf13).append(valueOf14).append(valueOf15).append(valueOf16).append(valueOf17).append(valueOf18).append(valueOf19).append(".").append(valueOf20).append(valueOf21).append(valueOf22).append(valueOf23).append(valueOf24).append(valueOf25).append(valueOf26).append(", \"").append(valueOf27).append("\") ").append(valueOf28).append(valueOf29).append(" FROM ").append(valueOf30).append(" LEFT JOIN ").append(valueOf31).append(" ON (").append(valueOf32).append(".").append(valueOf33).append("=").append(valueOf34).append(".").append(valueOf35).append(") GROUP BY ").append(valueOf36).append(".").append(valueOf37).append(", ").append(valueOf38).append(".").append(valueOf39).append(", ").append(valueOf40).append(".").append(valueOf41).append(", ").append(valueOf42).append(".").append(valueOf43).append(", ").append(valueOf44).append(".").append(valueOf45).append(", ").append(valueOf46).append(".").append(valueOf47).append(", ").append(valueOf48).append(".").append(valueOf49).append(", ").append(valueOf50).append(".").append(valueOf51).toString();
        str = String.valueOf("CREATE VIEW search_merged_contacts_with_details_by_display_name AS SELECT merged_contacts_with_details._id as merged_contact_id, '");
        valueOf = String.valueOf(bji.NAME.a());
        valueOf2 = String.valueOf(" as ");
        valueOf3 = String.valueOf("search_type");
        valueOf4 = String.valueOf("merged_contacts_with_details");
        valueOf5 = String.valueOf("display_name");
        valueOf6 = String.valueOf(" as ");
        valueOf7 = String.valueOf("search_index");
        valueOf8 = String.valueOf("merged_contacts_with_details");
        c = new StringBuilder(((((((((String.valueOf(str).length() + 10) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()) + String.valueOf(valueOf7).length()) + String.valueOf(valueOf8).length()).append(str).append(valueOf).append("'").append(valueOf2).append(valueOf3).append(", ").append(valueOf4).append(".").append(valueOf5).append(valueOf6).append(valueOf7).append(" FROM ").append(valueOf8).toString();
        str = String.valueOf("CREATE VIEW search_merged_contacts_with_details_by_email AS SELECT merged_contact_details.merged_contact_id as merged_contact_id, '");
        valueOf = String.valueOf(bji.EMAIL.a());
        valueOf2 = String.valueOf(" as ");
        valueOf3 = String.valueOf("search_type");
        valueOf4 = String.valueOf("merged_contact_details");
        valueOf5 = String.valueOf("lookup_data");
        valueOf6 = String.valueOf(" as ");
        valueOf7 = String.valueOf("search_index");
        valueOf8 = String.valueOf("merged_contact_details");
        d = new StringBuilder(((((((((String.valueOf(str).length() + 10) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()) + String.valueOf(valueOf7).length()) + String.valueOf(valueOf8).length()).append(str).append(valueOf).append("'").append(valueOf2).append(valueOf3).append(", ").append(valueOf4).append(".").append(valueOf5).append(valueOf6).append(valueOf7).append(" FROM ").append(valueOf8).toString();
        str = String.valueOf("CREATE VIEW search_merged_contacts_with_details_by_phone_number AS SELECT merged_contact_details.merged_contact_id as merged_contact_id, '");
        valueOf = String.valueOf(bji.PHONE.a());
        valueOf2 = String.valueOf(" as ");
        valueOf3 = String.valueOf("search_type");
        valueOf4 = String.valueOf("merged_contact_details");
        valueOf5 = String.valueOf("lookup_data_search");
        valueOf6 = String.valueOf(" as ");
        valueOf7 = String.valueOf("search_index");
        valueOf8 = String.valueOf("merged_contact_details");
        e = new StringBuilder(((((((((String.valueOf(str).length() + 10) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()) + String.valueOf(valueOf7).length()) + String.valueOf(valueOf8).length()).append(str).append(valueOf).append("'").append(valueOf2).append(valueOf3).append(", ").append(valueOf4).append(".").append(valueOf5).append(valueOf6).append(valueOf7).append(" FROM ").append(valueOf8).toString();
        valueOf = String.valueOf(k);
        str = String.valueOf("merged_contacts");
        f = Uri.parse(str.length() != 0 ? valueOf.concat(str) : new String(valueOf));
        valueOf = String.valueOf(k);
        str = String.valueOf("merged_contacts_with_details");
        g = Uri.parse(str.length() != 0 ? valueOf.concat(str) : new String(valueOf));
        valueOf = String.valueOf(k);
        str = String.valueOf("merged_contact_details");
        h = Uri.parse(str.length() != 0 ? valueOf.concat(str) : new String(valueOf));
    }

    public static String[] a() {
        return new String[]{"CREATE TABLE merged_contacts (_id INTEGER PRIMARY KEY, contact_lookup_key TEXT, contact_id INT, raw_contact_id INT, display_name TEXT, avatar_url TEXT);", "CREATE TABLE merged_contact_details (_id INTEGER PRIMARY KEY, merged_contact_id INT, lookup_data_type INT, lookup_data TEXT, lookup_data_standardized TEXT, lookup_data_search TEXT, lookup_data_label TEXT, needs_gaia_ids_resolved INT DEFAULT (1), is_hangouts_user INT DEFAULT (0), gaia_id TEXT, avatar_url TEXT, display_name TEXT, last_checked_ts INT DEFAULT (0), FOREIGN KEY (merged_contact_id) REFERENCES merged_contacts(_id) ON DELETE CASCADE ON UPDATE CASCADE);"};
    }

    public static String[] b() {
        return new String[]{"CREATE TABLE merged_contacts (_id INTEGER PRIMARY KEY, contact_lookup_key TEXT, contact_id INT, raw_contact_id INT, display_name TEXT, avatar_url TEXT, is_frequent INT DEFAULT (0),is_favorite INT DEFAULT (0),contact_source INT DEFAULT (0), frequent_order INT, person_logging_id TEXT, person_affinity_score REAL DEFAULT (0.0));", "CREATE TABLE merged_contact_details (_id INTEGER PRIMARY KEY, merged_contact_id INT, lookup_data_type INT, lookup_data TEXT, lookup_data_display TEXT, lookup_data_standardized TEXT, lookup_data_search TEXT, lookup_data_label TEXT, needs_gaia_ids_resolved INT DEFAULT (1), is_hangouts_user INT DEFAULT (0), gaia_id TEXT, avatar_url TEXT, display_name TEXT, last_checked_ts INT DEFAULT (0), detail_logging_id TEXT, detail_affinity_score REAL DEFAULT (0.0), FOREIGN KEY (merged_contact_id) REFERENCES merged_contacts(_id) ON DELETE CASCADE ON UPDATE CASCADE);"};
    }

    public static String[] c() {
        return new String[]{b, c, d, e};
    }

    private static String a(String str) {
        String valueOf = String.valueOf("IFNULL(merged_contact_details.");
        return new StringBuilder((String.valueOf(valueOf).length() + 5) + String.valueOf(str).length()).append(valueOf).append(str).append(", '')").toString();
    }

    public static String[] d() {
        return new String[]{"merged_contacts_with_details", "search_merged_contacts_with_details_by_display_name", "search_merged_contacts_with_details_by_email", "search_merged_contacts_with_details_by_phone_number"};
    }
}
