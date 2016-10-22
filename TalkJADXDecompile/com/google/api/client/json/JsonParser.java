package com.google.api.client.json;

import bc;
import com.google.api.client.json.JsonPolymorphicTypeMap.TypeDef;
import com.google.api.client.util.GenericData;
import gwb;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kfi;
import kfm;
import kfu;
import wi;

public abstract class JsonParser {
    private static WeakHashMap<Class<?>, Field> cachedTypemapFields;
    private static final Lock lock;

    /* synthetic */ class 1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$api$client$json$JsonToken;

        static {
            $SwitchMap$com$google$api$client$json$JsonToken = new int[JsonToken.values().length];
            try {
                $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.START_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.START_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.END_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.FIELD_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.END_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.VALUE_TRUE.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
            try {
                $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.VALUE_STRING.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
            }
            try {
                $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.VALUE_NULL.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
            }
        }
    }

    public abstract void close();

    public abstract BigInteger getBigIntegerValue();

    public abstract byte getByteValue();

    public abstract String getCurrentName();

    public abstract JsonToken getCurrentToken();

    public abstract BigDecimal getDecimalValue();

    public abstract double getDoubleValue();

    public abstract JsonFactory getFactory();

    public abstract float getFloatValue();

    public abstract int getIntValue();

    public abstract long getLongValue();

    public abstract short getShortValue();

    public abstract String getText();

    public abstract JsonToken nextToken();

    public abstract JsonParser skipChildren();

    static {
        cachedTypemapFields = new WeakHashMap();
        lock = new ReentrantLock();
    }

    public final <T> T parseAndClose(Class<T> cls) {
        return parseAndClose((Class) cls, null);
    }

    public final <T> T parseAndClose(Class<T> cls, CustomizeJsonParser customizeJsonParser) {
        try {
            T parse = parse((Class) cls, customizeJsonParser);
            return parse;
        } finally {
            close();
        }
    }

    public final void skipToKey(String str) {
        skipToKey(Collections.singleton(str));
    }

    public final String skipToKey(Set<String> set) {
        JsonToken startParsingObjectOrArray = startParsingObjectOrArray();
        while (startParsingObjectOrArray == JsonToken.FIELD_NAME) {
            String text = getText();
            nextToken();
            if (set.contains(text)) {
                return text;
            }
            skipChildren();
            startParsingObjectOrArray = nextToken();
        }
        return null;
    }

    private JsonToken startParsing() {
        JsonToken nextToken;
        JsonToken currentToken = getCurrentToken();
        if (currentToken == null) {
            nextToken = nextToken();
        } else {
            nextToken = currentToken;
        }
        bc.a(nextToken != null, (Object) "no JSON input found");
        return nextToken;
    }

    private JsonToken startParsingObjectOrArray() {
        JsonToken startParsing = startParsing();
        switch (1.$SwitchMap$com$google$api$client$json$JsonToken[startParsing.ordinal()]) {
            case wi.j /*1*/:
                JsonToken nextToken = nextToken();
                boolean z = nextToken == JsonToken.FIELD_NAME || nextToken == JsonToken.END_OBJECT;
                bc.a(z, (Object) nextToken);
                return nextToken;
            case wi.l /*2*/:
                return nextToken();
            default:
                return startParsing;
        }
    }

    public final void parseAndClose(Object obj) {
        parseAndClose(obj, null);
    }

    public final void parseAndClose(Object obj, CustomizeJsonParser customizeJsonParser) {
        try {
            parse(obj, customizeJsonParser);
        } finally {
            close();
        }
    }

    public final <T> T parse(Class<T> cls) {
        return parse((Class) cls, null);
    }

    public final <T> T parse(Class<T> cls, CustomizeJsonParser customizeJsonParser) {
        return parse((Type) cls, false, customizeJsonParser);
    }

    public Object parse(Type type, boolean z) {
        return parse(type, z, null);
    }

