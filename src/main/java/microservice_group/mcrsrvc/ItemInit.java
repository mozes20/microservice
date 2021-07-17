package microservice_group.mcrsrvc;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit
{
    public static final DeferredRegister<Item> item_register = DeferredRegister.create(ForgeRegistries.ITEMS, Mcrsrvc.MOD_ID);

    public static final RegistryObject<Item> silicon_fragment = item_register.register("Silicon fragment",
            () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> silicon = item_register.register("Silicon",
            () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> sand_dust = item_register.register("Sand dust",
            () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
}
