package com.google.api.client.http;

import bc;
import gwb;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import kfm;
import kfu;
import kgr;
import mfq;

public class UriTemplate {
    private static final String COMPOSITE_NON_EXPLODE_JOINER = ",";
    static final Map<Character, CompositeOutput> COMPOSITE_PREFIXES;

    enum CompositeOutput {
        PLUS(Character.valueOf('+'), "", UriTemplate.COMPOSITE_NON_EXPLODE_JOINER, false, true),
        HASH(Character.valueOf('#'), "#", UriTemplate.COMPOSITE_NON_EXPLODE_JOINER, false, true),
        DOT(Character.valueOf('.'), ".", ".", false, false),
        FORWARD_SLASH(Character.valueOf('/'), "/", "/", false, false),
        SEMI_COLON(Character.valueOf(';'), ";", ";", true, false),
        QUERY(Character.valueOf('?'), "?", "&", true, false),
        AMP(Character.valueOf('&'), "&", "&", true, false),
        SIMPLE(null, "", UriTemplate.COMPOSITE_NON_EXPLODE_JOINER, false, false);
        
        private final String explodeJoiner;
        private final String outputPrefix;
        private final Character propertyPrefix;
        private final boolean requiresVarAssignment;
        private final boolean reservedExpansion;

        private CompositeOutput(Character ch, String str, String str2, boolean z, boolean z2) {
            this.propertyPrefix = ch;
            this.outputPrefix = (String) bc.a((Object) str);
            this.explodeJoiner = (String) bc.a((Object) str2);
            this.requiresVarAssignment = z;
            this.reservedExpansion = z2;
            if (ch != null) {
                UriTemplate.COMPOSITE_PREFIXES.put(ch, this);
            }
        }

        String getOutputPrefix() {
            return this.outputPrefix;
        }

        String getExplodeJoiner() {
            return this.explodeJoiner;
        }

        boolean requiresVarAssignment() {
            return this.requiresVarAssignment;
        }

        int getVarNameStartIndex() {
            return this.propertyPrefix == null ? 0 : 1;
        }

        String getEncodedValue(String str) {
            if (this.reservedExpansion) {
                return kgr.b.a(str);
            }
            return kgr.a.a(str);
        }

        boolean getReservedExpansion() {
            return this.reservedExpansion;
        }
    }

    static {
        COMPOSITE_PREFIXES = new HashMap();
        CompositeOutput.values();
    }

    static CompositeOutput getCompositeOutput(String str) {
        CompositeOutput compositeOutput = (CompositeOutput) COMPOSITE_PREFIXES.get(Character.valueOf(str.charAt(0)));
        return compositeOutput == null ? CompositeOutput.SIMPLE : compositeOutput;
    }

    private static Map<String, Object> getMap(Object obj) {
        Map<String, Object> linkedHashMap = new LinkedHashMap();
        for (Entry entry : kfm.b(obj).entrySet()) {
            Object value = entry.getValue();
            if (!(value == null || kfm.a(value))) {
                linkedHashMap.put((String) entry.getKey(), value);
            }
        }
        return linkedHashMap;
    }