    public Object parse(Type type, boolean z, CustomizeJsonParser customizeJsonParser) {
        try {
            if (!Void.class.equals(type)) {
                startParsing();
            }
            Object parseValue = parseValue(null, type, new ArrayList(), null, customizeJsonParser, true);
            return parseValue;
        } finally {
            if (z) {
                close();
            }
        }
    }

    public final void parse(Object obj) {
        parse(obj, null);
    }

    public final void parse(Object obj, CustomizeJsonParser customizeJsonParser) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj.getClass());
        parse(arrayList, obj, customizeJsonParser);
    }

    private void parse(ArrayList<Type> arrayList, Object obj, CustomizeJsonParser customizeJsonParser) {
        if (obj instanceof GenericJson) {
            ((GenericJson) obj).setFactory(getFactory());
        }
        JsonToken startParsingObjectOrArray = startParsingObjectOrArray();
        Type type = obj.getClass();
        kfi a = kfi.a((Class) type);
        boolean isAssignableFrom = GenericData.class.isAssignableFrom(type);
        if (isAssignableFrom || !Map.class.isAssignableFrom(type)) {
            while (startParsingObjectOrArray == JsonToken.FIELD_NAME) {
                String text = getText();
                nextToken();
                if (customizeJsonParser == null || !customizeJsonParser.stopAt(obj, text)) {
                    kfu a2 = a.a(text);
                    if (a2 != null) {
                        if (!a2.d() || a2.e()) {
                            Field a3 = a2.a();
                            int size = arrayList.size();
                            arrayList.add(a3.getGenericType());
                            Object parseValue = parseValue(a3, a2.c(), arrayList, obj, customizeJsonParser, true);
                            arrayList.remove(size);
                            a2.a(obj, parseValue);
                        } else {
                            throw new IllegalArgumentException("final array/object fields are not supported");
                        }
                    } else if (isAssignableFrom) {
                        ((GenericData) obj).set(text, parseValue(null, null, arrayList, obj, customizeJsonParser, true));
                    } else {
                        if (customizeJsonParser != null) {
                            customizeJsonParser.handleUnrecognizedKey(obj, text);
                        }
                        skipChildren();
                    }
                    startParsingObjectOrArray = nextToken();
                } else {
                    return;
                }
            }
            return;
        }
        parseMap(null, (Map) obj, gwb.d(type), arrayList, customizeJsonParser);
    }

    public final <T> Collection<T> parseArrayAndClose(Class<?> cls, Class<T> cls2) {
        return parseArrayAndClose((Class) cls, (Class) cls2, null);
    }

    public final <T> Collection<T> parseArrayAndClose(Class<?> cls, Class<T> cls2, CustomizeJsonParser customizeJsonParser) {
        try {
            Collection<T> parseArray = parseArray((Class) cls, (Class) cls2, customizeJsonParser);
            return parseArray;
        } finally {
            close();
        }
    }

    public final <T> void parseArrayAndClose(Collection<? super T> collection, Class<T> cls) {
        parseArrayAndClose((Collection) collection, (Class) cls, null);
    }

    public final <T> void parseArrayAndClose(Collection<? super T> collection, Class<T> cls, CustomizeJsonParser customizeJsonParser) {
        try {
            parseArray((Collection) collection, (Class) cls, customizeJsonParser);
        } finally {
            close();
        }
    }

    public final <T> Collection<T> parseArray(Class<?> cls, Class<T> cls2) {
        return parseArray((Class) cls, (Class) cls2, null);
    }

    public final <T> Collection<T> parseArray(Class<?> cls, Class<T> cls2, CustomizeJsonParser customizeJsonParser) {
        Collection b = kfm.b((Type) cls);
        parseArray(b, (Class) cls2, customizeJsonParser);
        return b;
    }

    public final <T> void parseArray(Collection<? super T> collection, Class<T> cls) {
        parseArray((Collection) collection, (Class) cls, null);
    }

    public final <T> void parseArray(Collection<? super T> collection, Class<T> cls, CustomizeJsonParser customizeJsonParser) {
        parseArray(null, collection, cls, new ArrayList(), customizeJsonParser);
    }

    private <T> void parseArray(Field field, Collection<T> collection, Type type, ArrayList<Type> arrayList, CustomizeJsonParser customizeJsonParser) {
        JsonToken startParsingObjectOrArray = startParsingObjectOrArray();
        while (startParsingObjectOrArray != JsonToken.END_ARRAY) {
            collection.add(parseValue(field, type, arrayList, collection, customizeJsonParser, true));
            startParsingObjectOrArray = nextToken();
        }
    }

    private void parseMap(Field field, Map<String, Object> map, Type type, ArrayList<Type> arrayList, CustomizeJsonParser customizeJsonParser) {
        JsonToken startParsingObjectOrArray = startParsingObjectOrArray();
        while (startParsingObjectOrArray == JsonToken.FIELD_NAME) {
            String text = getText();
            nextToken();
            if (customizeJsonParser == null || !customizeJsonParser.stopAt(map, text)) {
                map.put(text, parseValue(field, type, arrayList, map, customizeJsonParser, true));
                startParsingObjectOrArray = nextToken();
            } else {
                return;
            }
        }
    }

    private final Object parseValue(Field field, Type type, ArrayList<Type> arrayList, Object obj, CustomizeJsonParser customizeJsonParser, boolean z) {
        StringBuilder stringBuilder;
        Type a = kfm.a((List) arrayList, type);
        Class cls = a instanceof Class ? (Class) a : null;
        if (a instanceof ParameterizedType) {
            cls = gwb.a((ParameterizedType) a);
        }
        if (cls == Void.class) {
            skipChildren();
            return null;
        }
        String toLowerCase;
        JsonToken currentToken = getCurrentToken();
        try {
            Type d;
            boolean z2;
            boolean z3;
            String valueOf;
            switch (1.$SwitchMap$com$google$api$client$json$JsonToken[getCurrentToken().ordinal()]) {
                case wi.j /*1*/:
                case wi.h /*4*/:
                case wi.p /*5*/:
                    bc.a(!gwb.a(a), "expected object or map type but got %s", a);
                    Field cachedTypemapFieldFor = z ? getCachedTypemapFieldFor(cls) : null;
                    Object obj2 = null;
                    if (!(cls == null || customizeJsonParser == null)) {
                        obj2 = customizeJsonParser.newInstanceForObject(obj, cls);
                    }
                    Object obj3 = (cls == null || !gwb.a(cls, Map.class)) ? null : 1;
                    if (cachedTypemapFieldFor != null) {
                        obj2 = new GenericJson();
                    } else if (obj2 == null) {
                        if (obj3 != null || cls == null) {
                            obj2 = kfm.b(cls);
                        } else {
                            obj2 = gwb.b(cls);
                        }
                    }
                    int size = arrayList.size();
                    if (a != null) {
                        arrayList.add(a);
                    }
                    if (!(obj3 == null || GenericData.class.isAssignableFrom(cls))) {
                        d = Map.class.isAssignableFrom(cls) ? gwb.d(a) : null;
                        if (d != null) {
                            parseMap(field, (Map) obj2, d, arrayList, customizeJsonParser);
                            return obj2;
                        }
                    }
                    parse((ArrayList) arrayList, obj2, customizeJsonParser);
                    if (a != null) {
                        arrayList.remove(size);
                    }
                    if (cachedTypemapFieldFor == null) {
                        return obj2;
                    }
                    boolean z4;
                    String str;
                    String valueOf2;
                    JsonFactory factory;
                    JsonParser createJsonParser;
                    Object obj4 = ((GenericJson) obj2).get(cachedTypemapFieldFor.getName());
                    bc.a(obj4 != null, (Object) "No value specified for @JsonPolymorphicTypeMap field");
                    String obj5 = obj4.toString();
                    Type type2 = null;
                    for (TypeDef typeDef : ((JsonPolymorphicTypeMap) cachedTypemapFieldFor.getAnnotation(JsonPolymorphicTypeMap.class)).typeDefinitions()) {
                        if (typeDef.key().equals(obj5)) {
                            type2 = typeDef.ref();
                            z4 = type2 == null;
                            str = "No TypeDef annotation found with key: ";
                            valueOf2 = String.valueOf(obj5);
                            bc.a(z4, valueOf2.length() == 0 ? str.concat(valueOf2) : new String(str));
                            factory = getFactory();
                            createJsonParser = factory.createJsonParser(factory.toString(obj2));
                            createJsonParser.startParsing();
                            return createJsonParser.parseValue(field, type2, arrayList, null, null, false);
                        }
                    }
                    if (type2 == null) {
                    }
                    str = "No TypeDef annotation found with key: ";
                    valueOf2 = String.valueOf(obj5);
                    if (valueOf2.length() == 0) {
                    }
                    bc.a(z4, valueOf2.length() == 0 ? str.concat(valueOf2) : new String(str));
                    factory = getFactory();
                    createJsonParser = factory.createJsonParser(factory.toString(obj2));
                    createJsonParser.startParsing();
                    return createJsonParser.parseValue(field, type2, arrayList, null, null, false);
                case wi.l /*2*/:
                case wi.z /*3*/:
                    Type b;
                    boolean a2 = gwb.a(a);
                    z2 = a == null || a2 || (cls != null && gwb.a(cls, Collection.class));
                    bc.a(z2, "expected collection or array type but got %s", a);
                    Collection collection = null;
                    if (!(customizeJsonParser == null || field == null)) {
                        collection = customizeJsonParser.newInstanceForArray(obj, field);
                    }
                    if (collection == null) {
                        collection = kfm.b(a);
                    }
                    if (a2) {
                        b = gwb.b(a);
                    } else if (cls == null || !Iterable.class.isAssignableFrom(cls)) {
                        b = null;
                    } else {
                        b = gwb.c(a);
                    }
                    d = kfm.a((List) arrayList, b);
                    parseArray(field, collection, d, arrayList, customizeJsonParser);
                    if (a2) {
                        return gwb.a(collection, gwb.a((List) arrayList, d));
                    }
                    return collection;
                case wi.s /*6*/:
                case wi.q /*7*/:
                    z3 = a == null || cls == Boolean.TYPE || (cls != null && cls.isAssignableFrom(Boolean.class));
                    bc.a(z3, "expected type Boolean or boolean but got %s", a);
                    return currentToken == JsonToken.VALUE_TRUE ? Boolean.TRUE : Boolean.FALSE;
                case wi.m /*8*/:
                case wi.n /*9*/:
                    z2 = field == null || field.getAnnotation(JsonString.class) == null;
                    bc.a(z2, (Object) "number type formatted as a JSON number cannot use @JsonString annotation");
                    if (cls == null || cls.isAssignableFrom(BigDecimal.class)) {
                        return getDecimalValue();
                    }
                    if (cls == BigInteger.class) {
                        return getBigIntegerValue();
                    }
                    if (cls == Double.class || cls == Double.TYPE) {
                        return Double.valueOf(getDoubleValue());
                    }
                    if (cls == Long.class || cls == Long.TYPE) {
                        return Long.valueOf(getLongValue());
                    }
                    if (cls == Float.class || cls == Float.TYPE) {
                        return Float.valueOf(getFloatValue());
                    }
                    if (cls == Integer.class || cls == Integer.TYPE) {
                        return Integer.valueOf(getIntValue());
                    }
                    if (cls == Short.class || cls == Short.TYPE) {
                        return Short.valueOf(getShortValue());
                    }
                    if (cls == Byte.class || cls == Byte.TYPE) {
                        return Byte.valueOf(getByteValue());
                    }
                    valueOf = String.valueOf(a);
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 30).append("expected numeric type but got ").append(valueOf).toString());
                case wi.dr /*10*/:
                    toLowerCase = getText().trim().toLowerCase(Locale.US);
                    if (!((cls == Float.TYPE || cls == Float.class || cls == Double.TYPE || cls == Double.class) && (toLowerCase.equals("nan") || toLowerCase.equals("infinity") || toLowerCase.equals("-infinity")))) {
                        z3 = (cls != null && Number.class.isAssignableFrom(cls) && (field == null || field.getAnnotation(JsonString.class) == null)) ? false : true;
                        bc.a(z3, (Object) "number field formatted as a JSON string must use the @JsonString annotation");
                    }
                    return kfm.a(a, getText());
                case wi.dB /*11*/:
                    z2 = cls == null || !cls.isPrimitive();
                    bc.a(z2, (Object) "primitive number field but found a JSON null");
                    if (!(cls == null || (cls.getModifiers() & 1536) == 0)) {
                        if (gwb.a(cls, Collection.class)) {
                            return kfm.a(kfm.b(a).getClass());
                        }
                        if (gwb.a(cls, Map.class)) {
                            return kfm.a(kfm.b(cls).getClass());
                        }
                    }
                    return kfm.a(gwb.a((List) arrayList, a));
                default:
                    valueOf = String.valueOf(currentToken);
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 27).append("unexpected JSON node type: ").append(valueOf).toString());
            }
        } catch (Throwable e) {
            stringBuilder = new StringBuilder();
            toLowerCase = getCurrentName();
            if (toLowerCase != null) {
                stringBuilder.append("key ").append(toLowerCase);
            }
            if (field != null) {
                if (toLowerCase != null) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append("field ").append(field);
            }
            throw new IllegalArgumentException(stringBuilder.toString(), e);
        }
        stringBuilder = new StringBuilder();
        toLowerCase = getCurrentName();
        if (toLowerCase != null) {
            stringBuilder.append("key ").append(toLowerCase);
        }
        if (field != null) {
            if (toLowerCase != null) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("field ").append(field);
        }
        throw new IllegalArgumentException(stringBuilder.toString(), e);
    }

    private static Field getCachedTypemapFieldFor(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        lock.lock();
        try {
            Field field;
            if (cachedTypemapFields.containsKey(cls)) {
                field = (Field) cachedTypemapFields.get(cls);
                return field;
            }
            Field field2 = null;
            for (kfu a : kfi.a((Class) cls).b()) {
                Field a2 = a.a();
                JsonPolymorphicTypeMap jsonPolymorphicTypeMap = (JsonPolymorphicTypeMap) a2.getAnnotation(JsonPolymorphicTypeMap.class);
                if (jsonPolymorphicTypeMap != null) {
                    boolean z;
                    bc.a(field2 == null, "Class contains more than one field with @JsonPolymorphicTypeMap annotation: %s", cls);
                    bc.a(kfm.a(a2.getType()), "Field which has the @JsonPolymorphicTypeMap, %s, is not a supported type: %s", cls, a2.getType());
                    TypeDef[] typeDefinitions = jsonPolymorphicTypeMap.typeDefinitions();
                    HashSet aO = gwb.aO();
                    if (typeDefinitions.length > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bc.a(z, (Object) "@JsonPolymorphicTypeMap must have at least one @TypeDef");
                    for (TypeDef key : typeDefinitions) {
                        bc.a(aO.add(key.key()), "Class contains two @TypeDef annotations with identical key: %s", typeDefinitions[r0].key());
                    }
                    field = a2;
                } else {
                    field = field2;
                }
                field2 = field;
            }
            cachedTypemapFields.put(cls, field2);
            lock.unlock();
            return field2;
        } finally {
            lock.unlock();
        }
    }
}
