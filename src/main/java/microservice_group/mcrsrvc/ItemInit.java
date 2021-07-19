package microservice_group.mcrsrvc;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit
{
    public static final DeferredRegister<Item> item_register = DeferredRegister.create(ForgeRegistries.ITEMS, Mcrsrvc.MOD_ID);

    public static final RegistryObject<Item> silicon_fragment = item_register.register("silicon_fragment",
            () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> silicon = item_register.register("silicon",
            () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> sand_dust = item_register.register("dust",
            () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> lithium_battery = item_register.register("lithium_battery",
            () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> circuit = item_register.register("circuit",
            () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    //--------------------------------------------------[ BLOCKITEMS ]--------------------------------------------------

    public static final RegistryObject<BlockItem> lithium_ore = item_register.register("lithium_ore",
            () -> new BlockItem(BlockInit.lithium_ore.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
}
