import java.util.List;

class efn {
    final List<String> a;

    public efn(List<String> list) {
        this.a = list;
    }

    public efn(List<String> list, byte b) {
        this(list);
    }

    public String a() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" SELECT conversation_id, null AS gaia_id, null AS _id, null AS full_name,  null AS lookup_data, name, name AS term,  1 AS cn_match, 0 AS pn_match, 0 AS pe_match  FROM conversations_view WHERE ");
        for (int i = 0; i < this.a.size(); i++) {
            if (i != 0) {
                stringBuilder.append(" OR ");
            }
            stringBuilder.append(" name LIKE '%%' || ? || '%%' ");
        }
        return stringBuilder.toString();
    }

    public List<String> b() {
        return this.a;
    }
}
