package P11_depoYonetimi;

import java.util.HashMap;
import java.util.Map;

public class item extends islemler {

    item itm = new item();
    static Map<Integer, String> itemMap = new HashMap<>();

    public item() {
        itemMap.put(1000, "un hekimoglu 0 cuval 1");
        itemMap.put(1001, "yag  yudum 2 kg 2");
        itemMap.put(1002, "seker tatlim 0 kg 3");
        itemMap.put(1003, "tuz billur 0 kg 4");

    }
}
