package p000;

import java.util.ArrayList;
import java.util.List;

final class efo extends efn {
    public efo(List<String> list) {
        super(list);
    }

    public String mo1864a() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.a.size(); i++) {
            if (i > 0) {
                stringBuilder.append(" UNION ");
            }
            stringBuilder.append("SELECT null AS convesration_id, gaia_id AS gaia_id, null AS _id, null AS full_name,  lookup_data, null AS name, ? AS term, 0 AS cn_match, 0 AS pn_match, 1 AS pe_match  FROM participant_email_fts WHERE participant_email_fts.lookup_data MATCH ?");
        }
        return stringBuilder.toString();
    }

    public List<String> mo1865b() {
        List<String> arrayList = new ArrayList();
        for (String str : this.a) {
            arrayList.add(str);
            arrayList.add(new StringBuilder(String.valueOf(str).length() + 3).append("'").append(str).append("*'").toString());
        }
        return arrayList;
    }
}
