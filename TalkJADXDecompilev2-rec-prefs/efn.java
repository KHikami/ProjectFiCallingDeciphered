package p000;

import java.util.List;

class efn {
    final List<String> f11380a;

    public efn(List<String> list) {
        this.f11380a = list;
    }

    public efn(List<String> list, byte b) {
        this(list);
    }

    public String mo1864a() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" SELECT conversation_id, null AS gaia_id, null AS _id, null AS full_name,  null AS lookup_data, name, name AS term,  1 AS cn_match, 0 AS pn_match, 0 AS pe_match  FROM conversations_view WHERE ");
        for (int i = 0; i < this.f11380a.size(); i++) {
            if (i != 0) {
                stringBuilder.append(" OR ");
            }
            stringBuilder.append(" name LIKE '%%' || ? || '%%' ");
        }
        return stringBuilder.toString();
    }

    public List<String> mo1865b() {
        return this.f11380a;
    }
}
