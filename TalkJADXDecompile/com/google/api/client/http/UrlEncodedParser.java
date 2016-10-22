package com.google.api.client.http;

import bc;
import com.google.api.client.util.GenericData;
import gwb;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kfb;
import kfh;
import kfi;
import kfm;
import kfu;
import kgh;
import kgr;

public class UrlEncodedParser implements kgh {
    public static final String CONTENT_TYPE = "application/x-www-form-urlencoded";
    public static final String MEDIA_TYPE;

    static {
        MEDIA_TYPE = new HttpMediaType(CONTENT_TYPE).setCharsetParameter(kfh.a).build();
    }

    public static void parse(String str, Object obj) {
        if (str != null) {
            try {
                parse(new StringReader(str), obj);
            } catch (Throwable e) {
                throw gwb.a(e);
            }
        }
    }

    public static void parse(Reader reader, Object obj) {
        Map map;
        Class cls = obj.getClass();
        kfi a = kfi.a(cls);
        List asList = Arrays.asList(new Type[]{cls});
        GenericData genericData = GenericData.class.isAssignableFrom(cls) ? (GenericData) obj : null;
        if (Map.class.isAssignableFrom(cls)) {
            map = (Map) obj;
        } else {
            map = null;
        }
        kfb kfb = new kfb(obj);
        StringWriter stringWriter = new StringWriter();
        StringWriter stringWriter2 = new StringWriter();
        int i = 1;
        while (true) {
            int read = reader.read();
            switch (read) {
                case -1:
                case 38:
                    String a2 = kgr.a(stringWriter.toString());
                    if (a2.length() != 0) {
                        String a3 = kgr.a(stringWriter2.toString());
                        kfu a4 = a.a(a2);
                        if (a4 != null) {
                            Type a5 = kfm.a(asList, a4.c());
                            if (gwb.a(a5)) {
                                Object a6 = gwb.a(asList, gwb.b(a5));
                                kfb.a(a4.a(), a6, parseValue(a6, asList, a3));
                            } else if (gwb.a(gwb.a(asList, a5), Iterable.class)) {
                                Collection collection = (Collection) a4.a(obj);
                                if (collection == null) {
                                    collection = kfm.b(a5);
                                    a4.a(obj, (Object) collection);
                                }
                                collection.add(parseValue(a5 == Object.class ? null : gwb.c(a5), asList, a3));
                            } else {
                                a4.a(obj, parseValue(a5, asList, a3));
                            }
                        } else if (map != null) {
                            ArrayList arrayList = (ArrayList) map.get(a2);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                if (genericData != null) {
                                    genericData.set(a2, arrayList);
                                } else {
                                    map.put(a2, arrayList);
                                }
                            }
                            arrayList.add(a3);
                        }
                    }
                    stringWriter = new StringWriter();
                    stringWriter2 = new StringWriter();
                    if (read != -1) {
                        i = 1;
                        break;
                    } else {
                        kfb.a();
                        return;
                    }
                case 61:
                    i = 0;
                    break;
                default:
                    if (i == 0) {
                        stringWriter2.write(read);
                        break;
                    } else {
                        stringWriter.write(read);
                        break;
                    }
            }
        }
    }

    private static Object parseValue(Type type, List<Type> list, String str) {
        return kfm.a(kfm.a((List) list, type), str);
    }

    public <T> T parseAndClose(InputStream inputStream, Charset charset, Class<T> cls) {
        return parseAndClose(new InputStreamReader(inputStream, charset), (Class) cls);
    }

    public Object parseAndClose(InputStream inputStream, Charset charset, Type type) {
        return parseAndClose(new InputStreamReader(inputStream, charset), type);
    }

    public <T> T parseAndClose(Reader reader, Class<T> cls) {
        return parseAndClose(reader, (Type) cls);
    }

    public Object parseAndClose(Reader reader, Type type) {
        bc.a(type instanceof Class, (Object) "dataType has to be of type Class<?>");
        Object b = gwb.b((Class) type);
        parse(new BufferedReader(reader), b);
        return b;
    }
}
