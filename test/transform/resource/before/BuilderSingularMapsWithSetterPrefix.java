//FORMAT: javaLangAsFQN = skip
//FORMAT: generated = skip
//FORMAT: finalParams = skip
//CONF: lombok.singular.nullCollections = ignore
import java.util.Map;
import java.util.SortedMap;

import lombok.Singular;

@lombok.Builder(setterPrefix = "with")
class BuilderSingularMapsWithSetterPrefix<K, V> {
	@Singular private Map<K, V> women;
	@Singular private SortedMap<K, ? extends Number> men;
	@SuppressWarnings("all") @Singular("rawMap") private Map rawMap;
	@Singular("stringMap") private Map<String, V> stringMap;
}
