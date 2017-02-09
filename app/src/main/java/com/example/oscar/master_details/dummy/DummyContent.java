package com.example.oscar.master_details.dummy;

import com.example.oscar.master_details.ItemListActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        /*for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }*/
    }

    public static void rellenar(){
        ArrayList<Telefonos> array = ItemListActivity.arrayTelefonos ;
        ITEMS.clear();
        ITEM_MAP.clear();
        for(int i=0; i<array.size(); i++){
            addItem(new DummyItem(i + "", array.get(i).getMarca(), array.get(i).getModelo(), array.get(i).getUrlImagen()));
        }

    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /*private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }*/

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String marca;
        public final String modelo;
        public final String urlImagen;

        public DummyItem(String id, String marca, String modelo, String urlImagen) {
            this.id = id;
            this.marca = marca;
            this.modelo = modelo;
            this.urlImagen=urlImagen;
        }

        @Override
        public String toString() {
            return marca;
        }
    }
}