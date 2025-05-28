package stage02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import stage02.main.Test03_UnmodifiableCollections;

import java.util.HashMap;
import java.util.Map;

public class Test03_UnmodifiableCollectionsTest {

    static Map<String, Integer> modifiableMap;
    @BeforeAll
    public static void star(){
        modifiableMap = new HashMap<>();
        modifiableMap.put("Ключ 1", 1991);
        modifiableMap.put("Ключ 2", 1992);
        modifiableMap.put("Ключ 3", 1994);
    }

    @Test
    public void testPut(){
        Map<String, Integer> unmodifiableMap = Test03_UnmodifiableCollections.unmodifiableGrades(modifiableMap);
        Assertions.assertThrows(UnsupportedOperationException.class, ()->{
            unmodifiableMap.put("Ключ 4", 1991);
        });
    }
    @Test
    public void testRemove(){
        Map<String, Integer> unmodifiableMap = Test03_UnmodifiableCollections.unmodifiableGrades(modifiableMap);
        Assertions.assertThrows(UnsupportedOperationException.class, ()->{
            unmodifiableMap.remove("Ключ 4", 1991);
        });
    }

    @Test
    public void testMain() {
        Test03_UnmodifiableCollections.testUnmodifiableGrades();
    }
}
