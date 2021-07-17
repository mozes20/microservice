package microservice_group.mcrsrvc;

import net.minecraft.item.Item;

public class SiliconFragment extends Item
{
    String name = "Silicon Fragment";

    public SiliconFragment(Properties properties) {
        super(properties);
    }

    public String getItemName()
    {
        return this.name;
    }
}
