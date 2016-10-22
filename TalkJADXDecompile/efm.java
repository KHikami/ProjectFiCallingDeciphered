import java.util.List;
import java.util.Locale;

public final class efm {
    public static final int a;
    public static final int b;
    public static final int c;
    public static final int d;
    private static final String e;
    private static final String f;

    static {
        int length = dbi.a.length;
        a = length;
        b = length + 1;
        c = a + 2;
        d = a + 3;
        String valueOf = String.valueOf(a(true));
        e = new StringBuilder(String.valueOf(valueOf).length() + 666).append("SELECT ").append(valueOf).append(", match_names, cn_match, pn_match, pe_match  FROM conversations_view cv INNER JOIN  (SELECT conversation_id, GROUP_CONCAT(match_name, \",\") as match_names,       max(name) AS group_name,       SUM(cn_match) AS cn_match, SUM(pn_match) AS pn_match, SUM(pe_match) AS pe_match   FROM     (SELECT cpv.conversation_id, cpv.gaia_id,          max(CASE WHEN  lookup_data IS NULL THEN per_term_match.full_name ELSE              cpv.full_name || ' (' ||  lookup_data || ')' END) AS match_name, name,              SUM(cn_match) AS cn_match, SUM(pn_match) AS pn_match,              SUM(pe_match) AS pe_match       FROM  conversation_participants_view cpv INNER JOIN      ( ").toString();
        valueOf = String.valueOf(a(true));
        f = new StringBuilder(String.valueOf(valueOf).length() + 731).append("SELECT ").append(valueOf).append(", match_names, cn_match, pn_match, pe_match  FROM conversations_view cv INNER JOIN  (SELECT conversation_id, GROUP_CONCAT(match_name, \",\") AS match_names,       MAX(name) AS group_name, GROUP_CONCAT(term, ',') AS terms,       SUM(cn_match) AS cn_match, SUM(pn_match) AS pn_match, SUM(pe_match) AS pe_match   FROM     (SELECT cpv.conversation_id, cpv.gaia_id,          MAX(CASE WHEN  lookup_data IS NULL THEN per_term_match.full_name ELSE              cpv.full_name || ' (' ||  lookup_data || ')' END) AS match_name, name,             GROUP_CONCAT(term, ',') AS term, SUM(cn_match) AS cn_match,              SUM(pn_match) AS pn_match, SUM(pe_match) AS pe_match      FROM  conversation_participants_view cpv inner join      ( ").toString();
    }

    public static String a(List<String> list, List<String> list2) {
        if (list.size() == 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(e);
            a(stringBuilder, list, list2);
            stringBuilder.append(" UNION ");
            b(stringBuilder, list, list2);
            stringBuilder.append(" UNION ");
            c(stringBuilder, list, list2);
            stringBuilder.append("   ) AS per_term_match    ON cpv.conversation_id = per_term_match.conversation_id       OR cpv.gaia_id = per_term_match.gaia_id       OR cpv._id = per_term_match._id    GROUP BY cpv.conversation_id, cpv.gaia_id)  GROUP BY conversation_id ) AS final_match  ON final_match.conversation_id = cv.conversation_id    WHERE cv.conversation_type = 2    AND (cv.is_pending_leave >= 0 OR cv.is_pending_leave IS NULL)    AND (cv.view = 1        OR cv.view = 2)    ORDER BY invite_time_aggregate DESC, call_media_type DESC,sort_timestamp DESC; ");
            return stringBuilder.toString();
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(f);
        a(stringBuilder, list, list2);
        stringBuilder.append(" UNION ");
        b(stringBuilder, list, list2);
        stringBuilder.append(" UNION ");
        c(stringBuilder, list, list2);
        stringBuilder.append("   ) AS per_term_match    ON cpv.conversation_id = per_term_match.conversation_id       OR cpv.gaia_id = per_term_match.gaia_id       OR cpv._id = per_term_match._id    GROUP BY cpv.conversation_id, cpv.gaia_id)  GROUP BY conversation_id ");
        d(stringBuilder, list, list2);
        stringBuilder.append(" ) AS final_match  ON final_match.conversation_id = cv.conversation_id    WHERE cv.conversation_type = 2    AND (cv.is_pending_leave >= 0 OR cv.is_pending_leave IS NULL)    AND (cv.view = 1        OR cv.view = 2)    ORDER BY invite_time_aggregate DESC, call_media_type DESC,sort_timestamp DESC; ");
        return stringBuilder.toString();
    }

    private static void a(StringBuilder stringBuilder, List<String> list, List<String> list2) {
        efn efn = new efn(list, (byte) 0);
        stringBuilder.append(efn.a());
        list2.addAll(efn.b());
    }

    private static void b(StringBuilder stringBuilder, List<String> list, List<String> list2) {
        efp efp = new efp(list);
        stringBuilder.append(efp.a());
        list2.addAll(efp.b());
    }

    private static void c(StringBuilder stringBuilder, List<String> list, List<String> list2) {
        efo efo = new efo(list);
        stringBuilder.append(efo.a());
        list2.addAll(efo.b());
    }

    private static void d(StringBuilder stringBuilder, List<String> list, List<String> list2) {
        stringBuilder.append("HAVING ");
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                stringBuilder.append(" AND ");
            }
            stringBuilder.append(" terms LIKE '%%' || ? || '%%' ");
            list2.add(((String) list.get(i)).toUpperCase(Locale.US));
        }
    }

    private static String a(boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        Object obj = 1;
        for (String str : dbi.a) {
            if (obj != null) {
                obj = null;
            } else {
                stringBuilder.append(",");
            }
            if (str.equals("_id")) {
                stringBuilder.append("cv.");
            }
            if (str.equals("conversation_id")) {
                stringBuilder.append("cv.");
            }
            if (str.equals("blocked")) {
                stringBuilder.append("cv.");
            }
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }
}
