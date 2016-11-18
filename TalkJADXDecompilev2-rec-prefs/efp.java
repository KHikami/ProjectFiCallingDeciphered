package p000;

import java.util.ArrayList;
import java.util.List;

final class efp extends efn {
    public efp(List<String> list) {
        super(list);
    }

    public String mo1864a() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.a.size(); i++) {
            if (i > 0) {
                stringBuilder.append(" UNION ");
            }
            stringBuilder.append("select null AS conversation_id, null AS gaia_id, rowid AS _id, full_name,  null AS lookup_data, null AS name, ? AS term,  0 AS cn_match, 1 AS pn_match, 0 AS pe_match  FROM participants_fts WHERE participants_fts.full_name MATCH ?");
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