    public static String expand(String str, String str2, Object obj, boolean z) {
        String valueOf;
        String valueOf2;
        if (str2.startsWith("/")) {
            GenericUrl genericUrl = new GenericUrl(str);
            genericUrl.setRawPath(null);
            valueOf2 = String.valueOf(genericUrl.build());
            valueOf = String.valueOf(str2);
            valueOf = valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2);
        } else {
            if (!(str2.startsWith("http://") || str2.startsWith("https://"))) {
                valueOf = String.valueOf(str);
                valueOf2 = String.valueOf(str2);
                str2 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            }
            valueOf = str2;
        }
        return expand(valueOf, obj, z);
    }

    public static String expand(String str, Object obj, boolean z) {
        Map map = getMap(obj);
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        int length = str.length();
        while (i < length) {
            int indexOf = str.indexOf(123, i);
            if (indexOf != -1) {
                stringBuilder.append(str.substring(i, indexOf));
                i = str.indexOf(125, indexOf + 2);
                int i2 = i + 1;
                CharSequence substring = str.substring(indexOf + 1, i);
                CompositeOutput compositeOutput = getCompositeOutput(substring);
                ListIterator listIterator = mfq.a(',').a(substring).listIterator();
                Object obj2 = 1;
                while (listIterator.hasNext()) {
                    String str2 = (String) listIterator.next();
                    boolean endsWith = str2.endsWith("*");
                    int varNameStartIndex = listIterator.nextIndex() == 1 ? compositeOutput.getVarNameStartIndex() : 0;
                    int length2 = str2.length();
                    if (endsWith) {
                        length2--;
                    }
                    String substring2 = str2.substring(varNameStartIndex, length2);
                    Object remove = map.remove(substring2);
                    if (remove != null) {
                        Object obj3;
                        if (obj2 == null) {
                            stringBuilder.append(compositeOutput.getExplodeJoiner());
                            obj3 = obj2;
                        } else {
                            stringBuilder.append(compositeOutput.getOutputPrefix());
                            obj3 = null;
                        }
                        if (remove instanceof Iterator) {
                            remove = getListPropertyValue(substring2, (Iterator) remove, endsWith, compositeOutput);
                        } else if ((remove instanceof Iterable) || remove.getClass().isArray()) {
                            remove = getListPropertyValue(substring2, gwb.M(remove).iterator(), endsWith, compositeOutput);
                        } else if (remove.getClass().isEnum()) {
                            if (kfu.a((Enum) remove).b() != null) {
                                if (compositeOutput.requiresVarAssignment()) {
                                    remove = String.format("%s=%s", new Object[]{substring2, remove});
                                }
                                remove = kgr.b.a(remove.toString());
                            }
                        } else if (kfm.d(remove)) {
                            if (compositeOutput.requiresVarAssignment()) {
                                remove = String.format("%s=%s", new Object[]{substring2, remove});
                            }
                            if (compositeOutput.getReservedExpansion()) {
                                remove = kgr.c.a(remove.toString());
                            } else {
                                remove = kgr.b.a(remove.toString());
                            }
                        } else {
                            remove = getMapPropertyValue(substring2, getMap(remove), endsWith, compositeOutput);
                        }
                        stringBuilder.append(remove);
                        obj2 = obj3;
                    }
                }
                i = i2;
            } else if (i == 0 && !z) {
                return str;
            } else {
                stringBuilder.append(str.substring(i));
                if (z) {
                    GenericUrl.addQueryParams(map.entrySet(), stringBuilder);
                }
                return stringBuilder.toString();
            }
        }
        if (z) {
            GenericUrl.addQueryParams(map.entrySet(), stringBuilder);
        }
        return stringBuilder.toString();
    }

    private static String getListPropertyValue(String str, Iterator<?> it, boolean z, CompositeOutput compositeOutput) {
        if (!it.hasNext()) {
            return "";
        }
        String explodeJoiner;
        StringBuilder stringBuilder = new StringBuilder();
        if (z) {
            explodeJoiner = compositeOutput.getExplodeJoiner();
        } else {
            explodeJoiner = COMPOSITE_NON_EXPLODE_JOINER;
            if (compositeOutput.requiresVarAssignment()) {
                stringBuilder.append(kgr.b.a(str));
                stringBuilder.append("=");
            }
        }
        while (it.hasNext()) {
            if (z && compositeOutput.requiresVarAssignment()) {
                stringBuilder.append(kgr.b.a(str));
                stringBuilder.append("=");
            }
            stringBuilder.append(compositeOutput.getEncodedValue(it.next().toString()));
            if (it.hasNext()) {
                stringBuilder.append(explodeJoiner);
            }
        }
        return stringBuilder.toString();
    }

    private static String getMapPropertyValue(String str, Map<String, Object> map, boolean z, CompositeOutput compositeOutput) {
        if (map.isEmpty()) {
            return "";
        }
        String str2;
        String explodeJoiner;
        StringBuilder stringBuilder = new StringBuilder();
        if (z) {
            str2 = "=";
            explodeJoiner = compositeOutput.getExplodeJoiner();
        } else {
            String str3 = COMPOSITE_NON_EXPLODE_JOINER;
            String str4 = COMPOSITE_NON_EXPLODE_JOINER;
            if (compositeOutput.requiresVarAssignment()) {
                stringBuilder.append(kgr.b.a(str));
                stringBuilder.append("=");
            }
            str2 = str4;
            explodeJoiner = str3;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            str3 = compositeOutput.getEncodedValue((String) entry.getKey());
            str4 = compositeOutput.getEncodedValue(entry.getValue().toString());
            stringBuilder.append(str3);
            stringBuilder.append(str2);
            stringBuilder.append(str4);
            if (it.hasNext()) {
                stringBuilder.append(explodeJoiner);
            }
        }
        return stringBuilder.toString();
    }
}
