package microservice_group.mcrsrvc;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit
{
    public static final DeferredRegister<Block> block_register = DeferredRegister.create(ForgeRegistries.BLOCKS, Mcrsrvc.MOD_ID);

    public static final RegistryObject<Block> lithium_ore = block_register.register("lithium_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.GRAY).hardnessAndResistance(15f, 30f)
            .harvestTool(ToolType.PICKAXE)
            .harvestLevel(3)));
}
