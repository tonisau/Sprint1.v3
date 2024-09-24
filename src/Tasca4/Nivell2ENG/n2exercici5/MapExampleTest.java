package Tasca4.Nivell2ENG.n2exercici5;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MapExampleTest {

    @Test
    public void testMapContainsKey() {
        MapExample mapExample = new MapExample();
        Map<String, Integer> map = mapExample.createMap();

        // Verifica que el map conté la clau "key2"
        assertTrue(map.containsKey("key2"), "The map should contain the key 'key2'.");
    }
}
