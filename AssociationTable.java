/*
 * This class that implements a generic associative table
 * Last update - 04/12/23
 */

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class AssociationTable<K extends Comparable<K>, V> {

    private TreeMap<K, V> treemap;

    // Contrustors
    public AssociationTable() {
        treemap = new TreeMap<K, V>();
    }

    public AssociationTable(K[] keys, V[] vals) throws IllegalArgumentException {
        if (keys.length != vals.length) {
            throw new IllegalArgumentException("Error - The length of the arrays is not equal");
        }

        treemap = new TreeMap<K, V>();

        for (int i = 0; i < keys.length; i++) {
            treemap.put(keys[i], vals[i]);
        }
    }

    // Receives a key and a value and adds to the table
    public void add(K key, V val) {
        treemap.put(key, val);
    }

    // Receives a key and returns the value associated with the received key
    public V get(K key) {
        if (!treemap.containsKey(key))
            return null;
        return treemap.get(key);
    }

    // Checks whether a certain key is in the table
    public boolean contains(K key) {
        if (treemap.containsKey(key)) {
            return true;
        }
        return false;

    }

    // Removes members from the table
    public boolean remove(K key) {
        if (contains(key)) {
            treemap.remove(key);
            return true;
        }
        return false;
    }

    // Returns the number of members in the table
    public int size() {
        return treemap.size();
    }

    public Iterator<Map.Entry<K, V>> keyIterator() {
        return treemap.entrySet().iterator();
    }
}